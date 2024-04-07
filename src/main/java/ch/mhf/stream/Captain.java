package ch.mhf.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Captain
{

    public static void main(String[] args)
    {
        String[] names = {"Anne", "Captain CiaoCiao", "Balico", "Charles", "Anne", "ChiaoCiao", "CiaoCiao", "Drake", "anne", "Balico", "CiaoCiao"};

        System.out.println(Arrays.stream(names)
                .map(name -> name.toLowerCase())
                .map(name -> name.replace("captain ciaociao", "ciaociao"))
                //.map(n -> { if (n.contains("captain ciaociao")) { return "ciaociao"; } else { return n; }})
                .collect(Collectors.groupingBy(name -> name, Collectors.counting())));
    }
}