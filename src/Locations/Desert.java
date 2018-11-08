//Alexander Cox
//November 5, 2018

package Locations;

public class Desert extends Place{

    boolean seen;
    String type;
    private boolean isHere, wasHere;

    public Desert()
    {
        this.seen = false;
        this.type = "desert";
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
            return "[d]";
        return "[D] ";
    }
}