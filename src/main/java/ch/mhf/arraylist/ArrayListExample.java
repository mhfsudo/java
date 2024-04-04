package ch.mhf.arraylist;

import java.util.ArrayList;

public class ArrayListExample
{
    public ArrayList<String> cloneList(ArrayList<String> list)
    {
        ArrayList<String> newList = new ArrayList<>();

        for (String currentElement : list)
        {
            newList.add(currentElement.toLowerCase());
        }
        return newList;
    }

    public static void main(String[] args)
    {
        ArrayListExample myList = new ArrayListExample();

        ArrayList<String> list = new ArrayList<>();
        list.add("Lisa");
        list.add("MICHAEL");

        System.out.println(myList.cloneList(list));             //output [lisa, michael]
    }
}
