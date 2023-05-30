package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaquinaPagamentoTest {

    @Test
    void devePagarPix(){
        MaquinaPagamento maquinaPagamento = new MaquinaPagamento();
        maquinaPagamento.pagarPix(true, true, false, false);
        assertTrue(maquinaPagamento.getAutorizacao());
    }

    @Test
    void devePagarTed(){
        MaquinaPagamento maquinaPagamento = new MaquinaPagamento();
        maquinaPagamento.pagarTed(true, true, false, false);
        assertTrue(maquinaPagamento.getAutorizacao());
    }

    @Test
    void devePagarCartaoCredito(){
        MaquinaPagamento maquinaPagamento = new MaquinaPagamento();
        maquinaPagamento.pagarCartaoCredito(true, false, true, true);
        assertTrue(maquinaPagamento.getAutorizacao());
    }

    @Test
    void devePagarCartaoDebito(){
        MaquinaPagamento maquinaPagamento = new MaquinaPagamento();
        maquinaPagamento.pagarCartaoDebito(true, true, false, true);
        assertTrue(maquinaPagamento.getAutorizacao());
    }

    @Test
    void naoDevePagarPix(){
        MaquinaPagamento maquinaPagamento = new MaquinaPagamento();
        maquinaPagamento.pagarPix(true, false, false, false);
        assertFalse(maquinaPagamento.getAutorizacao());
    }

    @Test
    void naoDevePagarTed(){
        MaquinaPagamento maquinaPagamento = new MaquinaPagamento();
        maquinaPagamento.pagarTed(true, false, false, false);
        assertFalse(maquinaPagamento.getAutorizacao());
    }

    @Test
    void naoDevePagarCartaoCredito(){
        MaquinaPagamento maquinaPagamento = new MaquinaPagamento();
        maquinaPagamento.pagarCartaoCredito(false, false, true, true);
        assertFalse(maquinaPagamento.getAutorizacao());
    }

    @Test
    void naoDevePagarCartaoDebito(){
        MaquinaPagamento maquinaPagamento = new MaquinaPagamento();
        maquinaPagamento.pagarCartaoDebito(true, true, false, false);
        assertFalse(maquinaPagamento.getAutorizacao());
    }
}
