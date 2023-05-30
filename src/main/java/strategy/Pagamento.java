package strategy;

public interface Pagamento {

    boolean estrategiaPagamento(boolean temConta, boolean temSaldo, boolean temLimite, boolean temCartao);
}
