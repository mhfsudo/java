package ch.mhf.aufgaben;

/* homework question
var x,y: int; a : array 1..n of int;
input a;

//speichere den Arraywert null in zwei verschiedene int variabeln
x := a[0];
y := a[0];

for i=1 to n-1 do // loope über das array
	if x > a[i] then // x > array loop wert
		x := a[i];
	fi // ende if
	if y < a[i] then
    		y := a[i];
	fi // ende if
od // end of loop section
output: x, y
*/


public class collaborativeTaskPva1
{

    /**
     * main for testing
     *
     * @param args
     */
    public static void main(String[] args)
    {
        calcCode(new int[]{1, 3, 5, 4, 6, 2, 8, 7, 9});
        calcCode(new int[]{3, 3, 3, 4, 4, 4, 1, 1, 1});
        calcCode(new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5});
    }

    private static void calcCode(int[] inputArray)
    {
        System.out.println("####################\nSTART CALC");

        System.out.print(" Array Values: {");
        for (int i = 0; i < inputArray.length; i++)
        {
            System.out.print(" " + i);
        }
        System.out.print(" }\n\n");

        int x = inputArray[0];
        int y = inputArray[0];
        int i = 0;

        for (i = 0; i < inputArray.length; i++)
        {
            if (x > inputArray[i])
            {
                x = inputArray[i];
            }

            if (y < inputArray[i])
            {
                y = inputArray[i];
            }

            System.out.println("-loop count: " + i);
            System.out.println("-actual value of x: " + x);
            System.out.println("-actual value of y: " + y);
        }

        System.out.println("----the count of loops is: " + i);
        System.out.println("----count of compares are: " + i * 2);
        System.out.println("----value for x is: " + x);
        System.out.println("----value for y is: " + y);

        System.out.println("END CALC\n####################");
    }


}
