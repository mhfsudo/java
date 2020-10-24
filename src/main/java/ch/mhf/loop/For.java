package ch.mhf.loop;

/*
 * break;     //Schleife verlassen
 * continue;  //aktuelle Iteration beenden und nächsten Durchlauf starten
 *
 *for(initalisierung; schleifenbedingung; schlussanweisung){
 *      code
 *}
 *
 *continue;     //aktuelle Iteration beenden und nächsten Durchlauf starten
 */


public class For {

    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i); 			//output 0 1 2 3 4
        }
    }
}