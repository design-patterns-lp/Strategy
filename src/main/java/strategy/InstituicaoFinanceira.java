package strategy;

public class InstituicaoFinanceira {

    private boolean temConta;
    private boolean temSaldo;
    private boolean temLimite;
    private boolean temCartao;

    public InstituicaoFinanceira(boolean temConta, boolean temSaldo, boolean temLimite, boolean temCartao) {
        this.temConta = temConta;
        this.temSaldo = temSaldo;
        this.temLimite = temLimite;
        this.temCartao = temCartao;
    }

    public boolean fazPagamento(Pagamento pagamento) {
        return pagamento.estrategiaPagamento(temConta, temSaldo, temLimite, temCartao);
    }
}
