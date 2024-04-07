package ch.mhf.montecarlo;

import java.util.Random;

/*
 * Die Zahl π (Pi) kann annähernd mit dem sog. Monte-Carlo - Verfahren ermittelt werden.
 * Dabei betrachtet man einen Kreis mit Radius = 0.5, der einem Quadrat mit Seite = 1 eingeschrieben wird.
 * Über die Quadratfläche wird zufällig und möglichst gleichmässig eine hohe Zahl von Punkten gestreut,
 * wobei für jeden Punkt vermerkt wird, ob er innerhalb oder ausserhalb des Kreises liegt.
 * Aufgrund einer einfachen Wahrscheinlichkeitsüberlegung gilt dann mit guter Genauigkeit:
 *      (Anzahl Punkte innerhalb des Kreises) / (Gesamtzahl Punkte) =  π / 4
 * Simulieren Sie dieses Vorgehen mit einem Java-Programm und vergleichen Sie das Resultat mit einem
 * exakt-mathematischen Wert.
 */

public class MonteCarloAlgorithm
{
    private static final long ANZAHLSCHUESSE = 100_000_000;

    public double monteCarlo()
    {
        Random random = new Random();
        long anzahlTreffer = 0;
        for(long i = 1; i < ANZAHLSCHUESSE; i++)
        {
            //double x = random.nextDouble() - 0.5;   //[-0.5, +0.5]
            //double y = random.nextDouble() - 0.5;   //[-0.5, +0.5]
            double x = Math.random() - 0.5;
            double y = Math.random() - 0.5;
            double distance = Math.sqrt(x * x + y * y);
            if(distance <= 0.5)
            {
                anzahlTreffer++;
            }
        }
        return (4. * anzahlTreffer / ANZAHLSCHUESSE);
    }

    public static void main(String[] args)
    {
        MonteCarloAlgorithm berechnung = new MonteCarloAlgorithm();
        System.out.println(berechnung.monteCarlo());
    }
}