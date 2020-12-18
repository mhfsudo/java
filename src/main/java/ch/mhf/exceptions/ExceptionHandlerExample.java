package ch.mhf.exceptions;

/*
    public void saveInFile(String filename) throws IOException, more Exception if needed
 */

public class ExceptionHandlerExample
{
    public void checkMyArray(int[] myArray)
    {
        try{
            System.out.println(myArray[0]);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Something went wrong.");
        } finally
        {
            System.out.println("The try catch is finished");
        }
    }

    public static void main(String[] args)
    {
        ExceptionHandlerExample example1 = new ExceptionHandlerExample();
        int[] myArray1 = {1, 2, 3};
        example1.checkMyArray(myArray1);                        //output 1 Thy try catch is finished

        ExceptionHandlerExample example2 = new ExceptionHandlerExample();
        int[] myArray2 = {};
        example1.checkMyArray(myArray2);                        //output Something went wrong. Thy try catch is finished
    }
}