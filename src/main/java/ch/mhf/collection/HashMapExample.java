package ch.mhf.collection;

/*
    Methoden von HashMap
    put()
    get()
    remove()
    clear()
    size()
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapExample
{
    public static void main(String[] args)
    {
        //Sammlung
        HashMap<String, Integer> personalien = new HashMap<>();                             //Instanz der Klasse HashMap

        //put()
        personalien.put("Michael", 30);                                                     //Schlüsselwertpaar Michael = Key | 30 = Value
        personalien.put("Lisa", 29);

        //get()
        personalien.get("Michael");                                                         //return 30

        for (String currentElement : personalien.keySet())
        {
            System.out.println(currentElement);                                             //output Michael, Lisa
        }

        for (Integer currentElement : personalien.values())
        {
            System.out.println(currentElement);                                             //output 30, 29
        }

        for (Map.Entry<String, Integer> currentElement : personalien.entrySet())
        {
            System.out.println(currentElement);                                             //output Michael=30, Lisa=29
        }

        for (Map.Entry<String, Integer> currentElement : personalien.entrySet())
        {
            System.out.println(currentElement.getKey() + ": " + currentElement.getValue()); //output Michael: 30, Lisa: 29
        }

        //remove()
        personalien.remove("Michael");

        //clear()
        personalien.clear();
    }
}