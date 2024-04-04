package ch.mhf.ggt;

/*
 * Der grösste gemeinsame Teiler (ggT) von zwei ganzen positiven Zahlen X und Y kann (auch) mit dem sog. Euklid'schen Verfahren ermittelt werden.
 * Dabei werden die untenstehenden Schritte (i) - (iii)  befolgt.
 *
 *  (i)   Wenn X = Y :  ggt = X ,  die Ermittlung terminiert
 *  (ii)   Wenn  X > Y : X wird mit  X - Y  erstetzt,  andernfalls : Y wird mit  Y - X ersetzt
 *  (iii)  Rückkehr zu (i) mit den neuen Werten von X und Y
 *
 * Implementieren Sie eine Methode mit der Signatur
 *  int ggT( int x, int y) ,
 *
 * welche das obige Verfahren mit rekursiven Methodenaufrufen umsetzt.
 */

public class Ggt
{
    public int ggt(int x, int y)
    {
        int ggt = 0;
        //i
        if(x == y)
        {
            return x;
        }

        //ii
        if(x > y)
        {
            x = x - y;
        }
        else
        {
            y = y - x;
        }

        //iii
        return ggt(x , y);
    }

    public static void main(String[] args)
    {
        Ggt berechnung = new Ggt();
        System.out.println(berechnung.ggt(12,15));
    }
}