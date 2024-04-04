package ch.mhf.sumstream;

import java.util.List;

/*
Gegeben sei folgende Methode zur Ermittlung der Summe einer Liste. Implementieren Sie eine äquivalente
Version mit Hilfe eines Java Streams und einer Pipeline mit Lambda Ausdruck.
 */

//public class SumStream
//{
//    public static int calculateSum(List<Integer> numbers)
//    {
//        int total = 0;
//        for (int number : numbers) {
//            total += number;
//       }
//        return total;
//    }
//}

public class SumStream
{
    public static int calculateSum(List<Integer> people)
    {
        return people.stream() //Convert collection to stream
                .reduce(0, (total, number) -> total + number); //Sum elements with 0 as starting value
    }
}
