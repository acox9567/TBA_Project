//Alexander Cox
//Friday, November 2, 2017

package Game;

import Locations.*;

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
                if (this.map[x][y].seen)
                    str += this.map[x][y];
                else
                    str += "    ";
            }
            str += "\n";
        }
        return str;
    }

    public void generateMap()
    {
        double mProb = .2;
        double fProb = .2;
        double dProb = .2;
        double cProb = .2;
        double wProb = .2;

        for (int x = 0; x < this.map.length; x++)
        {
            for (int y = 0; y < this.map[x].length; y++)
            {
                if (x >= 1 && this.map[x - 1][y].type.equals("mountain"))
                    mProb += .2;

                else if (x >= 1 && this.map[x - 1][y].type.equals("forest"))
                    fProb += .2;

                else if (x >= 1 && this.map[x - 1][y].type.equals("desert"))
                    dProb += .2;

                else if (x >= 1 && this.map[x - 1][y].type.equals("water"))
                    wProb += .2;

                if (y >= 1 && this.map[x][y - 1].type.equals("mountain"))
                    mProb += .2;

                else if (y >= 1 && this.map[x][y - 1].type.equals("forest"))
                    fProb += .2;

                else if (y >= 1 && this.map[x][y - 1].type.equals("desert"))
                    dProb += .2;

                else if (x >= 1 && this.map[x - 1][y].type.equals("water"))
                    wProb += .2;

                double ran = Math.random() * (mProb + fProb + dProb + wProb + cProb);

                if (ran <= mProb)
                {
                    Mountain mountain = new Mountain();
                    this.addPlace(mountain, x, y);
                }
                else if (ran <= fProb + mProb)
                {
                    Forest forest = new Forest();
                    this.addPlace(forest, x, y);
                }
                else if (ran <= dProb + fProb + mProb)
                {
                    Desert desert = new Desert();
                    this.addPlace(desert, x, y);
                }
                else if (ran <= wProb + dProb + fProb + mProb)
                {
                    Water water = new Water();
                    this.addPlace(water, x, y);
                }
                else                {
                    City city = new City();
                    this.addPlace(city, x, y);
                }
            }
        }
    }
}
