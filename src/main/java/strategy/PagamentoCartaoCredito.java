package strategy;

public class PagamentoCartaoCredito implements Pagamento{

    public boolean estrategiaPagamento(boolean temConta, boolean temSaldo, boolean temLimite, boolean temCartao) {
        return temConta && temCartao && temLimite;
    }
}
