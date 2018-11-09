//Alexander Cox
//November 5, 2018

package Locations;

import Items.Weapon;
import People.Enemy;
import People.Player;

import java.util.Scanner;

public class Desert extends Place{

    public Desert()
    {
        this.seen = false;
        this.type = "desert";
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
            return "[d] ";
        return "[D] ";
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
        System.out.println("The cruel sun beat down, it's one malevolent eye unblinking, and the sky was it's co-conspirator with not even a wisp of cloud to soften the harsh rays. The lizards took shelter in the shadows of the rocks where the sand was not hot enough to roast them, but there was no shade large enough for us. Each step sunk into the searing sand, the air was thick and hazy, each breath like drowning in larva.");
    }

    private void event1(Player player)
    {
        Scanner in = new Scanner(System.in);
        Enemy bandit = new Enemy("Bandit", 1);
        System.out.println("Walking through the desert you spot a bandit, he immediately notices you and charges.");
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
                if (player.getCP() + (int)(Math.random() * 6) >  bandit.level + (int)(Math.random() * 6)) {
                    player.level += 1;
                    player.health += 1;
                    inCombat = false;
                    System.out.println("You defeated the bandit and gained 1 level");
                    Weapon longsword = new Weapon("Longsword", "When equipped it grants +3 combat power.", 3, 10);
                    weaponDrop(player, longsword);
                }
                else {
                    player.health--;
                    System.out.println("The bandit overpowers you and hits you dealing 1 damage");
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
                    System.out.println("The bandit catches up and hits you dealing 1 damage");
                    System.out.println("You now have " + player.health + " health left.");
                }
            }
            else
            {
                player.health--;
                System.out.println("The bandit takes advantage of your inaction and hits you dealing 1 damage");
                System.out.println("You now have " + player.health + " health left.");
            }
        }
    }
    private void event2()
    {
        System.out.println("The desert at twilight was a vast undulating sea, punctuated by the shadowy silhouettes of cactus, like great ghost ships upon the sandy waves.");
    }
    private void event3(Player player){
        Scanner in = new Scanner(System.in);
        Enemy scorpion = new Enemy("Giant Scorpion", 6);
        System.out.println("Walking through the desert you spot a giant scorpion, it immediately notices you and charges.");
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
                if (player.getCP() + (int)(Math.random() * 6) >  scorpion.level + (int)(Math.random() * 6)) {
                    player.level += 1;
                    player.health += 1;
                    inCombat = false;
                    System.out.println("You defeated the giant scorpion and gained 1 level");
                }
                else {
                    player.health--;
                    System.out.println("The giant scorpion overpowers you and hits you dealing 1 damage");
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
                    System.out.println("The giant scorpion catches up and hits you dealing 1 damage");
                    System.out.println("You now have " + player.health + " health left.");
                }
            }
            else
            {
                player.health--;
                System.out.println("The giant scorpion takes advantage of your inaction and hits you dealing 1 damage");
                System.out.println("You now have " + player.health + " health left.");
            }
        }
    }
    private void event4()
    {
        System.out.println("Wind stirs up the wispy sand and the sun’s never ending rays beat down on you mercilessly. Salty sweat rolls off your nose and stings your eyes. Your clothing is overwhelmingly hot and sticky. The stiff, dry desert breeze blows sand into your eyes and makes your hair stiff with salt. Your tongue feels as if it’s coated in fur and your lips are chapped and dry.");
    }
}