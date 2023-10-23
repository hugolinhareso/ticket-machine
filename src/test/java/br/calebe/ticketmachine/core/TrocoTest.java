package br.calebe.ticketmachine.core;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import org.junit.Before;


public class TrocoTest {

    private Troco troco;

    @Before
    public void setUp() {
        troco = new Troco(187);
    }

    @Test
    public void testTrocoInitialization() {
        PapelMoeda[] papeis = troco.papeisMoeda;

        assertEquals(1, papeis[0].getQuantidade()); 
        assertEquals(1, papeis[1].getQuantidade()); 
        assertEquals(1, papeis[2].getQuantidade()); 
        assertEquals(1, papeis[3].getQuantidade()); 
        assertEquals(1, papeis[4].getQuantidade());
        assertEquals(1, papeis[5].getQuantidade());
    }

    @Test
    public void testTrocoIterator() {
        Iterator<PapelMoeda> iterator = troco.getIterator();

        assertTrue(iterator.hasNext());
        assertEquals(100, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(50, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(20, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(10, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(5, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next().getValor());

        assertFalse(iterator.hasNext());
    }
}
