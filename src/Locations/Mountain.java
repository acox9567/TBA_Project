//Alexander Cox
//Tuesday, October 30, 2018

package Locations;

import Items.Weapon;
import People.Enemy;
import People.Player;

import java.util.Scanner;

public class Mountain extends Place{

    public Mountain()
    {
        this.seen = false;
        this.type = "mountain";
        isHere = false;
        wasHere = false;
        event = (int)(Math.random() * 5);
    }

    public void getEvent(Player player)
    {
        if (event == 0)
            event0();
        else if (event == 1)
            event1(player);
        else if (event == 2)
            event2();
        else if (event == 3)
            event3(player);
        else
            event4();
    }

    public String toString()
    {
        if (isHere)
            return "[ ] ";
        if (wasHere)
            return "[m] ";
        return "[M] ";
    }

    public static void weaponDrop(Player player, Weapon weapon)
    {
        System.out.println("You found a " + weapon.name + ". " + weapon.description + " Would you like to pick it up. Enter \"yes x\" or \"no\", where x is the inventory slot you would like to fill.");

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if (input.equalsIgnoreCase("yes 1")) {
            player.inventory[0] = weapon;
            System.out.println("You picked up the spear and put in slot 1.");
        }
        if (input.equalsIgnoreCase("yes 2")) {
            player.inventory[1] = weapon;
            System.out.println("You picked up the spear and put in slot 2.");
        }
        if (input.equalsIgnoreCase("yes 3")) {
            player.inventory[2] = weapon;
            System.out.println("You picked up the spear and put in slot 3.");
        }
        if (input.equalsIgnoreCase("yes 4")) {
            player.inventory[3] = weapon;
            System.out.println("You picked up the spear and put in slot 4.");
        }
        if (input.equalsIgnoreCase("yes 5")) {
            player.inventory[4] = weapon;
            System.out.println("You picked up the spear and put in slot 5.");
        }
        if (input.equalsIgnoreCase("yes 6")) {
            player.inventory[5] = weapon;
            System.out.println("You picked up the spear and put in slot 6.");
        }
        if (input.equalsIgnoreCase("yes 7")) {
            player.inventory[6] = weapon;
            System.out.println("You picked up the spear and put in slot 7.");
        }
        if (input.equalsIgnoreCase("yes 8")) {
            player.inventory[7] = weapon;
            System.out.println("You picked up the spear and put in slot 8.");
        }
    }

    private void event0()
    {
        System.out.println("The mountains were covered with a rug of trees, green, yellow, scarlet and orange, but their bare tops were scarfed and beribboned with snow. From carved rocky outcrops, waterfalls drifted like skeins of white lawn, and in the fields we could see the amber glint of rivers and the occasional mirror-like flash of a mountain lake.");
    }

    private void event1(Player player)
    {
        Scanner in = new Scanner(System.in);
        Enemy troll = new Enemy("Troll", 10);
        System.out.println("Walking through the mountains you spot a troll, it immediately notices you and charges.");
        boolean inCombat = true;
        while (inCombat)
        {
            System.out.println("Would you like to \"fight\" or \"run\"?");
            String input = in.nextLine();
            if(input.equalsIgnoreCase("fight"))
            {
                if (player.getCP() + (int)(Math.random() * 6) >  troll.level + (int)(Math.random() * 6)) {
                    player.level += 1;
                    player.health += 1;
                    inCombat = false;
                    System.out.println("You defeated the troll and gained 1 level");
                    Weapon trollArm = new Weapon("Troll Arm", "When equipped it grants +10 combat power.", 10, 10);
                    weaponDrop(player, trollArm);
                }
                else {
                    player.health--;
                    System.out.println("The troll overpowers you and hits you dealing 1 damage");
                    System.out.println("You now have " + player.health + " health left.");
                }
            }
            else if (input.equalsIgnoreCase("run"))
            {
                if (Math.random() < .5) {
                    System.out.println("You get away safely.");
                    inCombat = false;
                }
                else
                {
                    player.health--;
                    System.out.println("The troll catches up and hits you dealing 1 damage");
                    System.out.println("You now have " + player.health + " health left.");
                }
            }
            else
            {
                player.health--;
                System.out.println("The troll takes advantage of your inaction and hits you dealing 1 damage");
                System.out.println("You now have " + player.health + " health left.");
            }
        }
    }
    private void event2()
    {
        System.out.println("The mountains soared upward as if determined to kiss the heavens. Each of them was white-peaked, but nothing like the neat line around a chocolate waffle cone. The snow reached down from the cap in craggy white fingers, no doubt up close there were mighty cracks in the rock deep packed with ice.");
    }
    private void event3(Player player)
    {
        Scanner in = new Scanner(System.in);
        Enemy dragon = new Enemy("Dragon", 20);
        System.out.println("Walking through the mountains you spot a dragon, it immediately notices you and charges.");
        boolean inCombat = true;
        while (inCombat)
        {
            System.out.println("Would you like to \"fight\" or \"run\"?");
            String input = in.nextLine();
            if(input.equalsIgnoreCase("fight"))
            {
                if (player.getCP() + (int)(Math.random() * 6) >  dragon.level + (int)(Math.random() * 6)) {
                    player.level += 1;
                    player.health += 1;
                    inCombat = false;
                    System.out.println("You defeated the dragon and gained 1 level");
                    Weapon dragonSlayer = new Weapon("Dragon Slayer's Greatsword", "When equipped it grants +15 combat power.", 15, 10);
                    weaponDrop(player, dragonSlayer);
                }
                else {
                    player.health--;
                    System.out.println("The dragon overpowers you and hits you dealing 1 damage");
                    System.out.println("You now have " + player.health + " health left.");
                }
            }
            else if (input.equalsIgnoreCase("run"))
            {
                if (Math.random() < .5) {
                    System.out.println("You get away safely.");
                    inCombat = false;
                }
                else
                {
                    player.health--;
                    System.out.println("The dragon catches up and hits you dealing 1 damage");
                    System.out.println("You now have " + player.health + " health left.");
                }
            }
            else
            {
                player.health--;
                System.out.println("The dragon takes advantage of your inaction and hits you dealing 1 damage");
                System.out.println("You now have " + player.health + " health left.");
            }
        }
    }
    private void event4()
    {
        System.out.println("The snow atop the mountains glittered like diamonds, throwing entire spectrums of colour across the land and into the air. The water of the nearby river reflected that light back, though with more shades of blue, due to the moon's influence.");
    }
}