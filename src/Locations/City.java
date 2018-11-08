//Alexander Cox
//Tuesday, November 8, 2018

package Locations;

public class City extends Place{

    public City()
    {
        this.seen = false;
        this.type = "city";
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
            return "[c] ";
        return "[C] ";
    }

    private void event0()
    {
        System.out.println("event0");
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
