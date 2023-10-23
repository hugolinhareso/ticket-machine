package br.calebe.ticketmachine.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class PapelMoedaTest {

    @Test
    public void deveRetornarValorCorretoNoConstrutor() {
        PapelMoeda papelMoeda = new PapelMoeda(10, 5);
        assertEquals(10, papelMoeda.getValor());
    }

    @Test
    public void deveRetornarQuantidadeCorretaNoConstrutor() {
        PapelMoeda papelMoeda = new PapelMoeda(5, 8);
        assertEquals(8, papelMoeda.getQuantidade());
    }
}
