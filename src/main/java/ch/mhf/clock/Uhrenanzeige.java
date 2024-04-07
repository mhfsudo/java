package ch.mhf.clock;

public class Uhrenanzeige
{
    //Fields
    private final Nummernanzeige hours;
    private final Nummernanzeige minutes;

    public Uhrenanzeige()
    {
        hours = new Nummernanzeige(24);
        minutes = new Nummernanzeige(60);
    }

    public Uhrenanzeige(int startHours, int startMinutes)
    {
        hours = new Nummernanzeige(24);
        minutes = new Nummernanzeige(60);
        hours.setNumber(startHours);
        minutes.setNumber(startMinutes);
    }

    private void clockSignal()
    {
        minutes.increaseNumber();
        if(minutes.getNumber() == 0)
        {
            hours.increaseNumber();
        }
    }

    public void updateDisplay(int timer)
    {
        for(int i = 0; i < timer; i++)
        {
            System.out.println(hours.getDisplay() + ":" + minutes.getDisplay());
            clockSignal();
        }
    }

    public static void main(String[] args)
    {
        Uhrenanzeige uhr = new Uhrenanzeige(12, 1);
        uhr.updateDisplay(62);
    }
}