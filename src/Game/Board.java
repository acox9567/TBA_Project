//Alexander Cox
//Friday, November 2, 2017

package Game;

import Locations.Desert;
import Locations.Forest;
import Locations.Mountain;
import Locations.Place;

public class Board
{
    public Place[][] map;

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
            {
                if (this.map[x][y].seen == true)
                    str += this.map[x][y];
                else
                    str += "    ";
            }
            str += "\n";
        }
        return str;
    }

    public int getLength()
    {
        return this.map.length;
    }

    public void generateMap()
    {
        double mProb = .25;
        double fProb = .25;
        double dProb = .25;

        for (int x = 0; x < this.map.length; x++)
        {
            for (int y = 0; y < this.map[x].length; y++)
            {
                if (x >= 1 && this.map[x - 1][y].equals("[M] "))
                    mProb += 100;

                else if (x >= 1 && this.map[x - 1][y].equals("[F] "))
                    fProb += 5;

                else if (x >= 1 && this.map[x - 1][y].equals("[D] "))
                    dProb += 5;

                if (y >= 1 && this.map[x][y - 1].equals("[M] "))
                    mProb += 100;

                else if (y >= 1 && this.map[x][y - 1].equals("[F] "))
                    fProb += 5;

                else if (y >= 1 && this.map[x][y - 1].equals("[D] "))
                    dProb += 5;

                double ran = Math.random() * (mProb + fProb + dProb);

                if (ran <= mProb)
                {
                    Mountain mountain = new Mountain(false, x, y);
                    this.addPlace(mountain, x, y);
                }
                else if (ran <= fProb + mProb)
                {
                    Forest forest = new Forest(false, x, y);
                    this.addPlace(forest, x, y);
                }
                else if (ran <= dProb + fProb + mProb)
                {
                    Desert desert = new Desert(false, x, y);
                    this.addPlace(desert, x, y);
                }
            }
        }
    }
}
