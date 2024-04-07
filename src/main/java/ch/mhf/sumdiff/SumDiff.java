package ch.mhf.sumdiff;

/*
 * Schreiben Sie eine Methode summieren mit einer while-Schleife,
 * die alle Zahlen zwischen zwei Zahlen a  und b  aufsummiert.
 */

public class SumDiff
{
    public int summieren(int a, int b)
    {
        int resultat = 0;

        if(a <= b)
        {
            while(a <= b)
            {
                resultat += a;
                a++;
            }
        }
        else if(a >= b)
        {
            while (b <= a)
            {
                resultat += b;
                b++;
            }
        }
        return resultat;
    }

    public static void main(String[] args)
    {
        SumDiff example1 = new SumDiff();
        System.out.println(example1.summieren(1,3));    //Output 6
        SumDiff example2 = new SumDiff();
        System.out.println(example2.summieren(3,1));    //Output 6
    }
}