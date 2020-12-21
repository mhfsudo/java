package ch.mhf.interfaces;

/*
 *Data abstraction is the process of hiding certain details and showing
 *only essential information to the user
 *An interface is a completely abstract class that is used to group
 *related methods with empty bodies
 *
 *Nur die Klasse die das Interface implementiert kann die Methode implementieren
 */

interface Example
{
    public void doAction();
}

class SubClassName implements Example
{
    public void doAction()
    {
        System.out.println("Hello");
    }
}

public class InterfaceTheory
{
    public static void main(String[] args)
    {
        SubClassName myClass = new SubClassName();
        myClass.doAction();                             //output Hello
    }
}