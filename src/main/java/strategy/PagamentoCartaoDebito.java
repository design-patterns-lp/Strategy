package strategy;

public class PagamentoCartaoDebito implements Pagamento{

    public boolean estrategiaPagamento(boolean temConta, boolean temSaldo, boolean temLimite, boolean temCartao) {
        return temConta && temCartao && temSaldo;
    }
}
