package Chapter18;

class Point2<T extends Number>      //  T constrained to a subclass of Number
{
    private T x, y;

    public Point2(T x, T y) {
        this.x = x;
        this.y = y;
    }

    double sqLength() {
        double x1 = x.doubleValue();
        double y1 = y.doubleValue();
        return x1 * x1 + y1 * y1;
    }

    T getX() {
        return x;
    }

    T getY() {
        return y;
    }

    public String toString() {
        return "(" + x.toString() + "," + y.toString() + ")";
    }

    static <T extends Number> Point<T> someFun(Point<T> arg1, Point<T> arg2)
    {
        return arg1;
    }

    static <T extends Number> void doSomething(Point<T> arg1, Point<T> arg2)
    {

    }

}