//Alexander Cox
//Friday, November 2, 2017

package Game;

import Locations.Place;

public class Board
{
    Place[][] map;

    public Board(Place[][] map)
    {
        this.map = map;
    }

    public Board(int width, int height)
    {
        this.map = new Place[height][width];
    }

    public void addPlace(Place place, int x, int y)
    {
        this.map[x][y] = place;
    }

    public String toString()
    {
        String str = "";
        for (int x = 0; x < this.map.length; x++)
        {
            for (int y = 0; y < this.map.length; y++)
                str += this.map[x][y];
            str += "\n";
        }
        return str;
    }
}
