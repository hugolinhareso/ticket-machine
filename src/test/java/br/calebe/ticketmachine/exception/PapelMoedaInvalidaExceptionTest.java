package br.calebe.ticketmachine.exception;

import org.junit.Test;

public class PapelMoedaInvalidaExceptionTest {

    @Test(expected = PapelMoedaInvalidaException.class)
    public void testConstrutorPadrao() throws PapelMoedaInvalidaException {
        throw new PapelMoedaInvalidaException();
    }

    @Test(expected = PapelMoedaInvalidaException.class)
    public void testConstrutorComMensagem() throws PapelMoedaInvalidaException {
        throw new PapelMoedaInvalidaException("Papel moeda inválido: 1 real.");
    }
}
