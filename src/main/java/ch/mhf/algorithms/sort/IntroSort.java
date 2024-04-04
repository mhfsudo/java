package ch.mhf.sort;

public class IntroSort
{
    /**
     * Sortiert ein Array der Länge n mit IntroSort.
     * Das Array wird mit Quicksort sortiert,
     * wenn aber die Rekursionstiefe mehr
     * als n * log(n) wird, wird auf HeapSort ungestellt.
     *
     * @param array
     */
    public static void sort(int[] array)
    {
        if (array != null)
        {
            int length = array.length;
            if (length > 0)
            {
                int depth = ((int) Math.log(array.length)) * 2;
                sort(array, 0, length - 1, depth);
            } else
                System.out.println("the array contains no items");
        } else
            System.out.println("the array contains no object");
    }

    /**
     * Sortiert eine Teilstück eines Arrays mit IntroSort.
     *
     * @param array    Zu sortierendes Array
     * @param start    Index des ersten Elementes des zu sortierenden Stücks.
     * @param end      Index des letzten Elementes des zu sortierenden Stücks.
     * @param maxDepth
     */
    public static void sort(int[] array, int start, int end, int maxDepth)
    {
        int length = array.length;
        int formula = length * (int) Math.log(length);
        // für was soll die Funktion log2 gebraucht werden?
		//int formula2 = length * log2(length);

        if (maxDepth > formula)
        {
            MergeSort.sort(array);
        } else
        {
            QuickSort.sort(array);
        }
    }

    /**
     * Bestimmt den (abgerundeten) Zweierlogarithmus ohne float-Arithmetik.
     *
     * @param n
     * @return
     */
    static int log2(int n)
    {
        int log = 0;
        while (n > 1)
        {
            n >>>= 1;
            log++;
        }
        return log;
    }
}
