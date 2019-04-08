package Chapter9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GasPrices {

    public static void main(String[] args) throws IOException {


        String[] gasData = getData(); // download gas price into an array
        double average = AveragePrice("18", 2, gasData);
        System.out.println(average);

    }

    public static double AveragePrice(String year, int column, String[] gasData)
    {
        double averagePrice = 0.0;
        double totalPrice = 0.0;
        int count = 0;
        for(int i = 1; i < gasData.length; i++)
        {
            //System.out.println(data[i]);
            String[] data = gasData[i].split(",");
            if(data[0].endsWith(year)); // date
            {
                totalPrice += Double.parseDouble(data[column]); // Albany price
                count ++;
            }

        }
        averagePrice = totalPrice / count;
        return averagePrice;
    }


    public static String[] getData() throws IOException {

        URL url = new URL("https://cs.wcupa.edu/schen/csc240/Gasoline_Retail_Prices_Weekly_Average_by_Region__Beginning_2008.csv");
        URLConnection connection = url.openConnection();

        InputStreamReader input = new InputStreamReader(connection.getInputStream());
        BufferedReader buffer = null;
        StringBuilder data = new StringBuilder();

        String line = "";
        try {
            buffer = new BufferedReader(input);

            while ((line = buffer.readLine()) != null) {
                data.append(line + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return data.toString().split("\n");
    }

}
