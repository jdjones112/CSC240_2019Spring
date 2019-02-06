package Chapter9;

public class StringSplitDemo {
    public static void main(String[] args) {
        // Create a String to tokenize.
        String str = "one two three four";
        // Get the tokens from the string.
        String[] tokens = str.split(" ");
        // Display each token.
        for (String s : tokens)
            System.out.println(s);
    }
}
