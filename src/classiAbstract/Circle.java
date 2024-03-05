package classiAbstract;

public class Circle extends Figure {
    protected double radius;
    static final double PI = 3.1416;

    private String name = "Pitagora";
    Circle(double r) { radius = r; }
    public double area() { return PI * radius * radius; }

    @Override
    public String myname() {
        return "Circle";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
