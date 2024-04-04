package ch.mhf.lottoziehung;

import java.util.Random;

public class Lotto
{
    public static int[] lottoZiehung()
    {
        int[] res = new int[6];
        Random generator = new Random();

        for (int i = 0; i < 6; i++)
        {
            int z;
            do {
               z = generator.nextInt(42) + 1;
            }
            while (bereitsGezogen(res, z, i));
            res[i] = z;
        }
        return res;
    }

    private static boolean bereitsGezogen(int[] r, int neueZahl, int index)
    {
        for (int i = 0; i < index; i++)
        {
            if (neueZahl == r[i])
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] zahlen = lottoZiehung();

        for (int i = 0; i < zahlen.length; i++)
            System.out.println(" " + zahlen[i]);
        System.out.println("");
    }
}
