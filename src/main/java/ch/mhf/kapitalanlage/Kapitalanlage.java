package ch.mhf.kapitalanlage;

/*
Implementieren Sie eine Klasse Kapitalanlage via BlueJ. Die Klasse hat ein 3 Datenfelder:

- Kapitalbestand
- Jährlicher Zinssatz in %
- Jahr der letzten Zinsvergütung
- Monat der letzten Zinsvergütung als Zahl 1 - 12

Es wird zwecks Vereinfachung angenommen, dass die Zinsvergütungen immer am letzten Tag des Monats erfolgen.

Stellen Sie Methoden zur Verfügung, um alle Datenfelder zu extrahieren und zu ändern. Zusätzlich soll eine Methode
vorhanden sein, welche die Zinsgutschrift für ein bestimmtes Monatsende (Jahr + Monat) berechnet. Eine andere
Methode soll den aus der Gutschrift resultierenden neuen Kapitalbestand zurückgeben. Schliesslich soll es möglich
sein, den Zinsertrag effektiv gutzuschreiben.
 */

public class Kapitalanlage
{
    //Datenfelder
    private int kapitalbestand;
    private int Zinssatz;
    private int jahr;
    private int monat;

    public Kapitalanlage()
    {
        kapitalbestand = 1;
        Zinssatz = 1;
        jahr = 2000;
        monat = 1;
    }

    public static void main(String[] args)
    {
        Kapitalanlage K1 = new Kapitalanlage();
    }
}