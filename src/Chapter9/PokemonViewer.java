package Chapter9;

import java.io.IOException;

public class PokemonViewer {
    public static void main(String[] args) throws IOException {
        String ID = "344";
        String rawData = PokemonDataAPI.getData(ID);
        // Extract the name of the Pokemon
        // From the raw data.
        int startLocation = rawData.indexOf("\"name\":");
        int endLocation = rawData.indexOf(",\"names");
        startLocation = startLocation + 8;
        endLocation = endLocation - 1;
        String name = rawData.substring(startLocation, endLocation);
        System.out.println(name);
        String URLTest = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/1.png";
        PokemonDataAPI.displayImageFromURL(URLTest);
    }

}
