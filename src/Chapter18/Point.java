package Chapter18;

public class Point<T> {
    private  T x,y;
    public Point(T x, T y)
    {
        set(x, y);
    }

    public void set(T x, T y)
    {
        this.x = x;
        this.y = y;
    }
    T getX(){return x;}
    T getY(){return y;}

    public String toString()
    {
        return x.toString() + "," + y.toString();
    }

    public static double sqLength(Point<? extends Number> p)
    {
        Number n1 = (Number) p.getX();
        Number n2 = (Number) p.getY();
        double x = n1.doubleValue();
        double y = n2.doubleValue();
        return x * x + y * y;
    }
    public static <T extends Number>
    void calMiddlePoint(Point<T> p1, Point<T> p2)
    {
        Number p1x = p1.getX();
        Number p1y = p1.getY();
        Number p2x = p2.getX();
        Number p2y = p2.getY();
        double x1 = p1x.doubleValue();
        double y1 = p1y.doubleValue();
        double x2 = p2x.doubleValue();
        double y2 = p2y.doubleValue();
        double xMiddle = (x1 + x2) / 2;
        double yMiddle = (y1 + y2) / 2;
        System.out.println("The middle point is: (" + xMiddle + "," + yMiddle+")");
    }
}
