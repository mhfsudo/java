package ch.mhf.prim;

/**
 * Methode die tested, ob eine Zahl eine Primzahl ist (Durch 1 und sich selber)
 * @param n Zahl die getested werden soll
 * @return true wenn n eine Primzahl ist, sonst false
 */

public class PrimTest
{
    public static boolean istPrimFor(int n)
    {
        boolean resultat = true;
        if (n >= 2)
        {
            for (int teiler = 2; teiler < n; teiler++)
            {
                if (n % teiler == 0)
                {
                    resultat = false;
                }
            }
        } else
        {
            resultat = false;
        }
        return resultat;
    }

    public static boolean istPrimWhile(int n)
    {
        int teiler = 2;
        boolean resultat = true;

        while ((teiler < n) && (resultat))
        {
            if((n % teiler) == 0)
            {
                resultat = false;
            }
            teiler++;
        }
        return resultat;
    }

    public static void main(String[] args)
    {
        PrimTest testFor = new PrimTest();
        System.out.println(testFor.istPrimFor(2));          //Output true

        PrimTest testWhile = new PrimTest();
        System.out.println(testWhile.istPrimWhile(2));      //Output true
    }
}