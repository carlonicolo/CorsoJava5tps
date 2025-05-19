package classInterface;

import classiAbstract.FigureTest;

public class TestFigure {
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle(5,4);
        System.out.println("Original rectangle -> " + rect.toString());
        System.out.println("Area -> " + rect.area());
        rect.enlarge();
        System.out.println("After enlarge() -> " + rect.toString());
        rect.shrink();
        System.out.print("After shrink() -> " + rect.toString());

        System.out.println("\n");
        Square square = new Square(5,5);
        System.out.println("Original square -> " + square.toString());
        System.out.println("Area -> " + square.area());
        square.enlarge();
        System.out.println("After enlarge() -> " + square.toString());
        square.shrink();
        System.out.print("After shrink() -> " + square.toString());

    }
}
