package ch.mhf.div;

/*
 *Wrapper classes provide a way to use primitive data types as objects
 */

import java.util.ArrayList;

public class WrapperClass
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

        ArrayList<String> wrapperClassDataTypes = new ArrayList<String>();
        wrapperClassDataTypes.add("Byte");
        wrapperClassDataTypes.add("Short");
        wrapperClassDataTypes.add("Int");
        wrapperClassDataTypes.add("Long");
        wrapperClassDataTypes.add("Float");
        wrapperClassDataTypes.add("Double");
        wrapperClassDataTypes.add("Boolean");
        wrapperClassDataTypes.add("Char");

        System.out.println("Primitive Datentypen");
        for (String i : primitiveDataTypes)
        {
            System.out.println(i);
        }

        System.out.println("\nWrapper Klassen");
        for (String i : wrapperClassDataTypes)
        {
            System.out.println(i);
        }
    }
}