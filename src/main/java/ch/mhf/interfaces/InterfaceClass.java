package ch.mhf.interfaces;

/*
    Data abstraction is the process of hiding certain details and showing
    only essential information to the user
    An interface is a completely abstract class that is used to group
    related methods with empty bodies

    Nur die Klasse die das Interface implementiert kann die Methode implementieren
 */

interface Interface1
{
    //by default public static final
    char MARK = '!';

    //by default public abstract
    void doAction1();
}

interface Interface2
{
    //by default public abstract
    void doAction2();
}

public class InterfaceClass implements Interface1, Interface2
{
    @Override
    public void doAction1()
    {
        System.out.print("Hello ");
    }

    @Override
    public void doAction2()
    {
        System.out.println("World" + MARK);
    }

    public static void main(String[] args)
    {
        InterfaceClass object = new InterfaceClass();
        object.doAction1();                             //output Hello
        object.doAction2();                             //output World!
    }
}