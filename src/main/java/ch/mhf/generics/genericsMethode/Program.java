package ch.mhf.generics.genericsMethode;

public class Program
{
    public static void main(String[] args)
    {
        Texter texter1 = new Texter();
        texter1.printObject(77);                // output 77
        Texter texter2 = new Texter();
        texter2.printObject("Hello Generics");  // output Hello Generics
    }
}
