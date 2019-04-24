package Chapter18;

import Chapter11.Serialize.Pokemon;
import java.awt.*;
public class PointDemo {
    public static void main(String[] args) {

        Point<Double> pA = new Point<>(8.8, 9.9);
        Point<String> pB = new Point<>("1.1", "2.2");
        Point<Integer> pC = new Point<>(3, 4);
        Point<Number> pD = new Point<>(3, 4);
        double i = Point.sqLength(pD);
        i = Point.sqLength(pD);
        System.out.println(i);
        Point<Number> pE = new Point<>(0,0);
        Point.calMiddlePoint(pD, pE);
        Color c = new Color(255);
        ColoredPoint<Number> cp1 = new ColoredPoint<>(8.8, 9.9, c);
        System.out.println(cp1.getColor());
        System.out.println(cp1.getX());
        System.out.println(cp1.getY());

    }

    void displayPoint(Point<? extends Number> myPoint)
    {

    }
}
