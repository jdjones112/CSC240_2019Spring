package Chapter11.Serialize;

import java.awt.*;
import java.io.Serializable;

public class Pokemon implements Serializable {
    public int HP = 0;
    public int level = 999;

    public Pokemon(int HP, int level)
    {
        this.HP  = HP;
        this.level = level;
    }
}
