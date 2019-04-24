package Review;

public class Point<T> {
    private T x,y;
    public Point(T x, T y)
    {
        set(x, y);
    }
    public void set(T x, T y)
    {
        this.x = x;
        this.y = y;
    }
    public T getX(){ return x;}
    public T getY(){ return y;}
    public String toString()
    {
        return x.toString() + "," + y.toString();
    }
}
