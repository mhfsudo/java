package ch.mhf.loop;

/*
 * break;     //Schleife verlassen
 * continue;  //aktuelle Iteration beenden und nächsten Durchlauf starten
 *
 *The while loop loops through a block of code as long as a
 *specified condition is true (Kopfgesteuert)
 *
 *while(bedingung){     //solange Bedingung erfüllt ist
 *      code;
 *}
 */

public class While
{
    public static void main(String[] args)
    {
        int i = 0;

        while(i < 5)
        {
            System.out.println(i);              //output 0 1 2 3 4
            i++;
        }
    }
}