//Alexander Cox
//Tuesday, October 30, 2018

package Locations;

public class Forest extends Place{

    boolean seen;
    String type;
    private boolean isHere, wasHere;

    public Forest()
    {
        this.seen = false;
        this.type = "forest";
        isHere = false;
        wasHere = false;
    }

    public void getEvent()
    {
        System.out.println("Something happens.");
    }

    public String toString()
    {
        if (isHere)
            return "[ ] ";
        if (wasHere)
            return "[f]";
        return "[F] ";
    }
}
