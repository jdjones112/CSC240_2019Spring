package Review;

public class BulbasaurDemo
{
    public static void main(String[] args)
    {
        Bulbasaur b1;
        b1 = new Bulbasaur();
        b1.setLevel(99999);
        System.out.println(b1.getLevel());
        System.out.println(b1.getName());
        System.out.println(b1);
        Bulbasaur b2 = new Bulbasaur();
        //b2.setLevel(99999);
        System.out.println(b1.equals(b2)); // output false
        Bulbasaur b3;
        b3 = b1.copy();
        System.out.println(b3);
    }
}
