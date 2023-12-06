package esercitazione_v1;

public class Main {
    public static void main(String[] args){
        System.out.println("Creo Animal");
        Animal a1 = new Animal("Lepre", 7);
        System.out.println(a1.getAge());
        System.out.println(a1.getTipo());

        System.out.println("Creo Animal2");
        Animal2 a2 = new Animal2("Cane",10);
        System.out.println(a2.getAge());
        System.out.println(a2.getTipo());
        a2.toEat();


        //TODO
        // crea Animal2
    }
}
