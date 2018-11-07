package People;

public class Player extends Person {

    public String name;

    public Player(int xLoc, int yLoc, String name)
    {
        super(xLoc,yLoc);
        this.name = name;
    }
}
