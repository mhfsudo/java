package ch.mhf.loop;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *Allows to iterate over some Elements of an array
 *Also offers a methode remove() to remove Elements
 */

public class IteratorExample
{
    public static void main(String[] args)
    {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");

        System.out.print("Content ");
        Iterator<String> itr = stringList.iterator();

        while (itr.hasNext())
        {
            String element = itr.next();
            System.out.print(element + " ");
        }
    }
}