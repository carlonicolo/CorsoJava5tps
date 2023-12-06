package classiAbstract;

public class FigureTest {
    Figure[] a; // array di figure
    void creaFigure(int num)
    {
        a = new Figure[num];
        int i;
        for (i=0; i<num; i++)
        {
            // double Math.random() ritorna numero casuale tra 0 e 1
            switch ( ((int)(100*Math.random())) % 3 ) // numero casuale 0,1,2
            {
                case 0:
                    a[i] = new Rectangle(10.0*Math.random(),10.0*Math.random());
                    break;
                case 1:
                    a[i] = new Triangle(10.0*Math.random(),10.0*Math.random());
                    break;
                case 2:
                    a[i] = new Circle(10.0*Math.random());
                    break;
            }
        }
    }
    double calcolaArea()
    {
        int i;
        double areaTot = 0.0;
        for (i=0; i<a.length; i++){
            System.out.println("Area elemento " + i + " è " + a[i].area() );
            areaTot += a[i].area();
        }
        return areaTot;
    }
    public static void main(String[] args)
    {
        FigureTest ft = new FigureTest();
        ft.creaFigure(10);
        System.out.println("Area totale = " + ft.calcolaArea());
    }
}
