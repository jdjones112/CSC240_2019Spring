package Review;

/*
********************************************
# Array Q1

   **Please do not change any of the existing code**

   This program will download a `tmp.txt` file from a remote server
   and then load the data into an array named `numbers`.

   Please write java code process the array.

********************************************
*/
import java.net.*;
import java.util.Scanner;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.util.regex.*;

public class ArrayReview
{
    public static void main(String[] args)
    {
        double[] numbers = new double[99999];

      /* download and save tmp.txt from a remote server
         load the data into number array */
        try{
            URL website = new URL("https://www.cs.wcupa.edu/schen/csc142/tmp.txt");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("tmp.txt");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            Scanner dataFile = new Scanner(new File("tmp.txt"));
            int count = -1;
            while(dataFile.hasNext()){
                numbers[++count] = Double.parseDouble(dataFile.nextLine());
            }
        }
        catch(Exception ex){
            System.out.println(ex);
            System.out.println("You got an error, Ask Dr. Chen for help");
        }

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum is " + sum);

        double average;
        average = sum / numbers.length;
        System.out.println("Avg is " + average);

        int max_index = 0;
        int min_index = 0;
        double min = 9999;
        int[] maxIndexArray = new int[numbers.length];
        int[] minIndexArray = new int[numbers.length];
        double max = 0.0;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > max)
            {
                max = numbers[i];
                max_index = i;
            }

            if (numbers[i] < min)
            {
                min = numbers[i];
                min_index = i;
            }

        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
        System.out.println("Max index : " + max_index);
        System.out.println("Min index : " + min_index);

        double odd = 0;
        double even = 0;
        for (int i = 0; i < numbers.length; i++ ) {
            if (i % 2 == 0)
                even += numbers[i];

            else
                odd += numbers[i];
        }


        System.out.println("Sum of even index numbers is " + even);
        System.out.println("Sum of odd index numbers is " + odd);


    }

}
