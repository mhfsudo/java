package ch.mhf.sort;

public class InsertSort
{

    public static void sort(int[] array)
    {
        if (array != null)
        {
            int length = array.length;
            if (length > 1)
                sorter(array);
            else
                System.out.println("the array contains no items");
        } else
            System.out.println("the array contains no object");
    }

    /**
     * Implementation of insert sort
     *
     * @param array the array which has to be sorted
     */
    private static void sorter(int[] array)
    {
        int n = array.length;
        for (int j = 1; j < n; j++)
        {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key))
            {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}
