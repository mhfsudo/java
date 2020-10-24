package ch.mhf.collection;

/*
 * Methoden von HashMap
 * put()
 * get()
 * remove()
 * clear()
 * size()
 */

import java.util.HashMap;

public class HashMapExample
{
    public static void main(String[] args)
    {
        //Sammlung
        HashMap<String, Integer> personalien = new HashMap<>(); //Instanz der Klasse HashMap
        //put()
        personalien.put("Michael", 30);                         //Schlüsselwertpaar Michael = Key | 30 = Value

        for (String i : personalien.keySet())
        {
            System.out.println(i);                              //output Michael
        }

        for (Integer i : personalien.values())
        {
            System.out.println(i);                              //output 30
        }
    }
}