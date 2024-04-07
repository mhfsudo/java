package ch.mhf.sortieren;

public class QuickSort
{
    public static void sort (int[] array, int start, int end)
    {
        //determine Pivot
        int piv = (start + end) / 2;

        if (end > start)
        {
            //dismantle pivot
            int pivotNew = partition(array, start, end,piv);
            //sort partition
            sort(array, start, pivotNew -1);
            sort(array, pivotNew + 1, end);
        }
    }

    static void swap (int[] array, int a, int b)
    {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    static int partition (int[] array, int start, int end, int piv)
    {
        int x = array[piv];
        int i = start - 1;
        int j = end + 1;

        while (true)
        {
            i++;
            while (i < end && array[i] < x)
            {
                i++;
            }
            j--;
            while (j > start && array[j] > x)
            {
                if (i < j)
                {
                    swap(array, i, j);
                }
                else
                {
                    return j;
                }
            }
        }
    }
}
