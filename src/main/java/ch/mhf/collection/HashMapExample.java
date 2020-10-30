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
import java.util.Map;

public class HashMapExample
{
    public static void main(String[] args)
    {
        //Sammlung
        HashMap<String, Integer> personalien = new HashMap<>(); //Instanz der Klasse HashMap
        //put()
        personalien.put("Michael", 30);                         //Schlüsselwertpaar Michael = Key | 30 = Value
        personalien.put("Lisa", 30);

        for (String i : personalien.keySet())
        {
            System.out.println(i);                              //output Michael, Lisa
        }

        for (Integer i : personalien.values())
        {
            System.out.println(i);                              //output 30, 30
        }

        for (Map.Entry<String, Integer> i : personalien.entrySet())
        {
            System.out.println(i);                              //output Michael=30, Lisa=30
        }
    }
}