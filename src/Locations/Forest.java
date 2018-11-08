//Alexander Cox
//Tuesday, October 30, 2018

package Locations;

public class Forest extends Place{

    public Forest()
    {
        this.seen = false;
        this.type = "forest";
        isHere = false;
        wasHere = false;
        event = (int)(Math.random() * 5);
    }

    public void getEvent()
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
            return "[f] ";
        return "[F] ";
    }

    private void event0()
    {
        System.out.println("Upon the forest floor lie trees of yesteryear, fallen in storms long forgotten. The seasons have been harsh, stripping away the bark and outer layers, yet rendering them all the more beautiful. They have the appearance of driftwood, twisting in patterns that remind you of seaside waves; even the colour of the moss is kelp-like. They are soft, damp, yet your fingers come away dry. You tilt your head upward, the pines are several houses tall, reaching toward the golden rays of spring. Birdsong comes in lulls and bursts, the silence and the singing working together as well as any improvised melody.");
    }

    private void event1()
    {
        System.out.println("event1");
    }
    private void event2()
    {
        System.out.println("event2");
    }
    private void event3()
    {
        System.out.println("event3");
    }
    private void event4()
    {
        System.out.println("event4");
    }
}
