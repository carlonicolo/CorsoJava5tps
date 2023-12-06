package esercitazione_v2;

import java.util.ArrayList;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;
    private String codiceFiscale;
    private ArrayList<Conto> conti;

    public Persona(String nome, String cognome, int eta, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.codiceFiscale = codiceFiscale;
        conti = new ArrayList<Conto>();
    }

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        conti = new ArrayList<Conto>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Conto getConto() {
        return conti.get(0);
    }

    public void setConti(Conto conto) {
        this.conti.add(conto);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                //", conto=" + conti.get(0) +
                '}';
    }
}
