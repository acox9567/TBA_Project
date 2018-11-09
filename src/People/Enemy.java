package People;

public class Enemy extends Person {

    public Enemy(String name, int level)
    {
        this.name = name;
        this.level = level;
    }

    public int getCP()
    {
        return this.level;
    }
}
