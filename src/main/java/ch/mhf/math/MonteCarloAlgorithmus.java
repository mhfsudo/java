package ch.mhf.math;

import java.util.Random;

public class MonteCarloAlgorithmus
{
    public double findPiMonteCarlos(int number)
    {
        double retVal = 0;
        double length = 0;
        double numberInside = 0;
        double umberOutside = 0;

        Random randomNumber = new Random();

        for (int i = 1; i <= number; i++)
        {
            length = Math.sqrt((Math.pow(randomNumber.nextDouble(), 2)) + (Math.pow(randomNumber.nextDouble(), 2)));
            if (length < 1)
            {
                numberInside++;
            } else
            {
                umberOutside++;
            }
        }

        retVal =  ((double) numberInside/(numberInside+umberOutside)*4);
        return retVal;
    }
}