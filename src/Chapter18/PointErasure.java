package Chapter18;


public class PointErasure<T> {
    private  Object x,y;
    public PointErasure(T x, T y)
    {
        set(x, y);
    }

    public void set(T x, T y)
    {
        this.x = x;
        this.y = y;
    }
    Object getX(){return x;}
    Object getY(){return y;}

    public String toString()
    {
        return x.toString() + "," + y.toString();
    }

}

