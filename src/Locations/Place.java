//Alexander Cox
//Tuesday, October 30, 2018

package Locations;

public abstract class Place {

    public boolean isHere;
    public boolean wasHere;
    public boolean seen;
    public String type;
    int event;

    public abstract void getEvent();

    public abstract String toString();
}