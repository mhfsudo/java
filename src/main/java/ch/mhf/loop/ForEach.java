package ch.mhf.loop;

/*
 *Exclusively to iterate over an array
 *
 *breack;		//Schleife verlassen
 *continue;     //aktuelle Iteration beenden und nächsten Durchlauf starten
 */

public class ForEach
{
    public static void main(String[] args)
    {
        int[] myNumbers = {0,1,2,3,4};
        for (int currentElement : myNumbers)
        {
            System.out.println(currentElement);              //output 0 1 2 3 4
        }
    }
}