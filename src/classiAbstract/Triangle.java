package classiAbstract;

public class Triangle extends Figure {
    protected double basis;
    protected double height;
    Triangle(double b, double h) { basis = b; height = h; }
    public double area() { return 0.5 * basis * height; }

    @Override
    public String myname() {
        return "Triangle";
    }
}
