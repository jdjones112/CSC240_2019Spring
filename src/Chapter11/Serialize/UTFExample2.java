package Chapter11.Serialize;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class UTFExample2 {
    public static void main(String[] args) throws IOException {
        // Read Saved file into an array
        // use readUTF()
        FileInputStream finstream = new FileInputStream("names.bin");
        DataInputStream inputFile = new DataInputStream(finstream);

        while(inputFile.available() != 0)
        {
            System.out.println(inputFile.readUTF());
        }
    }
}
