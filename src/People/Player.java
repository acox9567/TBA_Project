//Alexander Cox
//Thursday, November 8, 2018

package People;

import Items.Weapon;

public class Player extends Person {

    public Weapon[] inventory;

    public Player(int xLoc, int yLoc, String name)
    {
        super(xLoc,yLoc);
        this.name = name;
        cp = 0;
        inventory = new Weapon[8];
    }

    public static int getCP()
    {
        int cp = 0;

        return
    }
}
