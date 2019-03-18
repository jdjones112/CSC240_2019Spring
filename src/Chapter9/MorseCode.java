package Chapter9;
import java.util.Scanner;
public class MorseCode {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input a word:");
        String input = keyboard.nextLine();
        char[] codes = input.toCharArray();
        String morseCode = "";

        for(int i = 0; i < codes.length; i++)
        {
            System.out.println(codes[i]);
            switch(codes[i])
            {
                case 'S':
                    morseCode += "***";
                    break;
                case 'O':
                    morseCode += "---";
                    break;
            }
        }
        System.out.println(morseCode);
    }
}
