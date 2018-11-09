//Alexander Cox
//Tuesday, October 30, 2018

package Locations;

import People.Player;

public abstract class Place {

    public boolean isHere;
    public boolean wasHere;
    public boolean seen;
    public String type;
    int event;

    public abstract void getEvent(Player player);

    public abstract String toString();
}