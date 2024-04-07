package ch.mhf.suchen;

public class SeqSearch
{
    //constant
    public final static int NOKEY = -1;

    static int search(int[] array, int key)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == key)
            {
                return i;
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