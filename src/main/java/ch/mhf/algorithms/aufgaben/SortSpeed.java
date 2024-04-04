package ch.mhf.aufgaben;

import ch.mhf.sort.InsertSort;
import ch.mhf.sort.QuickSort;

import java.util.Random;

public class SortSpeed
{

    public static void main(String args[])
    {
        findFastestAlgorithmusNormalerQuicksort();

        //findFastestAlgorithmusSchnellerQuicksort();

    }

    /**
     * Generate random array with n length
     *
     * @param n
     * @return
     */
    public static int[] generateRandomArray(int n)
    {
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    /**
     * PVA2 see the faster sort algorithmus according to array length
     * Insertsort
     * and
     * Quicksort
     * <p>
     * Aufgabe 3 Sortierverfahren.
     * <p>
     * Mann kann klar erkennen, dass ab einer array Länge ca. grösser 20 und einer Baumtiefe von 4
     * der Quicksort algorithmus schneller wird.
     */
    public static void findFastestAlgorithmusNormalerQuicksort()
    {
        int startArrayLength = 5;
        int stopArryLength = 10000000;

        int counter = 0;
        for (int i = 0; i < stopArryLength; i += 1)
        {

            int[] array = generateRandomArray(i);
            int[] sortArray = new int[array.length];
            int depth = ((int) Math.log(array.length)) * 2;
            sortArray = array.clone();

            // insertsort
            Stopwatch watch = new Stopwatch();
            watch.start();
            InsertSort.sort(sortArray);
            watch.stop();
//            System.out.println("InsertSort: " + watch.toString());

            sortArray = array.clone();

            // QuickSort
            Stopwatch watch1 = new Stopwatch();
            watch1.start();
            QuickSort.sort(sortArray);
            watch1.stop();
//            System.out.println("Quicksort:  " + watch1.toString());

            System.out.println("InsertSort:  " + watch.getTime() + "    Quicksort: " + watch1.getTime() + "    array length: " + i + "    array depth: " + depth);

            if (watch1.getTime() < watch.getTime())
            {
                System.out.println("******* Quicksort is now faster InsertSort ********");
                counter++;
            }

            if (counter > 20)
                break;

        }
    }

    /**
     * PVA2 see the faster sort algorithmus according to array length
     * InsertsortPlus
     * and
     * Quicksort
     * <p>
     * Aufgabe 4 Sortierverfahren.
     * <p>
     * Die verbesserung von Quicksort ist minim, mann muss aber beachten, dass für den QuicksortPlus auch immer die Array tiefe
     * berechnet werden muss, was performance Einbussen gibt gegenüber dem InsertSort
     *
     */
    public static void findFastestAlgorithmusSchnellerQuicksort()
    {
        int startArrayLength = 5;
        int stopArryLength = 10000000;

        int counter = 0;
        for (int i = 0; i < stopArryLength; i += 1)
        {

            int[] array = generateRandomArray(i);
            int[] sortArray = new int[array.length];
            int depth = ((int) Math.log(array.length)) * 2;
            sortArray = array;

            // insertsort
            Stopwatch watch = new Stopwatch();
            watch.start();
            InsertSort.sort(sortArray);
            watch.stop();
//            System.out.println("InsertSort: " + watch.toString());

            sortArray = array;

            // QuickSort
            Stopwatch watch1 = new Stopwatch();
            watch1.start();
            QuickSort.sortPlus(sortArray);
            watch1.stop();
//            System.out.println("Quicksort:  " + watch1.toString());

            System.out.println("InsertSort:  " + watch.getTime() + "    QuicksortPlus: " + watch1.getTime() + "    array length: " + i + "    array depth: " + depth);

            if (watch1.getTime() < watch.getTime())
            {
                System.out.println("******* QuicksortPlus is now faster InsertSort ********");
                counter++;
            }

            if (counter > 10)
                break;

        }
    }


}

