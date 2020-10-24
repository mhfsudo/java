package ch.mhf.loop;

/*
 *if(bedingung1){       erste Bedingung
 *      code;
 *}else if(bedinungn){  n-te Bedingung
 *      code;
 *}else{                ansonsten
 *      code;
 *}
 *
 *continue;     //aktuelle Iteration beenden und nächsten Durchlauf starten
 */

public class IfElse
{
    public static void main(String[] args)
    {
        int i = 5;

        if(i < 4)
        {
            System.out.println(i);
        } else if (i == 5)
        {
            System.out.println("i = 5"); //output i = 5
        } else
        {
            System.out.println("i > 5");
        }
    }
}