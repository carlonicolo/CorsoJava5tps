// Aggiungere il nome del package utilizzato
package esameprimomodulo;

/*
  La classe Moto eredita dalla classe Veicolo e aggiunge una caratteristica
  in piu', ossia il numero di posti (che puo' essere 1 o 2).
*/


public class Moto extends Veicolo {

    private int numPosti;

    // TODO - STEP 2
    // Aggiungere metodi accessori get e set
    public void setNumPosti(int numPt) {
        numPosti = numPt;
    }

    public int getNumPosti() {
        return numPosti;
    }

}
