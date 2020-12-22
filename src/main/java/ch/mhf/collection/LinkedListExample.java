package ch.mhf.collection;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class LinkedListExample
{
    public static void main(String[] args)
    {
        /*
            LinkedList Index start with 0
            LinkedList Size is unlimited
            Elements in LinkedList are Objects, for primitive type you need to use Wrapper class

            addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast()
         */

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Audi");
        stringList.add("Tesla");
        stringList.add("Volvo");
        stringList.set(0, "Aston Martin");                      //change "Audi" to "Aston Martin"
        stringList.remove(2);                             //remove "Volvo"
        stringList.get(1);                                      //return "Tesla"
        stringList.size();                                      //return 2
        System.out.println(stringList);                         //output [Aston Martin, Tesla]

        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1);
        intList.add(20);
        intList.add(30);
        intList.set(0, 10);                                     //change 1 to 10
        intList.remove(2);                                //remove 30
        intList.get(1);                                         //return 20
        intList.size();                                         //return 2
        System.out.println(intList);                            //output [10, 20]

        //sort ArrayList
        LinkedList<String> sortList = new LinkedList<>();
        sortList.add("Tesla");
        sortList.add("Volvo");
        sortList.add("Aston Martin");
        Collections.sort(sortList);                             //sort sortList

        //for each Loop
        for (int currentElement : intList)
        {
            System.out.println(currentElement);                 //output 10 20
        }

        //iterator
        Iterator<String> currentElement = sortList.iterator();
        while (currentElement.hasNext())
        {
            System.out.println(currentElement.next());          //output Aston Martin Tesla Volvo
        }

        stringList.clear();                                     //remove all items
        intList.clear();                                        //remove all items
        sortList.clear();                                       //remove all items
    }
}