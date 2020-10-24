package ch.mhf.collection;

/*
 * map
 * filter
 * sorted
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

public class Stream
{
    public static void main(String[] args)
    {
        List<Integer> number = Arrays.asList(1, 2, 3);
        //Map
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);                                                                             //output [1, 4, 9]

        List<String> names = Arrays.asList("Michael", "Lisa");
        //Filter
        List<String> result = names.stream().filter(s -> s.startsWith("L")).collect(Collectors.toList());
        System.out.println(result);                                                                             //output [Lisa]

        //Sorted
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);                                                                               //output [Lisa, Michael]

        //Set
        Set<Integer> squareSet = number.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);                                                                          //output [1, 4, 9]

        //forEach
        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));                                    //output 1 4 9
    }
}