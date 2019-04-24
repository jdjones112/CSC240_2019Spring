package Chapter11.Serialize;

import java.io.*;

public class UTFExample
{
    public static void main(String[] args) throws IOException {
        String names[] = {"Warren", "Becky", "Holly",
                "Zach", "Chloe"};
        // Save names into a file using writeUTF()
        FileOutputStream fstream = new FileOutputStream("names.bin");
        DataOutputStream outputFile = new DataOutputStream(fstream);

        for(int i = 0; i < names.length; i++)
        {
            //System.out.println(names[i]);
            outputFile.writeUTF(names[i]);
        }
        outputFile.close();
    }
}