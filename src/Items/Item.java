//Alexander Cox
//Thursday, November 8, 2018

package Items;

public abstract class Item {

    public String name, description;
    public int value, cpBonus;
    public boolean equipped;

    public abstract void use();
}
