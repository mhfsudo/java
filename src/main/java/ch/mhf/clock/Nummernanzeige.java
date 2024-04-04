package ch.mhf.clock;

public class Nummernanzeige
{

    private int number;
    private final int limit;

    public Nummernanzeige(int limit)
    {
        this.limit = limit;
        number = 0;
    }

    public void setNumber(int startNumber)
    {
        number = startNumber;
    }

    public int getNumber()
    {
        return number;
    }

    public String getDisplay()
    {
        if(number < 10)
        {
            return "0" + number; //int Wert wird als String zurückgegeben
        }else
        {
            return "" + number; //int Wert wird als String zurückgegeben
        }
    }

    public void increaseNumber()
    {
        number = (number + 1) % limit;
    }
}