package ch.mhf.output;

/*
 * Programm in der Konsole aufrufen java Console.java
 */

public class Console
{
    public static void main(String[] args)
    {
        java.io.Console cons = System.console();

        if (cons != null)
        {
            cons.printf("Hello World");
        }
    }
}