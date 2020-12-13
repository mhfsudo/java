package ch.mhf.div;

public class Stopwatch
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        //Berechnung einfügen
        long stop = System.currentTimeMillis();

        System.out.println("Die Berechnung dauerte " + (stop - start) + " Millisekunden.");
    }
}
