package classiAbstract;

public class Circle extends Figure {
    protected double radius;
    static final double PI = 3.1416;
    Circle(double r) { radius = r; }
    public double area() { return PI * radius * radius; }
}
