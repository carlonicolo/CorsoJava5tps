// Aggiungere il nome del package utilizzato
package esameprimomodulo;

/*
La classe veicolo, che definisce un veicolo con le seguenti
caratteristiche:
- numero Matricola;
- nome proprietario.
Si puo' cambiare il nome del proprietario, e vedere il numero
matricola o il proprietario.
*/

public class Veicolo {

    private int numMatricola;
    private String proprietario;

    public Veicolo() {
      numMatricola = -1;
      proprietario = "NN";
    }

    // TODO - STEP 1

    // Costruttore con parametri
    //public Veicolo(int ..., String ...){}

    // Aggiungere metodi accessori get e set
    // Costruttore con parametri
    public Veicolo(int numMatricola, String proprietario){
        this.numMatricola = numMatricola;
        this.proprietario = proprietario;
    }

    public void setProprietario(String nome) {
        proprietario = nome;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setMatricola(int matricola) {
        numMatricola = matricola;
    }

    public int getMatricola() {
        return numMatricola;
    }

}  // fine classe Veicolo
