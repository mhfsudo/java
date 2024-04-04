package ch.mhf.zahlenfilter;

/*
 * Zahl teilbar durch 7 und Zahl endet mit 3
 */

public class Zahlenfilter {

    public static void main(String[] args) {

        for(int i = 0; i <= 500; i++)
        {
            if(i % 7 == 0 && i % 10 == 3)
            {
                System.out.println(i);			//output 63 133 203 273 343 413 483
            }
        }
    }
}