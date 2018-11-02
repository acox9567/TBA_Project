//Alexander Cox
//Tuesday, October 30, 2018

package Game;

import Locations.Forest;
import Locations.Mountains;
import Locations.Place;

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

        generateMap(board);

        System.out.println(board);

        while(gameOn)
        {
            String input = in.nextLine();
            getResponse(input);
        }

        System.out.println(board);
    }

    public static void generateMap(Board board)
    {
        int area = 0;

        for (int x = 0; x < board.map.length; x++)
        {
            for (int y = 0; y < board.map[x].length; y++)
            {
                Place place = new Place(x, y);
                board.addPlace(place, x, y);
                area++;
            }
        }

        //Creates a random number of mountains to take up between 0% and 50% of the map
        int numMountains = (int)(Math.random() * area) / 2;

        for (int i = 0; i < numMountains; i++)
        {
            int x = (int) (Math.random() * board.map.length);
            int y = (int) (Math.random() * board.map.length);
            board.map[x][y] = new Mountains(x, y);
        }

        //Creates a random number of forests to take up between 0% and 50% of the map
        int numForests = (int)(Math.random() * area) / 2;

        for (int i = 0; i < numForests; i++)
        {
            int x = (int) (Math.random() * board.map.length);
            int y = (int) (Math.random() * board.map.length);
            board.map[x][y] = new Forest(x, y);
        }
    }

    public static void getResponse(String input)
    {

    }
}
