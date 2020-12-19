package ch.mhf.collection;

/*
 * map
 * filter
 * reduce
 * sorted
 */

import java.util.Arrays;
import java.util.List;

public class Streams
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> names = Arrays.asList("Michael", "Lisa");

        //Map
        numbers.stream()
                .map(x -> x * x)
                .forEach(square -> System.out.println(square));     //output 1, 4, 9

        //Filter
        names.stream()
                .filter(s -> s.startsWith("L"))
                .forEach(name -> System.out.println(name));         //output Lisa

        //Sorted
        names.stream()
                .sorted()
                .forEach(name -> System.out.println(name));         //output Lisa, Michael
    }
}