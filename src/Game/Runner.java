//Alexander Cox
//Tuesday, October 30, 2018

package Game;

import People.Player;
import java.util.Scanner;

public class Runner
{
	public static boolean gameOn = true;

	public static void main(String[] args)
	{
		boolean selDif = false;

		Scanner in = new Scanner(System.in);
        System.out.println("What will be your character's name?");
        String input = in.nextLine();
        String name = input;

		Board board = new Board(10,10);

		while(!selDif) {
			System.out.println("Do you want a 'small', 'medium', or 'large' sized board?");
			input = in.nextLine();
			if (input.equalsIgnoreCase("small")) {
				selDif = true;
			} else if (input.equalsIgnoreCase("medium")) {
				board = new Board(15,15);
				selDif = true;
			} else if (input.equalsIgnoreCase("large")) {
				board = new Board(20,20);
				selDif = true;
			}
		}

		board.generateMap();

		Player player = new Player((board.map.length/2),(board.map.length/2), name);

		System.out.print("Enter \"help\" to see instructions and help on how to play");

		updateFog(board, player);

		board.map[player.xLoc][player.yLoc].isHere = true;

		System.out.println(board);

		board.map[player.xLoc][player.yLoc].getEvent(player);

		System.out.println("What would you like to do?");

		while(gameOn)
		{
			if (player.health <= 0) {
				System.out.println("You have died.");
				break;
			}
			input = in.nextLine();
			getResponse(input, player, board);
		}
	}

	private static void updateFog(Board board, Player player)
	{
		board.map[player.xLoc][player.yLoc].seen = true;
		board.map[player.xLoc - 1][player.yLoc - 1].seen = true;
		board.map[player.xLoc - 1][player.yLoc].seen = true;
		board.map[player.xLoc - 1][player.yLoc + 1].seen = true;
		board.map[player.xLoc][player.yLoc - 1].seen = true;
		board.map[player.xLoc][player.yLoc + 1].seen = true;
		board.map[player.xLoc + 1][player.yLoc - 1].seen = true;
		board.map[player.xLoc + 1][player.yLoc].seen = true;
		board.map[player.xLoc + 1][player.yLoc + 1].seen = true;
	}

	private static void getResponse(String input, Player player, Board board)
	{
		board.map[player.xLoc][player.yLoc].wasHere = true;
	    board.map[player.xLoc][player.yLoc].isHere = false;

	    if (input.equalsIgnoreCase("help")) {
            help();
        }
        if (input.equalsIgnoreCase("Char info")) {
			System.out.println(player);
		}

		if (input.equalsIgnoreCase("drop 1")) {
			player.inventory[0] = null;
		}
		if (input.equalsIgnoreCase("drop 2")) {
			player.inventory[1] = null;
		}
		if (input.equalsIgnoreCase("drop 3")) {
			player.inventory[2] = null;
		}
		if (input.equalsIgnoreCase("drop 4")) {
			player.inventory[3] = null;
		}
		if (input.equalsIgnoreCase("drop 5")) {
			player.inventory[4] = null;
		}
		if (input.equalsIgnoreCase("drop 6")) {
			player.inventory[5] = null;
		}
		if (input.equalsIgnoreCase("drop 7")) {
			player.inventory[6] = null;
		}
		if (input.equalsIgnoreCase("drop 8")) {
			player.inventory[7] = null;
		}

		if (player.inventory[0] != null && input.equalsIgnoreCase("use 1")) {
			player.inventory[0].use();
		}
		if (player.inventory[1] != null && input.equalsIgnoreCase("use 2")) {
			player.inventory[1] = null;
		}
		if (player.inventory[2] != null && input.equalsIgnoreCase("use 3")) {
			player.inventory[2] = null;
		}
		if (player.inventory[3] != null && input.equalsIgnoreCase("use 4")) {
			player.inventory[3] = null;
		}
		if (player.inventory[4] != null && input.equalsIgnoreCase("use 5")) {
			player.inventory[4] = null;
		}
		if (player.inventory[5] != null && input.equalsIgnoreCase("use 6")) {
			player.inventory[5] = null;
		}
		if (player.inventory[6] != null && input.equalsIgnoreCase("use 7")) {
			player.inventory[6] = null;
		}
		if (player.inventory[7] != null && input.equalsIgnoreCase("use 8")) {
			player.inventory[7] = null;
		}

        if (player.xLoc != 0 && input.equalsIgnoreCase("north") || input.equalsIgnoreCase("n")) {
			player.xLoc -= 1;
			board.map[player.xLoc][player.yLoc].isHere = true;
			updateFog(board, player);
			System.out.println(board);
			board.map[player.xLoc][player.yLoc].getEvent(player);
		}
        if (player.xLoc != board.map.length && input.equalsIgnoreCase("south") || input.equalsIgnoreCase("s")) {
			player.xLoc += 1;
			board.map[player.xLoc][player.yLoc].isHere = true;
			updateFog(board, player);
			System.out.println(board);
			board.map[player.xLoc][player.yLoc].getEvent(player);
		}
		if (player.xLoc != board.map.length && input.equalsIgnoreCase("east") || input.equalsIgnoreCase("e")) {
			player.yLoc += 1;
			board.map[player.xLoc][player.yLoc].isHere = true;
			updateFog(board, player);
			System.out.println(board);
			board.map[player.xLoc][player.yLoc].getEvent(player);
		}
		if (player.yLoc != 0 && input.equalsIgnoreCase("west") || input.equalsIgnoreCase("w")) {
			player.yLoc -= 1;
			board.map[player.xLoc][player.yLoc].isHere = true;
			updateFog(board, player);
			System.out.println(board);
			board.map[player.xLoc][player.yLoc].getEvent(player);
		}

        System.out.println("What would you like to do?");
	}

	private static void help()
    {
        System.out.println("HELP:\n");

        System.out.println("The map printed above represents different places with each letter representing a different type of area.");
        System.out.println("    [M] - mountain");
        System.out.println("    [D] - desert");
        System.out.println("    [F] - forest");
		System.out.println("    [C] - city\n");

		System.out.println("Upon entering a new tile an event will occur with varying results.");

        System.out.println("If the letter is lowercase; it signifies that you have already explored that area.\n");
        System.out.println("Movement is controlled by typing in a compass direction to move in the corresponding direction on the map.");
        System.out.println("This is not case sensitive and for short hand you may also type in simply the first letter of the direction.");
        System.out.println("    North - moves the location of you character one tile north");
        System.out.println("    South - moves the location of you character one tile south");
        System.out.println("    East - moves the location of you character one tile east");
        System.out.println("    West - moves the location of you character one tile west\n");

        System.out.println("To see information on your character enter \"char info\".\n");

		System.out.println("You can only hold 8 items at once but only have one equipped.\nTo drop an item enter \"drop x\", x being the number of the item in your inventory which can be found under character info.\nTo equip an item enter \"equip x\", x being the number of the item in your inventory which can be found under character info.");

    }
}