package ch.mhf.quersumme;

/*
 * Zu implementieren ist eine Methode mit der Signatur
 * int quersumme( int eingabe ) ,
 * wobei  eingabe >= 0 .
 * Die obige Methode soll aus der Darstellung von eingabe im Zahlensystem mit der Basis systembasis  die Quersumme bilden.
 * Die Methode soll auch für systembasis > 16 funktionieren - daher ist der Weg über eine explizite Umwandlung von eingabe
 * in einen String problematisch (weil die Symbole für Ziffern > 16 nicht allgemeingültig festgelegt sind).
 * Hinweis: Erwägen Sie einen rekursiven Ansatz.
 */

public class Quersumme
{

    public long berechneQuersumme(long zahl)
    {
        long summe = 0;
        if(zahl > 0)
        {
            summe = (zahl % 10) + berechneQuersumme(zahl / 10);
        }
        return summe;
    }

    public static void main(String[] args)
    {
        Quersumme berechnung = new Quersumme();
        System.out.println(berechnung.berechneQuersumme(123));     //Output 6 (1+2+3)
    }
}