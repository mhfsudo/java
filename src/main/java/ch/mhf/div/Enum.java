package ch.mhf.div;

public class Enum
{
    enum Anrede
    {
        Frau,
        Herr,
        Firma
    }

    public static void main(String[] args)
    {
        Anrede briefAnrede = Anrede.Frau;
        System.out.println(briefAnrede + " Steinegger");	//Ooutput Frau Steinegger
    }
}