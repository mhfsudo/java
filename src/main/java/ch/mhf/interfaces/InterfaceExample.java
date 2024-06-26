package ch.mhf.interfaces;

/*
 *Data abstraction is the process of hiding certain details and showing
 *only essential information to the user
 *An interface is a completely abstract class that is used to group
 *related methods with empty bodies
 *
 *Nur die Klasse die das Interface implementiert kann die Methode implementieren
 */

interface Pet
{
    //Interface method (don't have a body)
    public void animalSound();

    //Interface default method (can have a body)
    public default void sleep()
    {
        System.out.println("Zzz");
    }
}

//Implements the Animal Interface
class Dog implements Pet
{
    public void animalSound()
    {
        System.out.println("Wuff");
    }
}

//Implements the Animal Interface
class Cat implements Pet
{
    public void animalSound()
    {
        System.out.println("Miau");
    }
}

public class InterfaceExample
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog();
        myDog.animalSound();                    //output Wuff
        myDog.sleep();                          //output Zzz

        Cat myCat = new Cat();
        myCat.animalSound();                    //output Miau
        myCat.sleep();                          //output Zzz
    }
}