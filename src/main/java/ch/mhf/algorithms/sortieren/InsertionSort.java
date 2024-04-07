package ch.mhf.sortieren;

public class InsertionSort
{
    static void insertionSort (int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            int j = i;
            int m = array[i];

            //für alle Elemente links vom Marker-Feld
            while (j > 0 && array[j - 1] > m)
            {
                //verschiebe alle grösseren Elemente nach hinten
                array[j] = array[j - 1];
                j--;
            }
            //setze m auf das freie Feld
            array[j] = m;
        }
    }
}