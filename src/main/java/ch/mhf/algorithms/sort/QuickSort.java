package ch.mhf.sort;

public class QuickSort
{

    /**
     * Sortiert ein Array durch Quicksort.
     *
     * @param array Zu sortierendes Array.
     */
    public static void sort(int[] array)
    {
        if (array != null)
        {
            int length = array.length;
            if (length > 0)
                sort(array, 0, length - 1);
            else
                System.out.println("the array contains no items");
        } else
            System.out.println("the array contains no object");
    }

    /**
     * Sortiert ein Teilstück eines Arrays durch Quicksort.
     *
     * @param array ZU sortierenden Array
     * @param start Index des ersten Elementes des Teils, das sortiert werden muss.
     * @param end   Index des letzen Elementes des Teils, das sortiert werden muss.
     */
    public static void sort(int[] array, int start, int end)
    {
        if (start < end)
        {
            // finde
            int pivot = findPivot(array, start, end);
            int j = partition(array, start, end, pivot);
            sort(array, start, j); // sortiere alles kleiner als pivot
            sort(array, j + 1, end); // sortiere alles grösser als pivot

        }
    }

    /**
     * Schwellwert, bei welcher Arraygrösse in der Rekursion InsertSort
     * statt Quicksort aufgerufen werden sollte.
     */
    static int THRESHOLD = 4; // TODO finden Sie einen sinnvollen Wert

    /**
     * Modifiziertes Quicksorts.
     * Wenn die Grösse des zu sortierenden Arrays in der Rekursion
     * einen Schwellwert unterschreitet, wird InsertSort statt Quicksort
     * aufgerufen.
     *
     * @param array Zu sortierendes Array
     */
    public static void sortPlus(int[] array)
    {
        if (array != null)
        {
            int length = array.length;
            if (length > 1)
                sort(array, 0, length - 1);
            else
                System.out.println("the array contains no items");
        } else
            System.out.println("the array contains no object");
    }

    /**
     * Modifiziertes Quicksorts zum SOrtieren eines Teilstücks eines Arrays.
     * Wenn die Grösse des zu sortierenden Arrays in der Rekursion
     * einen Schwellwert unterschreitet, wird InsertSort statt Quicksort
     * aufgerufen.
     *
     * @param array Zu sortierendes Array
     * @param start Index des ersten  Elementes des zu sortierenden teilstücks.
     * @param end   Index des letzten Elementes des zu sortierenden teilstücks.
     */
    public static void sortPlus(int[] array, int start, int end)
    {
        int depth = ((int) Math.log(array.length)) * 2;
        if (depth < THRESHOLD)
        {
            // sort with insertsort
            InsertSort.sort(array);
        } else
        {
            // sort with quicksort
            sort(array, start, end);
        }
    }

    /**
     * Hilfsmethode für Quicksort.
     * Ein Teilstück eines Arrays wird geteilt, so dass alle Elemente,
     * die kleiner als ein gewisses Pivot-Elements sind, links stehen
     * und alle Elemente, die grösser als das Pivot-Element rechts stehen.
     *
     * @param array Array zum Umordnen.
     * @param start Indes des ersten  Elements des Teilstücks, das geteilt werden muss.
     * @param end   Index des letztes Elements des Teilstücks, das geteilt werden muss.
     * @param piv   Index des PiotElements
     * @return Index des Piot-Element nach der Partitionierung.
     */
    static int partition(int[] array, int start, int end, int piv)
    {
        int i = start - 1;
        int j = end + 1;

        while (true)
        {
            do
            {
                i++;
            } while (array[i] < piv);

            do
            {
                j--;
            } while (array[j] > piv);

            if (i < j)
            {
                swap(array, i, j);
            } else
            {
                return j;
            }
        }
    }

    /**
     * Hilfsmethode zum Vertauschen zweier Array-Elemente
     *
     * @param array
     * @param a
     * @param b
     */
    static void swap(int[] array, int a, int b)
    {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    /**
     * Hilfsmethode zum Finden eines Pivot-Elementes für Quicksort.
     * Zu einem Array und den zwei Indices start und end wird
     * der Index eines möglichen Pivot-Elementes angegeben
     *
     * @param array
     * @param start
     * @param end
     * @return Index eines Pivot-Elementes
     */
    static int findPivot(int[] array, int start, int end)
    {
        int pivot = array[(start + end) / 2];
        return pivot;
    }
}
