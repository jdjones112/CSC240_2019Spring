import java.util.ArrayList;
public class Example1 {
    public static void main(String[] args) {
        ArrayList<Object> cars = new ArrayList<>();

        cars.add(9999);
        cars.add("BMW");
        cars.add(99.99);
        System.out.println(cars.get(2));
        System.out.println((Double) cars.get(0));

    }
}
