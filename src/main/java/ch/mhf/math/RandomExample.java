package ch.mhf.math;

import java.util.Random;

public class RandomExample
{
    public static void main(String[] args)
    {
        Random randomZahl = new Random();
        int index1 = randomZahl.nextInt(2); //Liefer Random 0 oder 1
        System.out.println(index1);
    }
}