package ch.mhf.zinsen;

public class Zinsen {
    double startkapital;
    double zinssatz;
    double laufzeit;
    double endkapitalOhneZins;
    double endkapitalMitZins;

    public Zinsen(double startkapital, double zinssatz, double laufzeit)
    {
        this.startkapital = startkapital;
        this.zinssatz = zinssatz;
        this.laufzeit = laufzeit;
    }

    public double berechneOhneZins()
    {
        return endkapitalOhneZins = startkapital * (1 + zinssatz/100 * laufzeit);
    }

    public double berechneMitZins()
    {
        return endkapitalMitZins = startkapital * Math.pow((1 + zinssatz/100),laufzeit);
    }

    public void printOhneZins()
    {
        System.out.println(endkapitalOhneZins);
    }

    public void printMitZins()
    {
        System.out.println(endkapitalMitZins);
    }

    public static void main(String[] args)
    {
        Zinsen zins1 = new Zinsen(15000, 3.5, 7);
        zins1.berechneOhneZins();
        zins1.berechneMitZins();
        zins1.printOhneZins();
        zins1.printMitZins();
    }
}