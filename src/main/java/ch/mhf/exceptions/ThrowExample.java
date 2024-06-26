package ch.mhf.exceptions;

/*
    throw new ExceptionTyp("Optional Text Message");
 */

public class ThrowExample
{
    static void checkAge(int age)
    {
        if(age < 18)
        {
            throw new ArithmeticException("Access Denied");
        }
        else
        {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args)
    {
        checkAge(18);                                   //output Access granted
        checkAge(15);                                   //throw exception with text Access Denied
        checkAge(18);                                   //will not executed
    }
}