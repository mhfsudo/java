package ch.mhf.classes;

/*
 * Fields und Methods der Superclass werden an die Subclass weitervererbt
 */

class SuperClass1
{
    //Fields (No modifier)
    String name;

    //Methods
    public void doAction()
    {
        System.out.println(0);
    }
}

public class ClassExtendsTheory extends SuperClass1
{
    public static void main(String[] args)
    {
        ClassExtendsTheory myClass = new ClassExtendsTheory();
        myClass.doAction();                 //output 0

        myClass.name = "Michael";
        System.out.println(myClass.name);   //output Michael

    }
}