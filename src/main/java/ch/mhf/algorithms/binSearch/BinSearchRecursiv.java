package ch.mhf.binSearch;

public class BinSearchRecursiv
{

    public static void main(String args[])
    {
        int arr[] = {10, 20, 30, 30, 30, 40, 50};
        int key = 30;
        int last = arr.length - 1;
        Pair pa = search(arr, key);
    }

    /**
     * Findet für einen aufsteigend geordneten Array zu einer Zahl value
     * den kleinsten und den grössten Index.
     *
     * @param array
     * @param searchValue
     * @return Ein Paar mit kleinestem und grösstem Index oder
     * null, wenn der gegebene Wert im array nicht vorkommt.
     */
    public static Pair search(int[] array, int searchValue)
    {
        int n = array.length;
        int firstOccurrence = first(array, 0, n - 1, searchValue, n);
        int lastOccurrence = first(array, 0, n - 1, searchValue, n);
        return new Pair(firstOccurrence, lastOccurrence);
    }

    /**
     * if x is present in arr[] then returns the index of
     * FIRST occurrence of x in arr[0..n-1], otherwise
     * returns -1
     */
    public static int first(int arr[], int low, int high, int x, int n)
    {
        if (high >= low)
        {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                return first(arr, (mid + 1), high, x, n);
            else
                return first(arr, low, (mid - 1), x, n);
        }
        return -1;
    }

    /**
     * if x is present in arr[] then returns the index of
     * LAST occurrence of x in arr[0..n-1], otherwise
     * returns -1
     */
    public static int last(int arr[], int low, int high, int x, int n)
    {
        if (high >= low)
        {
            int mid = low + (high - low) / 2;
            if ((mid == n - 1 || x < arr[mid + 1]) && arr[mid] == x)
                return mid;
            else if (x < arr[mid])
                return last(arr, low, (mid - 1), x, n);
            else
                return last(arr, (mid + 1), high, x, n);
        }
        return -1;
    }
}