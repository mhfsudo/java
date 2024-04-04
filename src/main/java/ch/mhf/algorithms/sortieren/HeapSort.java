package ch.mhf.sortieren;

public class HeapSort
{
    public static void makeHeap (int[] array, int start, int end)
    {
        int n = end - start + 1;
        for (int i = n / 2 - 1; i >= 0; i--)
        {
            //sink (array, start, end + 1, i);
        }
    }

    public static void sort (int[] array, int start, int end)
    {
        if (null == array || array.length == 0 || array.length == 1)
        {
            return;
        }

        makeHeap(array, start,end);

        int n = end - start;
        for (int i = n; i >= 0; i--)
        {
            //swap (array, 0, i);
            //sink (array, start, i, 0);
        }
    }
}
