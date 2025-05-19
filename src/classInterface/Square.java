package classInterface;

import java.awt.*;

public class Square implements Scalable {

    protected double length;
    protected double width;
    Square(double l, double w) { length = l; width = w; }
    public double area() { return length * width; }
    public void enlarge() { length*=2.0; width*=2.0; }
    public void shrink() { length*=0.5; width*=0.5; }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
