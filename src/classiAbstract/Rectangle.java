package classiAbstract;

public class Rectangle extends Figure {
    protected double length;
    protected double width;
    Rectangle(double l, double w) { length = l; width = w; }
    public double area() { return length * width; }

    @Override
    public String myname() {
        return "Rectangle";
    }
}
