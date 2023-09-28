package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */

class Troco {

    protected PapelMoeda[] papeisMoeda;
    private final int[] VALORES = {100, 50, 20, 10, 5, 2};

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];
        for (int i = 0; i < VALORES.length; i++) {
            int count = valor / VALORES[i];
            valor = valor % VALORES[i];
            papeisMoeda[5 - i] = new PapelMoeda(VALORES[i], count);
        }
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 6; i >= 0; i++) {
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 6; i >= 0 && ret != null; i++) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
}
