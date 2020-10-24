package ch.mhf.exceptions;

public class ExceptionExample
{
    public static void main(String[] args)
    {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[0]);                   //output 1
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Something went wrong.");
        } finally
        {
            System.out.println("The try catch is finished");    //output "The try catch is finished"
        }
    }
}