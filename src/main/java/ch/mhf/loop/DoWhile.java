package ch.mhf.loop;

/*
 * break;     //Schleife verlassen
 * continue;  //aktuelle Iteration beenden und nächsten Durchlauf starten
 *
 * The loop will always be executed at least once (Fussgesteuert)
 *
 * do{                  //mindestens ein durchlauf
 *      code;
 * }
 * while(bedingung);    //solange Bedingung erfüllt ist
 *
 */

public class DoWhile
{
    public static void main(String[] args)
    {
        int i = 0;

        do
        {
            System.out.println(i);              //output 0 1 2 3 4
            i++;
        }
        while(i < 5);
    }
}