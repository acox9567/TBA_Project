//Alexander Cox
//Tuesday, October 30, 2018

package Game;

import Locations.Forest;
import Locations.Place;

public class Runner {
    private static boolean gameOn = true;

    public static void main (String[] args)
    {
        Place[][] map = new Place[5][5];

        for (int x = 0; x < map.length; x++)
        {
            for (int y = 0; y < map[x].length; y++)
            {
                map[x][y] = new Place(x,y);
            }
        }

        //Create random forest
        int x = (int)(Math.random() * map.length);
        int y = (int)(Math.random() * map.length);
        map[x][y] = new Forest(x,y);

        //Create random mountain
        x = (int)(Math.random() * map.length);
        y = (int)(Math.random() * map.length);
        map[x][y] = new Forest(x,y);

        for (int i = 0; i < map.length - 1; i++)
        {
            for (int j = 0; j < map[i].length - 1; i++)
                System.out.print(map[i][j]);
            System.out.print("\n");
        }
    }
}
