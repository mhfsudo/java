package ch.mhf.eingabe;

import javax.swing.JOptionPane;

public class Eingabe
{
    private static double radius;

    double berechneUmfang()
    {
        return 2.0 * 3.1415926 * radius;
    }

    double berechneFlaeche()
    {
        return 3.1415926 * radius * radius;
    }

    static void erfasseRadius()
    {
        String eingabe;
        eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
        radius = Double.parseDouble(eingabe);
    }

    public static void main(String[] args)
    {
        double u;
        double f;

        Eingabe instanz = new Eingabe();

        erfasseRadius();
        u = instanz.berechneUmfang();
        System.out.println("Umfang : ");
        System.out.println(u);

        f = instanz.berechneFlaeche();
        System.out.println("Flaeche : ");
        System.out.println(f);
    }
}