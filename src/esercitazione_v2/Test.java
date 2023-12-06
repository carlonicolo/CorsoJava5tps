package esercitazione_v2;

public class Test {
    public static void main(String[] args){
        Persona pippo = new Persona("Pippo", "Zig", 18, "P13B87ZWER");
        Conto contoPippo = new Conto(pippo,"ZSER455667788912", 87654321,200);
        pippo.setConti(contoPippo);

        System.out.println("Pippo");
        System.out.println(pippo);
        System.out.println("############");

        System.out.println("Conto Pippo");
        System.out.println(contoPippo);
        System.out.println("############");

        Conto cPippo = pippo.getConto();

        System.out.println("Oggetto Persona in contoPippo -> " + contoPippo.getP());
        System.out.println(cPippo);


    }
}
