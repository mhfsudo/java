package ch.mhf.collection;

/*
 * Methoden von HashSet
 * add()
 * contains()
 * remove()
 * clear()
 * size()
 */

import java.util.HashSet;

public class HashSetExample
{
    public static void main(String[] args)
    {
        //Menge
        HashSet<String> name = new HashSet<>();                 //Instanz der Klasse HashSet

        //add()
        name.add("Lisa");
        name.add("Michael");
        name.add("Lisa");                                       //Objekt kommt nur einmal vor

        System.out.println(name);                               //output [Michael, Lisa] (Keine Ordnung)

        for(String currentElement : name)
        {
            System.out.println(currentElement);                 //output Michael Lisa
        }

        //contains()
        name.contains("Lisa");                                  //return true

        //remove()
        name.remove("Michael");

        //clear()
        name.clear();
    }
}