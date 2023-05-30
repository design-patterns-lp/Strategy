package strategy;

public class MaquinaPagamento {

    private boolean isAuthorized;

    public boolean getAutorizacao() {
        return isAuthorized;
    }

    public void pagarPix(boolean temConta, boolean temSaldo, boolean temLimite, boolean temCartao){
        InstituicaoFinanceira instituicaoFinanceira = new InstituicaoFinanceira(temConta, temSaldo, temLimite, temCartao);
        this.isAuthorized = instituicaoFinanceira.fazPagamento(new PagamentoPix());
    }

    public void pagarCartaoCredito(boolean temConta, boolean temSaldo, boolean temLimite, boolean temCartao){
        InstituicaoFinanceira instituicaoFinanceira = new InstituicaoFinanceira(temConta, temSaldo, temLimite, temCartao);
        this.isAuthorized = instituicaoFinanceira.fazPagamento(new PagamentoCartaoCredito());
    }

    public void pagarCartaoDebito(boolean temConta, boolean temSaldo, boolean temLimite, boolean temCartao){
        InstituicaoFinanceira instituicaoFinanceira = new InstituicaoFinanceira(temConta, temSaldo, temLimite, temCartao);
        this.isAuthorized = instituicaoFinanceira.fazPagamento(new PagamentoCartaoDebito());
    }

    public void pagarTed(boolean temConta, boolean temSaldo, boolean temLimite, boolean temCartao){
        InstituicaoFinanceira instituicaoFinanceira = new InstituicaoFinanceira(temConta, temSaldo, temLimite, temCartao);
        this.isAuthorized = instituicaoFinanceira.fazPagamento(new PagamentoTed());
    }



}
