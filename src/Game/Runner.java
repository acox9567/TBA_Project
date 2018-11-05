//Alexander Cox
//Tuesday, October 30, 2018

package Game;

import java.util.Scanner;

public class Runner
{
    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        int size = 0;
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

        System.out.println(board);

        while(gameOn)
        {
            String input = in.nextLine();
            getResponse(input);
        }

        System.out.println(board);
    }

    public static void getResponse(String input)
    {

    }
}
