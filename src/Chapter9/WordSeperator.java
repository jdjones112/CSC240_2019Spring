package Chapter9;

import java.util.Scanner;

public class WordSeperator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input a Setence:");
        String input = keyboard.nextLine();

        StringBuilder sb = new StringBuilder(input);

        for(int i = 1; i < sb.length(); i++)
        {
            if(Character.isUpperCase(sb.charAt(i)))
            {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
                sb.insert(i, " ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
