//Alexander Cox
//Tuesday, October 30, 2018

package Game;

import People.Player;
import java.util.Scanner;

public class Runner
{
	private static boolean gameOn = true;

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

		System.out.print(player.name);

		updateFog(board, player);

		board.map[player.xLoc][player.yLoc].isHere = true;

		System.out.println(board);

		board.map[player.xLoc][player.yLoc].getEvent();

		System.out.println("What would you like to do?");

		while(gameOn)
		{
			input = in.nextLine();
			getResponse(input, player, board);
		}

		System.out.println(board);
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
        boolean helpBool = false;

	    board.map[player.xLoc][player.yLoc].wasHere = true;
	    board.map[player.xLoc][player.yLoc].isHere = false;

	    if(input.equalsIgnoreCase("help")) {
            help();
            helpBool = true;
        }
        if(input.equalsIgnoreCase("north") || input.equalsIgnoreCase("n"))
            player.xLoc -= 1;
        if(input.equalsIgnoreCase("south") || input.equalsIgnoreCase("s"))
            player.xLoc += 1;
        if(input.equalsIgnoreCase("east") || input.equalsIgnoreCase("e"))
            player.yLoc += 1;
        if(input.equalsIgnoreCase("west") || input.equalsIgnoreCase("w"))
            player.yLoc -= 1;

        board.map[player.xLoc][player.yLoc].isHere = true;
        updateFog(board, player);

        if (!helpBool)
            System.out.println(board);

        board.map[player.xLoc][player.yLoc].getEvent();

        System.out.println("What would you like to do?");
	}

	private static void help()
    {
        System.out.println("HELP:\n");

        System.out.println("The map printed above represents different places with each letter representing a different type of area.");
        System.out.println("    [M] - mountain");
        System.out.println("    [D] - desert");
        System.out.println("    [F] - forest\n");

        System.out.println("If the letter is lowercase; it signifies that you have already explored that area.\n");
        System.out.println("Movement is controlled by typing in a compass direction to move in the corresponding direction on the map.");
        System.out.println("This is not case sensitive and for short hand you may also type in simply the first letter of the direction.");
        System.out.println("    North - moves the location of you character one tile north");
        System.out.println("    South - moves the location of you character one tile south");
        System.out.println("    East - moves the location of you character one tile east");
        System.out.println("    West - moves the location of you character one tile west");
    }
}
