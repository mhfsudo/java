package ch.mhf.collection;

import java.util.ArrayList;
import java.util.Collections;                                   //for sorting

public class ArrayListExample
{
    public static void main(String[] args)
    {
        /*
         *Array Index start with 0
         *Array Size is unlimited
         *Elements in ArrayList are Objects, for primitive type you need to use Wrapper class
         */

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Audi");
        stringList.add("Tesla");
        stringList.add("Volvo");
        stringList.set(0, "Aston Martin");                      //change "Audi" to "Aston Martin"
        stringList.remove(2);                                   //remove "Volvo"
        stringList.get(1);                                      //output "Tesla"
        stringList.size();                                      //output 2
        System.out.println(stringList);                         //output [Aston Martin, Tesla]
        stringList.clear();                                     //remove all items

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(20);
        intList.add(30);
        intList.set(0, 10);                                     //change 1 to 10
        intList.remove(2);                                      //remove 30
        intList.get(1);                                         //return 20
        intList.size();                                         //return 2
        System.out.println(intList);                            //output [10, 20]
        intList.clear();                                        //remove all items

        //for each Loop
        for (String i : stringList)
        {
            System.out.println(i);
        }

        //for Loop
        for (int i = 0; i < intList.size(); i++)
        {
            System.out.println(intList.get(i));
        }

        //sort ArrayList
        ArrayList<String> sortList = new ArrayList<String>();
        sortList.add("Tesla");
        sortList.add("Volvo");
        sortList.add("Aston Martin");
        Collections.sort(sortList);                             //sort sortList
        for (String i : sortList)
        {
            System.out.println(i);                              //output Aston Martin Tesla Volvo
        }
    }
}