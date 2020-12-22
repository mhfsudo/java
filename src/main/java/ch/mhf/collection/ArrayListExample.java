package ch.mhf.collection;

import java.util.ArrayList;
import java.util.Collections;                                   //for sorting
import java.util.Iterator;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        /*
            ArrayList Index start with 0
            ArrayList Size is unlimited
            Elements in ArrayList are Objects, for primitive type you need to use Wrapper class
         */

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Audi");
        stringList.add("Tesla");
        stringList.add("Volvo");
        stringList.set(0, "Aston Martin");                      //change "Audi" to "Aston Martin"
        stringList.remove(2);                             //remove "Volvo"
        stringList.get(1);                                      //return "Tesla"
        stringList.size();                                      //return 2
        System.out.println(stringList);                         //output [Aston Martin, Tesla]

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(20);
        intList.add(30);
        intList.set(0, 10);                                     //change 1 to 10
        intList.remove(2);                                //remove 30
        intList.get(1);                                         //return 20
        intList.size();                                         //return 2
        System.out.println(intList);                            //output [10, 20]

        //sort ArrayList
        ArrayList<String> sortList = new ArrayList<String>();
        sortList.add("Tesla");
        sortList.add("Volvo");
        sortList.add("Aston Martin");
        Collections.sort(sortList);                             //sort sortList

        //for each Loop
        for (int curenElement : intList)
        {
            System.out.println(curenElement);                   //output 10 20
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