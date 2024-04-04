package ch.mhf.kreis;

/*
Implementieren Sie eine Klasse Kreis via BlueJ. Die Klasse hat ein Datenfeld Radius. Sie beinhaltet Methoden um den
Radius anzuzeigen und zu ändern. Zusätzlich biete sie Methoden zur Berechnung des Kreisumfangs und der Kreisfläche an.
 */

public class Kreis
{
    private static final double PI = 3.144;

    //Datenfelder
    private int radius;

    public Kreis()
    {
        radius = 1;
    }

    public Kreis(int radius)
    {
        this.radius = radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public double berechneUmfang()
    {
        return (2 * PI * radius);
    }

    public double berechneFlaeche()
    {
        return (PI * radius * radius);
    }

    public static void main(String[] args)
    {
        Kreis Kreis1 = new Kreis();
        System.out.println(Kreis1.getRadius());
        Kreis1.setRadius(2);
        System.out.println(Kreis1.getRadius());
        Kreis Kreis2 = new Kreis(3);
        System.out.println(Kreis2.getRadius());
        System.out.println(Kreis2.berechneUmfang());
        System.out.println(Kreis2.berechneFlaeche());
    }
}