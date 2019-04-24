package Homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.SortedMap;
import java.util.List;
public class PokemonAPI {

    public static String getData(String id) {
        String data = "";
        try{
            URLConnection connection = new URL("https://pokeapi.co/api/v2/pokemon-form/" + id).openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            connection.connect();
            BufferedReader r  = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = r.readLine()) != null) {
                sb.append(line);
            }
            data = sb.toString();
        }
        catch(Exception ex){
            System.out.println(ex);
            System.out.println("You got an error, Ask Dr. Chen for help");
        }
        return data;
    }


    public static String getDeatiledData(String id) {
        String data = "";
        try{
            URLConnection connection = new URL("https://pokeapi.co/api/v2/pokemon/" + id).openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            connection.connect();
            BufferedReader r  = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = r.readLine()) != null) {
                sb.append(line);
            }
            data = sb.toString();
        }
        catch(Exception ex){
            System.out.println(ex);
            System.out.println("You got an error, Ask Dr. Chen for help");
        }
        return data;
    }

    public static String getName(String id)
    {
        String data = PokemonAPI.getData(id);
        SortedMap a = (SortedMap) Json.parse(data);
        SortedMap b = (SortedMap) a.get("pokemon");
        return (String) b.get("name");
    }

    public static String getAbility(String id)
    {
        String data = PokemonAPI.getDeatiledData(id);
        SortedMap a = (SortedMap) Json.parse(data);
        List b = (List) a.get("abilities");
        //return (String) b.get("name");
        for(Object aa : b)
        {
            System.out.println(aa);
        }
        return "";
    }

}
