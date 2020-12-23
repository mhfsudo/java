package ch.mhf.method;

import java.util.ArrayList;

/*
    Parameterliste -> expression
 */

public class Lambda
{
    public static void main(String[] args)
    {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");

        stringList.forEach(element -> System.out.println(element)); //output A B
    }
}