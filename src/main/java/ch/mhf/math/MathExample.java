package ch.mhf.math;

public class MathExample
{
    public static void main(String[] args)
    {
        System.out.println(Math.min(1.2, 2));                   //return 1.2
        System.out.println(Math.max(1.2, 2));                   //return 2.0
        System.out.println(Math.sqrt(16));                      //return 4.0
        System.out.println(Math.abs(-5));                       //return 5
        System.out.println(Math.random());                      //return 0.0 >= Zahl < 1
        System.out.println((int)(Math.random() * 10));          //return Zahl 0 - 9
        System.out.println((int)(Math.random() * 10) + 1);      //return Zahl 1 - 10
    }
}