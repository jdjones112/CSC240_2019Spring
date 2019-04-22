package Chapter18;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        System.out.println(cars.get(0));


        ArrayList newCars = new ArrayList();
        Point randomPoint = new Point("xx", 123);
    }
}
