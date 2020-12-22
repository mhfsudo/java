package ch.mhf.div;

public class Enum
{
    enum Salutation
    {
        Frau,
        Herr,
        Firma
    }

    public static void main(String[] args)
    {
        Salutation letterSalutation = Salutation.Frau;

        switch (letterSalutation)
        {
            case Frau:
                System.out.println("Frau Steinegger");          //output Frau Steinegger
                break;
            case Herr:
                System.out.println("Herr Steinegger");
                break;
            case Firma:
                System.out.println("Firma Steinegger");
                break;
        }

        for (Salutation currentValue : Salutation.values())
        {
            System.out.println(currentValue);                   //output Frau Herr Firma
        }
    }
}