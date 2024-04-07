package ch.mhf.binSearch;

public class BinSearch
{
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
        int start = 0;
        int end = array.length - 1;
        while (start <= end)
        {
            int mid = start + ((end - start) / 2);
            if (array[mid] == searchValue)
            {
                //value wurde einmal gefunden
                return new Pair(findStart(array, start, mid, searchValue), findEnd(array, mid, end, searchValue));
            } else if (array[mid] < searchValue)
            {
                //nach rechts suchen
                start = mid + 1;
            } else
            {
                //nach links suchen
                end = mid - 1;
            }
        }
        return null;
    }


    public static int findStart(int[] array, int start, int end, int value)
    {
        int result = end;
        while (start <= end)
        {
            int mid = start + ((end - start) / 2);
            if (array[mid] == value)
            {
                result = mid;
                end = mid - 1;
            } else
            {
                start = mid + 1;
            }
        }
        return result;
    }

    public static int findEnd(int[] array, int start, int end, int value)
    {
        int result = start;
        while (start <= end)
        {
            int mid = start + ((end - start) / 2);
            if (array[mid] == value)
            {
                result = mid;
                start = mid + 1;
            } else
            {
                end = mid - 1;
            }
        }
        return result;
    }
}
