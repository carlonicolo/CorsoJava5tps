package esercitazione_v1;

public class Animal {
    public String tipo;
    public int age;

    public Animal(String tipo, int age){
        this.tipo = tipo;
        this.age = age;
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
}
