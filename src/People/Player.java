//Alexander Cox
//Thursday, November 8, 2018

package People;

import Items.Item;

public class Player extends Person {

    public static Item[] inventory;
    public int xLoc, yLoc, health;

    public Player(int xLoc, int yLoc, String name)
    {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.name = name;
        level = 1;
        health = level * 10;
        inventory = new Item[8];
    }

    public static int getCP()
    {
        int cp = 0;
        for (int i = 0; i < inventory.length; i++)
        {
            if (inventory[i] != null && inventory[i].equipped)
                cp += inventory[i].cpBonus;
        }
        cp += level;
        return cp;
    }

    public String toString()
    {
        String str = "";

        str += "NAME: " + this.name + "\n";
        str += "LEVEL: " + this.level + "\n";
        str += "HEALTH: " + this.health + "\n";
        str += "INVENTORY: \n";

        for (int i = 0; i < inventory.length; i++)
        {
            if (inventory[i] == null)
                str += "    [" + (i + 1) + "] Empty\n";
            else if(inventory[i].equipped)
                str += "    [" + (i + 1) +"] " + inventory[i].name + " - " + inventory[i].description + "(equipped)\n";
            else
                str += "    [" + (i + 1) +"] " + inventory[i].name + " - " + inventory[i].description + "\n";
        }
        return str;
    }
}
