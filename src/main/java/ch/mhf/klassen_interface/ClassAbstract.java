package ch.mhf.klassen_interface;

/*
 *Data abstraction is the process of hiding certain details and showing
 *only essential information to the user
 *Abstraction can be achieved with either abstract classes or interfaces
 */

//Better Solution with Interface
//SuperClass
abstract class AbstractAnimal
{
    //Abstract method (without body)
    public abstract void animalSound();
    //Regular method    (with body)
    public void sleep()
    {
        System.out.println("Zzz");
    }
}

//Subclass
class Cow extends AbstractAnimal
{
    public void animalSound()
    {
        System.out.println("Muhhh");
    }
}

//SubClass
class Pig extends AbstractAnimal
{
    public void animalSound()
    {
        System.out.println("Wee wee");
    }
}

public class ClassAbstract
{
    public static void main(String[] args)
    {
        Cow myCow = new Cow();
        myCow.animalSound();                    //output Muhhh
        myCow.sleep();                          //output Zzz

        Pig myPig = new Pig();
        myPig.animalSound();                    //output Wee wee
        myPig.sleep();                          //output Zzz
    }
}