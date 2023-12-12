// Aggiungere il nome del package utilizzato
// package ...;

/*
  Questa classe testa le classi Veicolo, Auto, Moto e Camion.
*/


public class TestVeicolo {

    public static void main(String[] arg) {

        // TODO - STEP 5
        // UNA VOLTA SISTEMATE LE CLASSI ESEGUIRE QUESTA CLASSE TEST E
        // VERIFICARE CHE TUTTO FUNZIONI CORRETTAMENTE
        Auto miaAuto = new Auto();
        miaAuto.setProprietario("Luca");
        miaAuto.setMatricola(1234);

        miaAuto.setTipo("Sport");

        Camion camion1 = new Camion();

        camion1.setProprietario("Anna");
        camion1.setMatricola(34231);

        camion1.setAssi(3);

        Moto moto1 = new Moto();
        moto1.setProprietario("Valentino");
        moto1.setMatricola(8765);

        moto1.setNumPosti(2);

        //
        System.out.println("Auto di: " + miaAuto.getProprietario()
                + "\nTipo dell'auto: " + miaAuto.getTipo());
        System.out.println("Camion di: " + camion1.getProprietario()
                + "\nnumero matricola: "
                + camion1.getMatricola() +
                "\nnumero assi: " + camion1.getAssi());
        System.out.println("Moto di: " + moto1.getProprietario()
                + "\nnumero matricola: "
                + moto1.getMatricola() +
                "\nnumero posti: " + moto1.getNumPosti());

        // un oggetto di tipo Veicolo puo' riferirsi ad un qualunque
        // oggetto di una sottoclasse di Veicolo, quindi ad esempio
        // ad un oggetto di tipo Moto (o Auto o Camion).

        Veicolo unVeicolo = new Veicolo();
        unVeicolo = moto1;

        // l'operatore "instanceof" ritorna il valore true o false,
        // a seconda se l'oggetto scritto a sinistra dell'operatore
        // e' o no un oggetto della classe scritta a destra dell'
        // operatore.

        if (unVeicolo instanceof Moto)
            System.out.println("\nIl veicolo e' una moto!\n");


        // Sapendo che l'oggetto "unVeicolo" si riferisce ad un oggetto
        // di tipo Moto, si puo' fare un cast (forzatura) per convertirlo
        // e quindi per usare poi tutti i metodi della classe Moto.

        Moto moto2 = (Moto) unVeicolo;
        System.out.println(moto2.getNumPosti()); // corretto

        // TODO - STEP 6
        // CREARE 3 NUOVI OGGETTI di tipo: Auto, Camion, Moto
        // e visualizzare il valore delle proprietà utilizzando
        // i metodi get

    }

}
