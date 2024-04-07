package ch.mhf.getset;

public class GetSet
{
    //Datenfelder
    private String name;
    private String waehrung;
    private int einwohnerzahl;

    //Konstruktor
    public GetSet(String name, String waehrung, int einwohnerzahl)
    {
        this.name = name;
        this.waehrung = waehrung;

        if(einwohnerzahl < 0)
        {
            this.einwohnerzahl = 0;
        }else
        {
            this.einwohnerzahl = einwohnerzahl;
        }
    }

    //Methoden
    private void setName(String name)
    {
        this.name = name;
    }

    private String getName()
    {
        return name;
    }

    private void setWaehrung(String waehrung)
    {
        this.waehrung = waehrung;
    }

    private String getWaehrung()
    {
        return waehrung;
    }

    private void setEinwohnerzahl(int einwohnerzahl)
    {
        if(einwohnerzahl < 0)
        {
            return;
        }
        else
        {
            this.einwohnerzahl = einwohnerzahl;
        }
    }

    private int getEinwohnerzahl()
    {
        return einwohnerzahl;
    }

    private void ausgabe()
    {
        System.out.println("Das Land " + name + " hat die Währung " + waehrung + " und " + einwohnerzahl + " Einwohner.");
    }

    public static void main (String[] args)
    {
        GetSet myLand = new GetSet("Schweiz","CHF",8000000);
        myLand.ausgabe();								//output Das Land Schweiz hat die Währung CHF und 8000000 Einwohner.

        GetSet myLand2 = new GetSet("England","Pfund",10);
        myLand2.setName("Frankreich");
        myLand2.setWaehrung("Euro");
        myLand2.setEinwohnerzahl(-1);
        myLand2.ausgabe();								//output Das Land Frankreich hat die Währung Euro und 0 Einwohner.

        System.out.println(myLand.getName() + " " + myLand2.getWaehrung()); //output Schweiz Euro
    }
}