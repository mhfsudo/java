package ch.mhf.div;

public class Casting
{
    public static void main(String[] args)
    {
        /*
         *Java Type Casting
         *Widening Casting (auto) - convert smaller type to larger type
         *byte -> short -> char -> int -> long -> float -> double
         *Narrowing Casting (manually) - convert larger type to smaller type
         *double -> float -> long -> int -> char -> short -> byte
         */

        int myInt1 = 10;
        double myDouble1 = myInt1;
        System.out.println(myDouble1);          //output 10.0

        double myDouble2 = 10.555;
        int myInt2 = (int) myDouble2;
        System.out.println(myInt2);             //output 10
    }
}