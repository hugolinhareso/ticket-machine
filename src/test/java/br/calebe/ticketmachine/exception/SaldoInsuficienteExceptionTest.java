package br.calebe.ticketmachine.exception;

import org.junit.Test;

public class SaldoInsuficienteExceptionTest {

    @Test(expected = SaldoInsuficienteException.class)
    public void testConstrutorPadrao() throws SaldoInsuficienteException {
        throw new SaldoInsuficienteException();
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void testConstrutorComMensagem() throws SaldoInsuficienteException {
        throw new SaldoInsuficienteException("Saldo insuficiente para comprar o bilhete.");
    }
}
