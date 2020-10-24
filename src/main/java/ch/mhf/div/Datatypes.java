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
        primitiveDataTypes.add("long");
        primitiveDataTypes.add("float");
        primitiveDataTypes.add("double");
        primitiveDataTypes.add("boolean");
        primitiveDataTypes.add("char");

        ArrayList<String> complexDataTypes = new ArrayList<String>();
        complexDataTypes.add("String");
        complexDataTypes.add("Classes");

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