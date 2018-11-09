//Alexander Cox
//Thursday, November 8, 2018

package Items;

public class Weapon extends Item{

    public Weapon(String name, String description, int cpBonus, int value)
    {
        this.cpBonus = cpBonus;
        this.name = name;
        this.description = description;
        this.value = value;
        this.equipped = false;
    }

    public void use()
    {
        this.equipped = true;
    }
}
