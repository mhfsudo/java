package ch.mhf.div;

import java.util.ArrayList;

public class Modifizierer {

    public static void main(String[] args)
    {
        ArrayList<String> modiList = new ArrayList<>();
        modiList.add("private  	-nur innerhalb der Klasse verfügbar");
        modiList.add("protected -innerhalt des Pakets und allen abgeleiteten Klassen verfügbar");
        modiList.add("public	-überall verfügbar");
        modiList.add("leer 		-automatisch private");

        System.out.println("Modifizierer");
        for (String i : modiList)
        {
            System.out.println(i);
        }
    }
}