package Chapter9;

import java.io.IOException;
import java.net.URL;

public class PokemonName {
    public static void main(String[] args) throws IOException {
        PokemonDataAPI pda = new PokemonDataAPI();
        System.out.println(pda.getData("135"));
        String URLIMage = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/130.png";
        pda.displayImageFromURL(URLIMage);
    }
}
