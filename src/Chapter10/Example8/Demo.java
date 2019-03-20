package Chapter10.Example8;

public class Demo {
    public static void main(String[] args) {
        Animal duck = new Duck();
        Animal dog = new Dog();
        Animal snake = new Snake();
        Animal bear = new Bear();

        // Speak now!!
        System.out.println(duck.speak());
        System.out.println(dog.speak());
        System.out.println(snake.speak());
        System.out.println(bear.speak());
    }
}

