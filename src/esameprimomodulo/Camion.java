// Aggiungere il nome del package utilizzato
package esameprimomodulo;

/*
  La classe Camion eredita dalla classe Veicolo e aggiunge una caratteristica
  in piu', ossia il numero di assi (che puo' essere 2 o 3 o ...).
*/

public class Camion extends Veicolo {

    private int numAssi;

    // TODO - STEP 3
    //Aggiungere metodi accessori get e set
    public void setAssi(int num) {
        numAssi = num;
    }

    public int getAssi() {
        return numAssi;
    }
}
