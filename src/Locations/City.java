//Alexander Cox
//Tuesday, November 8, 2018

package Locations;

import People.Player;

public class City extends Place{

    public City()
    {
        this.seen = false;
        this.type = "city";
        isHere = false;
        wasHere = false;
        event = (int)(Math.random() * 5);
    }

    public void getEvent(Player player)
    {
        if (event == 0)
            event0();
        else if (event == 1)
            event1();
        else if (event == 2)
            event2();
        else if (event == 3)
            event3();
        else
            event4();
    }

    public String toString()
    {
        if (isHere)
            return "[ ] ";
        if (wasHere)
            return "[c] ";
        return "[C] ";
    }

    private void event0()
    {
        System.out.println("Fabricated under a woodlands, the township of Goldenleaf is home to humans lead by Colonel Dallin.\n" +
                "This township wasn't built by a woodlands by accident, as it has a comfortable weather system, which is of great importance to the people of Goldenleaf and its success.\n" +
                "\n" +
                "The township itself looks imposing. With its ironwood rooftops, lavastone walls and frozen waterfall, Goldenleaf has a fascinating atmosphere.\n" +
                "The main attraction is the power plant, which was built 68 years ago and designed by night elves.\n" +
                "\n" +
                "Goldenleaf has a declining economy, which is mainly supported by mining, weaponsmithing and fishing. But their biggest strengths are gorgeous leatherworking and skilled in the art of war.\n" +
                "However, Goldenleaf lacks people skilled in baking.\n" +
                "\n" +
                "Despite its strengths and weaknesses, Goldenleaf is most likely headed towards a somber future under the leadership of Colonel Dallin. But this remains to be seen.\n");
    }
    private void event1()
    {
        System.out.println("Raised on the end of a woodlands, the settlement of Frostford is home to barbarians lead by Duchess Geary.\n" +
                "This settlement wasn't built by a woodlands by accident, as it has escape routes, which is of great importance to the people of Frostford and its success.\n" +
                "\n" +
                "The settlement itself looks majestic. With its silky oak wood rooftops, chiseled stone walls and aromatic flowers, Frostford has a entrancing atmosphere.\n" +
                "The main attraction is the greenhouse, which was built 66 years ago and designed by night elves.\n" +
                "\n" +
                "Frostford has a feeble economy, which is mainly supported by farming, mining and fletching. But their biggest strengths are rare animal training and alchemy.\n" +
                "However, Frostford lacks people skilled in fishing.\n" +
                "\n" +
                "Despite its strengths and weaknesses, Frostford is most likely headed towards a terrible future under the leadership of Duchess Geary. But this remains to be seen.\n");
    }
    private void event2()
    {
        System.out.println("Situated on top of a grove, the crossroad of Hull is home to vampires lead by Captain Barnfield.\n" +
                "This crossroad wasn't built by a grove by accident, as it has dark ruins, which is of great importance to the people of Hull and its success.\n" +
                "\n" +
                "The crossroad itself looks grandiose. With its willow wood rooftops, red brick walls and the native bird species, Hull has a fascinating atmosphere.\n" +
                "The main attraction is the monument, which was built 46 years ago and designed by orcs.\n" +
                "\n" +
                "Hull has a flourishing economy, which is mainly supported by trade, animal training and hunting. But their biggest strengths are intricate fletching techniques and highly skilled thieving.\n" +
                "However, Hull lacks people skilled in herbalism.\n" +
                "\n" +
                "Despite its strengths and weaknesses, Hull is most likely headed towards a luxuriant future under the leadership of Captain Barnfield. But this remains to be seen.\n");
    }
    private void event3()
    {
        System.out.println("Found on the highest point of a woodlands, the hamlet of Hiborane is home to elves lead by Judge Elluin.\n" +
                "This hamlet wasn't built by a woodlands by accident, as it has unique wildlife, which is of great importance to the people of Hiborane and its success.\n" +
                "\n" +
                "The hamlet itself looks grandiose. With its willow wood rooftops, maple wood walls and bamboo forest, Hiborane has a intriguing atmosphere.\n" +
                "The main attraction is the theatre, which was built 65 years ago and designed by vampires.\n" +
                "\n" +
                "Hiborane has a prosperous economy, which is mainly supported by trade, mining and fishing. But their biggest strengths are complex crafting and gorgeous leatherworking.\n" +
                "However, Hiborane lacks people skilled in farming.\n" +
                "\n" +
                "Despite its strengths and weaknesses, Hiborane is most likely headed towards a enjoyable future under the leadership of Judge Elluin. But this remains to be seen.\n");
    }
    private void event4()
    {
        System.out.println("Located on the peak of a mound, the megalopolis of Sinashari is home to dark elves lead by Ruler Alen.\n" +
                "This megalopolis wasn't built by a mound by accident, as it has ancient burial grounds, which is of great importance to the people of Sinashari and its success.\n" +
                "\n" +
                "The megalopolis itself looks mundane. With its decaying rooftops, gloomy wooden walls and large cobwebs, Sinashari has a bizarre atmosphere.\n" +
                "The main attraction is the large park, which was built 52 years ago and designed by trolls.\n" +
                "\n" +
                "Sinashari has a progressing economy, which is mainly supported by trade, medicine and farming. But their biggest strengths are refined carpenting and alchemy.\n" +
                "However, Sinashari lacks people skilled in herbalism.\n" +
                "\n" +
                "Despite its strengths and weaknesses, Sinashari is most likely headed towards a beautiful future under the leadership of Ruler Alen. But this remains to be seen.\n");
    }
}
