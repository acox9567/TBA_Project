//Alexander Cox
//Tuesday, October 30, 2018

package Locations;

import Items.Weapon;
import People.Enemy;
import People.Player;

import java.util.Scanner;

public class Forest extends Place{

    public Forest()
    {
        this.seen = false;
        this.type = "forest";
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
            return "[f] ";
        return "[F] ";
    }

    public static void weaponDrop(Player player, Weapon weapon)
    {
        System.out.println("You found a " + weapon.name + ". " + weapon.description + " Would you like to pick it up. Enter \"yes x\" or \"no\", where x is the inventory slot you would like to fill.");

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if (input.equalsIgnoreCase("yes 1")) {
            player.inventory[0] = weapon;
            System.out.println("You picked up the " + weapon.name + " and put in slot 1.");
        }
        if (input.equalsIgnoreCase("yes 2")) {
            player.inventory[1] = weapon;
            System.out.println("You picked up the " + weapon.name + " spear and put in slot 2.");
        }
        if (input.equalsIgnoreCase("yes 3")) {
            player.inventory[2] = weapon;
            System.out.println("You picked up the " + weapon.name + " spear and put in slot 3.");
        }
        if (input.equalsIgnoreCase("yes 4")) {
            player.inventory[3] = weapon;
            System.out.println("You picked up the " + weapon.name + " spear and put in slot 4.");
        }
        if (input.equalsIgnoreCase("yes 5")) {
            player.inventory[4] = weapon;
            System.out.println("You picked up the " + weapon.name + " spear and put in slot 5.");
        }
        if (input.equalsIgnoreCase("yes 6")) {
            player.inventory[5] = weapon;
            System.out.println("You picked up the " + weapon.name + " spear and put in slot 6.");
        }
        if (input.equalsIgnoreCase("yes 7")) {
            player.inventory[6] = weapon;
            System.out.println("You picked up the " + weapon.name + " spear and put in slot 7.");
        }
        if (input.equalsIgnoreCase("yes 8")) {
            player.inventory[7] = weapon;
            System.out.println("You picked up the " + weapon.name + " spear and put in slot 8.");
        }
    }

    private void event0()
    {
        System.out.println("Upon the forest floor lie trees of yesteryear, fallen in storms long forgotten. The seasons have been harsh, stripping away the bark and outer layers, yet rendering them all the more beautiful. They have the appearance of driftwood, twisting in patterns that remind you of seaside waves; even the colour of the moss is kelp-like. They are soft, damp, yet your fingers come away dry. You tilt your head upward, the pines are several houses tall, reaching toward the golden rays of spring. Birdsong comes in lulls and bursts, the silence and the singing working together as well as any improvised melody.");
    }

    private void event1(Player player)
    {
        Scanner in = new Scanner(System.in);
        Enemy centaur = new Enemy("Centaur", 5);
        System.out.println("Walking through the woods you spot a centaur, he immediately notices you and charges.");
        boolean inCombat = true;
        while (inCombat)
        {
            if (player.health == 0) {
                System.out.print("You have been killed. Game Over");
                break;
            }
            System.out.println("Would you like to \"fight\" or \"run\"?");
            String input = in.nextLine();
            if(input.equalsIgnoreCase("fight"))
            {
                if (player.getCP() + (int)(Math.random() * 6) >  centaur.level + (int)(Math.random() * 6)) {
                    player.level += 1;
                    player.health += 1;
                    inCombat = false;
                    System.out.println("You defeated the centaur and gained 1 level");
                    Weapon spear = new Weapon("Spear", "When equipped it grants +5 combat power.", 5, 10);
                    weaponDrop(player, spear);
                }
                else {
                    player.health--;
                    System.out.println("The centaur overpowers you and hits you dealing 1 damage");
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
                    System.out.println("The centaur catches up and hits you dealing 1 damage");
                    System.out.println("You now have " + player.health + " health left.");
                }
            }
            else
            {
                player.health--;
                System.out.println("The centaur takes advantage of your inaction and hits you dealing 1 damage");
                System.out.println("You now have " + player.health + " health left.");
            }
        }
    }
    private void event2()
    {
        System.out.println("The forest was gigantic, foggy, and archaic. Its canopy was marked by hickory, sycamore, and fir, and twinkling lights bursting through their crowns allowed for colorful mushrooms to flourish in the rich grounds below.\n" +
                "Thick tree limbs suspended from a couple of trees, and an array of flowers, which were found in the most quiet places, brightened up the otherwise jade forest floor.\n" +
                "A cacophony of wild noises, belonging mostly to vermin, brightened up the forest, and added to the sounds of the croaks of frogs in the nearby ponds.");
    }
    private void event3(Player player)
    {
        Scanner in = new Scanner(System.in);
        Enemy bear = new Enemy("Bear", 2);
        System.out.println("Walking through the woods you spot a bear, it immediately notices you and charges.");
        boolean inCombat = true;
        while (inCombat)
        {
            if (player.health == 0) {
                System.out.print("You have been killed. Game Over");
                break;
            }
            System.out.println("Would you like to \"fight\" or \"run\"?");
            String input = in.nextLine();
            if(input.equalsIgnoreCase("fight"))
            {
                if (player.getCP() + (int)(Math.random() * 6) >  bear.level + (int)(Math.random() * 6)) {
                    player.level += 1;
                    player.health += 1;
                    inCombat = false;
                    System.out.println("You defeated the bear and gained 1 level");
                }
                else {
                    player.health--;
                    System.out.println("The bear overpowers you and hits you dealing 1 damage");
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
                    System.out.println("The bear catches up and hits you dealing 1 damage");
                    System.out.println("You now have " + player.health + " health left.");
                }
            }
            else
            {
                player.health--;
                System.out.println("The bear takes advantage of your inaction and hits you dealing 1 damage");
                System.out.println("You now have " + player.health + " health left.");
            }
        }
    }
    private void event4()
    {
        System.out.println("The forest was large, clear, and budding. Its canopy was marked by chestnut, alder, and sycamore, and abundant dancing lights bounced through their crowns for scattered sprouts to dominate the branch and twig laden ground below.\n" +
                "Thin tree limbs dangled from every tree, and a range of flowers, which were scattered sporadically, were a welcome change in the otherwise beige terrain.\n" +
                "A medley of noises, predominantly those of critters, resonated through the air, and were strangely synchronized with the raging river currents clashing against boulders.");
    }
}
