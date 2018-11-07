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

        Board board = new Board(10,10);

        while(!selDif) {
            System.out.println("Do you want a 'small', 'medium', or 'large' sized board?");
            String input = in.nextLine();
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

        System.out.println("What is your name?");
        String input = in.nextLine();
        String name = input;

        Player player = new Player((board.getLength()/2),(board.getLength()/2), name);

        System.out.print(player.name);

        updateFog(board, player);

        System.out.println(board);

        while(gameOn)
        {
            input = in.nextLine();
            getResponse(input);
        }

        System.out.println(board);
    }

    public static void updateFog(Board board, Player player)
    {
        for (int x = 0; x < board.map.length; x++)
        {
            for (int y = 0; y < board.map.length; y++)
            {
                if (player.xLoc != 0 && player.yLoc != 0)
                    board.map[player.xLoc - 1][player.yLoc - 1].seen = true;
                if (x != 0)
                    board.map[player.xLoc - 1][player.yLoc].seen = true;
                if (x != 0 && y != board.map.length - 1)
                    board.map[player.xLoc - 1][player.yLoc + 1].seen = true;
                if (y != 0)
                    board.map[player.xLoc][player.yLoc - 1].seen = true;
                if (x != 0 && y != board.map.length - 1)
                    board.map[player.xLoc][player.yLoc + 1].seen = true;
                if (x != board.map.length - 1 && y != 0)
                    board.map[player.xLoc + 1][player.yLoc - 1].seen = true;
                if (x != board.map.length - 1)
                    board.map[player.xLoc + 1][player.yLoc].seen = true;
                if (x != board.map.length - 1 && y != board.map.length - 1)
                    board.map[player.xLoc + 1][player.yLoc + 1].seen = true;
            }
        }
    }

    public static void getResponse(String input)
    {

    }
}
