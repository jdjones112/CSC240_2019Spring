package Chapter9;

public class CharacterDemo {
    public static void main(String[] args) {
        // test isDigit() in Character class
        // Returns true if the argument passed into
        // ch is a digit from 0 through 9

        // boolean isDigit(char ch)
        // this is a static method

        char toTest = '9';
        System.out.println(Character.isDigit(toTest));

        char toTest2 = 'a';
        // test isUpperCase()
        // boolean isUpperCase(char ch)
        System.out.println(Character.isUpperCase(toTest2));


        // char toLowerCase(char ch)
        char toTest3 = 'G';
        System.out.println(Character.toLowerCase(toTest3));
    }

}
