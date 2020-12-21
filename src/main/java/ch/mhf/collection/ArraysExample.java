package ch.mhf.collection;

import java.util.Arrays;

public class ArraysExample
{
    public static void main(String[] args)
    {
        /*
         *Array Index start with 0
         *Array Size is limited$
         */

        String[] stringArray = {"Audi", "Tesla", "Volvo"};
        stringArray[0] = "Aston Martin";                        //change "Audi" to "Aston Martin"
        System.out.println(stringArray[1]);                     //return "Tesla"
        System.out.println(stringArray.length);                 //return 3
        System.out.println(Arrays.toString(stringArray));       //output [Aston Martin, Tesla, Volvo]

        int[] intArray = new int[3];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        System.out.println(intArray[1]);                        //output 20
        System.out.println(intArray.length);                    //output 3
        System.out.println(Arrays.toString(intArray));          //output [10, 20, 30]

        //for each Loop
        for (String i : stringArray)
        {
            System.out.println(i);
        }

        //for Loop
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }

        //Multidimensional Arrays
        int[][] multiArrayInt = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(multiArrayInt[0][0]);                //output 1
        System.out.println(multiArrayInt[0][1]);                //output 2
        System.out.println(multiArrayInt[1][0]);                //output 4

        for (int i = 0; i < multiArrayInt.length; ++i)
        {
            for(int j = 0; j < multiArrayInt[i].length; ++j)
            {
                System.out.println(multiArrayInt[i][j]);        //output 1 2 3 4 5 6
            }
        }
    }
}