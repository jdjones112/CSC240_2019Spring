package Chapter9;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(
                "We moved from Chicago to Atlanta.");
        str.replace(14, 21, "New York");
        System.out.println(str);
    }
}
