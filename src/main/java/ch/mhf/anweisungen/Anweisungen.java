package ch.mhf.anweisungen;

public class Anweisungen
{
    public static void main(String[] args)
    {
        boolean t = true;
        boolean x;
        boolean y;
        boolean z;
        boolean w;
        //true
        System.out.println(x = t && !(2 == 2) || !t && (3 == 3) || t && !(4 < 3));
        //false
        System.out.println(y = t && !(2 == 2) || !(t && (3 == 3) || t) && !(4 < 3));
        //true
        System.out.println(z = t && (!(2 == 2) || !t && (3 == 3) || t) && !(4 < 3));
        //false
        System.out.println(w = t && !(((2 == 2) || !t) && (3 == 3) || t) && !(4 < 3));
    }
}