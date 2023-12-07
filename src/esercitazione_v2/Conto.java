package esercitazione_v2;

import java.util.Scanner;

public class Conto {
    private Persona p;
    private String codiceIBAN;
    private int numero;
    private float saldo;
    private float cassa; // importo presente sul conto

    public Conto(Persona p, String codiceIBAN, int numero, float cassa) {
        this.p = p;
        this.codiceIBAN = codiceIBAN;
        this.numero = numero;
        this.cassa = cassa;
    }

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    public String getCodiceIBAN() {
        return codiceIBAN;
    }

    public void setCodiceIBAN(String codiceIBAN) {
        this.codiceIBAN = codiceIBAN;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getCassa() {
        return cassa;
    }

    public void setCassa(float cassa) {
        this.cassa = cassa;
    }

    public void deposito(float importo_da_depositare) {
        cassa = cassa + importo_da_depositare;
    }

    public void prelievo(float importo_da_prelevare) {
        try {
            if (importo_da_prelevare > this.cassa) {
                System.out.println("Mi dispiace ma l'importo eccede il tuo credito residuo.");
            } else {
                cassa = cassa - importo_da_prelevare;
                System.out.println("Prelievo effettuato correttamente !");
                System.out.println("Il tuo saldo corrente è: " + cassa);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public void prelievoInterattivo() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Inserisci l'importo che vuoi prelevare: ");

        // String input
        float importo_prelievo = myObj.nextFloat();

        if (importo_prelievo > this.cassa) {
            System.out.println("Mi dispiace ma l'importo eccede il tuo credito residuo.");
        } else {
            cassa = cassa - importo_prelievo;
            System.out.println("Prelievo effettuato correttamente !");
            System.out.println("Il tuo saldo corrente è: " + cassa);
        }


    }

    @Override
    public String toString() {
        return "Conto{" +
                "p=" + p.toString() +
                ", codiceIBAN='" + codiceIBAN + '\'' +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cassa=" + cassa +
                '}';
    }
}
