package ch.mhf.suchen;

public class BinSearch
{
    //constant
    public final static int NOKEY = -1;

    static int search(int[] array, int key)
    {
        int low = 0;
        int high = array.length - 1;

        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (array[mid] == key)
            {
                return mid;
            }else if (array[mid] > key)
            {
                high = mid - 1;
            }else
            {
                low = mid - 1;
            }
        }return NOKEY;
    }

    public static void main(String[] args)
    {
        int[] f = {2, 4, 5, 6, 7, 8, 9, 11};
        //keyword
        int k = 4;
        System.out.println("Sequenziell: " + search(f, k)); //Output = 1
    }
}