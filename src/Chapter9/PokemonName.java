package Chapter9;

import java.io.IOException;

public class PokemonName {
    public static void main(String[] args) throws IOException {
        String ID = "1";
        System.out.println(PokemonDataAPI.getData(ID));
    }

}
