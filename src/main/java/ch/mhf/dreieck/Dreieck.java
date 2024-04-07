package ch.mhf.dreieck;

/*
Implementieren Sie die Berechnung der Fläche eines Dreiecks mit der Heron'schen Formel

                        A =  Wurzel { s·(s - a)·(s - b)·(s - c) }

wobei a, b, c  die Seiten des Dreiecks sind  und  s = (a + b + c) / 2 .

Wenn die vorgegebenen drei Seiten kein Dreieck bilden, soll 0 als Resultat zurückgegeben werden.
 */

public class Dreieck
{
    //Datenfelder
    private double a;
    private double b;
    private double c;

    public Dreieck()
    {
        a = 1;
        b = 1;
        c = 1;
    }

    public Dreieck(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double berechneFlaeche()
    {
        double s = ((a+b+c)/2);
        return Math.sqrt(s*(s - a)*(s - b)*(s - c));
    }

    public static void main(String[] args)
    {
        Dreieck D1 = new Dreieck();
        System.out.println(D1.berechneFlaeche());
        Dreieck D2 = new Dreieck(2, 2, 2);
        System.out.println(D2.berechneFlaeche());
    }
}