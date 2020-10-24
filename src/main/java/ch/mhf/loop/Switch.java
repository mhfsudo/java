package ch.mhf.loop;

/*
 *Use the switch statement to select one of many code blocks to be executed
 *
 *switch(option){
 *case bedingung1:      erste Bedingung
 *      code;
 *      break;          verlässt die Schleife wenn Bedingung zu trifft
 *case bedingungn:      n-te Bedingung
 *      code;
 *      break;
 *default:              wenn keine Bedingung erfüllt ist
 *      code;
 *}
 *
 *continue;     //aktuelle Iteration beenden und nächsten Durchlauf starten
 */

public class Switch
{
    public static void main(String[] args)
    {
        String str = "Lisa";

        switch (str)
        {
            case "Lisa":
                System.out.println("it's Lisa");                    //it's Lisa
                break;
            case "Corina":
                System.out.println("it's Corina");
                break;
            case "Samuel":
                System.out.println("it's Samuel");
                break;
            default:
                System.out.println("it's nobody from my family");
        }
    }
}