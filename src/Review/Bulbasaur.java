package Review;

public class Bulbasaur
{
    private int id;
    private int level;

    public Bulbasaur()
    {
        id = 1;
        level = 1;
    }

    public void setLevel(int lv)
    {
        this.level = lv;
        // support evolve
        if(level < 16)
        {
            id = 1;
        }
        else if(level >= 16 & level < 32)
        {
            id = 2;
        }
        else
        {
            id = 3;
        }
    }
    public int getLevel()
    {
        return this.level;
    }

    public String getName()
    {
        String name = "";
        switch(this.id)
        {
            case 1:
                name = "Bulbasaur";
                break;
            case 2:
                name = "Ivysaur";
                break;
            case 3:
                name = "Venusaur";
                break;
        }
        return name;
    }

    public int getID()
    {
        return this.id;
    }


    public String toString()
    {
        String result = "Level " + level + " id: "+ id;
        return result;
    }

    public boolean equals(Bulbasaur b)
    {
        if(this.id == b.getID() && this.level == b.getLevel())
            return true;
        return false;
    }

    public Bulbasaur copy()
    {
        Bulbasaur clone =  new Bulbasaur();
        clone.setLevel(this.level);
        return clone;
    }
}
