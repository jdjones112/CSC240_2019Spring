package Chapter9.PokemonViewer;

import java.io.IOException;

public class PokemonViewer {
    public static void main(String[] args) throws IOException {
/*        String ID = "777";
        String rawData = PokemonDataAPI.getData(ID);
        // Extract the name of the Pokemon
        // From the raw data.
        int startLocation = rawData.indexOf("\"name\":");
        int endLocation = rawData.indexOf(",\"names");
        startLocation = startLocation + 8;
        endLocation = endLocation - 1;
        String name = rawData.substring(startLocation, endLocation);
        System.out.println(name);

        //String URL = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + ID + ".png";
        //PokemonDataAPI.displayImageFromURL(URL);
        int start = rawData.indexOf("front_shiny");
        int end = rawData.indexOf("version_group");
        String URL = rawData.substring(start+14, end-4);
        System.out.println(URL);
        PokemonDataAPI.displayImageFromURL(URL);

        */

        // updated to GUI version
        PokemonViewerGUI pvg = new PokemonViewerGUI();
    }

}
