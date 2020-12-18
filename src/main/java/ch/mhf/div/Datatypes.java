package ch.mhf.div;

import java.util.ArrayList;

public class Datatypes
{
    public static void main(String[] args)
    {
        ArrayList<String> primitiveDataTypes = new ArrayList<String>();
        primitiveDataTypes.add("byte");
        primitiveDataTypes.add("short");
        primitiveDataTypes.add("int");
        primitiveDataTypes.add("long (15_000_000_000L)");
        primitiveDataTypes.add("float (7.7f)");
        primitiveDataTypes.add("double (666,666d)");
        primitiveDataTypes.add("boolean");
        primitiveDataTypes.add("char");                                     //a Char is surrounded by single Quote 'A'

        ArrayList<String> complexDataTypes = new ArrayList<String>();
        complexDataTypes.add("String");
        complexDataTypes.add("Objects");

        System.out.println("Primitive Datentypen");
        for (String i : primitiveDataTypes)
        {
            System.out.println(i);
        }

        System.out.println("\nKomplexe Datentypen");
        for (String i : complexDataTypes)
        {
            System.out.println(i);
        }
    }
}