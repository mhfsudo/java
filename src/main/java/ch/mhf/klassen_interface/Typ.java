package ch.mhf.klassen_interface;

/*
 * Example dynamic and static typ
 * die Variable c hat den statischen Typ A und den dynamischen Typ B
 */

public class Typ
{

    public static void main(String[] args)
    {
        class A {}
        class B extends A {}
        A c = new B();
    }

}
