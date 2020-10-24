package ch.mhf.math;

import java.util.ArrayList;

public class Operatoren
{
    public static void main(String[] args)
    {
        ArrayList<String> operatorList = new ArrayList<>();
        operatorList.add("+    positives Vorzeichen");
        operatorList.add("+    Summe");
        operatorList.add("++   Inkrement (i++ <=> i = i + 1) (++i <=> 1 + i = 1)");
        operatorList.add("+=   x += y <=> x = x + y");
        operatorList.add("-=   x -= y <=> x = x - y");
        operatorList.add("--   Dekrement (i-- <=> i = i - 1) (--i <=> 1 - i = 1)");
        operatorList.add("-    negatives Vorzeichen");
        operatorList.add("-    Differenz");
        operatorList.add("*    Produkt");
        operatorList.add("/    Quotient");
        operatorList.add("%    Modulo (Restwert 10 % 3 = (3 Rest) 1");
        operatorList.add("=    Zuweisung");
        operatorList.add("==   Vergleich");
        operatorList.add("<    kleiner");
        operatorList.add(">    grösser");
        operatorList.add("<=   kleiner gleich");
        operatorList.add(">=   grösser gleich");
        operatorList.add("!=   logisches ungleich");
        operatorList.add("!    logisches nicht");
        operatorList.add("&    Bitweises und");
        operatorList.add("&&   logisches und");
        operatorList.add("|    Bitweises oder");
        operatorList.add("||   logisches oder");

        System.out.println("Operatoren");
        for (String i : operatorList)
        {
            System.out.println(i);
        }
    }
}