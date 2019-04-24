package Chapter11.Serialize;

import java.io.*;

public class PokemonDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serialization --> save(obj)
        Pokemon p1 = new Pokemon(88, 99);
        FileOutputStream file = new FileOutputStream("pokemon.sav");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(p1);
        out.close();
        file.close();

        // DeSerialization --> Load(obj)
        FileInputStream file2 = new FileInputStream("pokemon.sav");
        ObjectInputStream in = new ObjectInputStream(file2);

        Pokemon p2;

        p2 = (Pokemon) in.readObject();
        System.out.println(p2.HP);
        System.out.println(p2.level);

    }
}
