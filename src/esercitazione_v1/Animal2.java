package esercitazione_v1;

public class Animal2 {
    public String tipo;
    public int age;

    public Animal2(String tipo, int age){
        this.tipo = tipo;
        this.age = age;
    }
    public void toEat(){
        System.out.println("L'aniimale sta mangiando");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Animal2{" +
                "tipo='" + tipo + '\'' +
                ", age=" + age +
                '}';
    }

    //TODO
    // Get and sets

    //TODO
    // Metodo toEat()

    //TODO
    // metodi toString() equals()


}
