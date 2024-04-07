package ch.mhf.permutations;

import java.util.ArrayList;

public class Permutations
{
    private static ArrayList<int[]> permutationsList;
    private static int count;

    /**
     * main for testing
     *
     * @param args
     */
    public static void main(String[] args)
    {
        permutations(3);
    }

    /**
     * Erzeugt ein Array von allen Permutationen von {0,1,2,3,...,n-1}.
     *
     * @param n Anzahl Elemente in einer Permutation.
     * @return Ein Array von Permutationen; jede Permutation ist ein Array von Integern.
     */
    public static int[][] permutations(int n)
    {
        permutationsList = new ArrayList<int[]>();
        int[] intArray = new int[n];
        count = 0;

        // generate array form zero to n'number which is given
        for (int i = 0; i < n; i++)
        {
            intArray[i] = i;
        }

        // get the permutations for the range
        permute(intArray, 0, n - 1);

        count = permutationsList.size();

        // generate double int array for return value
        // i try to use collections instead of arrays
        int[][] doubleArray = new int[count][n];

        for (int i = 0; i < permutationsList.size(); i++)
        {
            int[] list = permutationsList.get(i);
            for (int y = 0; y < list.length; y++)
            {
                doubleArray[i][y] = list[y];
            }
        }

        return doubleArray;
    }

    /**
     * Recursive search the Permutations of an int Array
     *
     * @param intArray to search the permutations.
     * @param startIndex start index of the int array
     * @param endIndex end index of the int array
     */
    private static void permute(int[] intArray, int startIndex, int endIndex)
    {
        // termination condition for recursion
        if (startIndex == endIndex)
        {
            int[] newArray = new int[intArray.length];
            newArray = intArray.clone();
            permutationsList.add(newArray);

        } else
        {
            for (int i = startIndex; i <= endIndex; i++)
            {
                intArray = swap(intArray, startIndex, i);
                // recursive call
                permute(intArray, startIndex + 1, endIndex);

                intArray = swap(intArray, startIndex, i);
            }
        }
    }

    /**
     * build combinations for the recursion tree
     *
     * @param intArray
     * @param startIndex
     * @param loopIndex
     * @return
     */
    private static int[] swap(int[] intArray, int startIndex, int loopIndex)
    {
        int treeStartIndex;

        treeStartIndex = intArray[startIndex];
        intArray[startIndex] = intArray[loopIndex];
        intArray[loopIndex] = treeStartIndex;

        return intArray;
    }

    public int getCountOfPermutations()
    {
        return count;
    }
}
