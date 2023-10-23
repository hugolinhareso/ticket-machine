package br.calebe.ticketmachine.core;

import org.junit.Before;
import org.junit.Test;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;

import static org.junit.Assert.*;

public class TicketMachineTest {

    private TicketMachine ticketMachine;

    @Before
    public void setUp() {
        ticketMachine = new TicketMachine(10);
    }

    @Test
    public void deveRetornarSaldoCorreto() {
        try {
            ticketMachine.inserir(20);
            assertEquals(20, ticketMachine.getSaldo());
        } catch (PapelMoedaInvalidaException e) {
            //
        }
    }

    @Test
    public void deveImprimirBilheteComSaldoSuficiente() {
        try {
            ticketMachine.inserir(20);
            try {
                String bilhete = ticketMachine.imprimir();
                assertTrue(bilhete.contains("R$ 20,00"));
            } catch (SaldoInsuficienteException e) {
                //
            }
        } catch (PapelMoedaInvalidaException e) {
            //
        }
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void naoDeveImprimirBilheteComSaldoInsuficiente() throws SaldoInsuficienteException {
        try {
            ticketMachine.inserir(5);
            ticketMachine.imprimir();
        } catch (PapelMoedaInvalidaException e) {
            //
        }
    }
}
