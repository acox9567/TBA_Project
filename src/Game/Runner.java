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
        while(!selDif) {
            System.out.println("Small, medium, or large");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("small")) {
                size = 5;
                selDif = true;
            } else if (input.equalsIgnoreCase("medium")) {
                size = 10;
                selDif = true;
            } else if (input.equalsIgnoreCase("large")) {
                size = 15;
                selDif = true;
            }
        }

        Place[][] map = new Place[size][size];

        for (int x = 0; x < map.length; x++)
        {
            for (int y = 0; y < map[x].length; y++)
            {
                map[x][y] = new Place(x,y);
            }
        }

        generateMap(map);

        displayMap(map);
    }
    public static void generateMap(Place[][] map)
    {
        int area = 0;

        for (int x = 0; x < map.length; x++)
        {
            for (int y = 0; y < map[x].length; y++)
            {
                area++;
            }
        }

        //Creates a random number of mountains to take up between 0% and 50% of the map
        int numMountains = (int)(Math.random() * area) / 2;

        for (int i = 0; i < numMountains; i++)
        {
            int x = (int) (Math.random() * map.length);
            int y = (int) (Math.random() * map.length);
            map[x][y] = new Mountains(x, y);
        }

        //Creates a random number of forests to take up between 0% and 50% of the map
        int numForests = (int)(Math.random() * area) / 2;

        for (int i = 0; i < numForests; i++)
        {
            int x = (int) (Math.random() * map.length);
            int y = (int) (Math.random() * map.length);
            map[x][y] = new Forest(x, y);
        }
    }
    public static void displayMap(Place[][] map)
    {
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
                System.out.print(map[i][j]);
            System.out.print("\n");
        }
    }
}
