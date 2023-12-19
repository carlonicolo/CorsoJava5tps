// Aggiungere il nome del package utilizzato
package esameprimomodulo;

/*
  La classe Auto eredita dalla classe Veicolo e aggiunge una caratteristica
  in piu', ossia il tipo (che puo' essere ad esempio: sport, familiare,...).
*/

public class Auto extends Veicolo {

    private String tipo;

    // TODO - STEP 4

    public void setTipo(String mioTipo) {
      // da completare
        tipo = mioTipo;
    }

    public String getTipo() {
      // da completare
        return tipo;
    }
}
