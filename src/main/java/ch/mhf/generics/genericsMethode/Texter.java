package ch.mhf.generics.genericsMethode;

public class Texter
{
    /*
        Generische Methode
     */
    public <T> void printObject(T obj)
    {
        System.out.println(obj.toString());
    }
}
