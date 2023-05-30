package strategy;

public class PagamentoPix implements Pagamento{

    public boolean estrategiaPagamento(boolean temConta, boolean temSaldo, boolean temLimite, boolean temCartao) {
        return temConta && temSaldo;
    }
}
