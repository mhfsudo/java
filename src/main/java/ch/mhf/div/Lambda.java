package ch.mhf.div;

import java.util.ArrayList;

public class Lambda
{
    public static void main(String[] args)
    {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");

        stringList.forEach((String i) -> System.out.println(i)); //output A B
    }
}