//Alexander Cox
//Tuesday, October 30, 2018

package Locations;

import People.Player;

public class Place {

    public boolean seen;
    private int xLoc, yLoc;

    public Place (boolean seen, int xLoc, int yLoc)
    {
        this.seen = seen;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public String toString()
    {
        return "[ ] ";
    }
}
