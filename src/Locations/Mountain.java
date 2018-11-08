//Alexander Cox
//Tuesday, October 30, 2018

package Locations;

public class Mountain extends Place{

    boolean seen;
    String type;
    private boolean isHere, wasHere;

    public Mountain()
    {
        this.seen = false;
        this.type = "mountain";
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
            return "[m]";
        return "[M] ";
    }
}
