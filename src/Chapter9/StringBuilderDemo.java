package Chapter9;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        str.append("We sold ");
        str.append(12);
        str.append(" doughnuts for $");
        str.append(15.95);

        System.out.println(str);

    }
}
