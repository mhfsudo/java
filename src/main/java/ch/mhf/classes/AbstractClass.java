package ch.mhf.classes;

class SuperAbstractClass
{
    //attribute
    char attribute1 = 'a';

    //constructor
    public SuperAbstractClass()
    {
        System.out.println("A");
    }

    //method
    public void doAction1()
    {
        System.out.println(1);
    }
}

abstract class ClassAbstract extends SuperAbstractClass
{
    //attribute
    char attribute2 = 'b';

    //constructor is possible
    public ClassAbstract()
    {
        super();
        System.out.println("B");
    }

    //method
    public void doAction2()
    {
        System.out.println(2);
    }

    //abstract method (has no body)
    abstract public void doAction3();

    public static void main(String[] args)
    {
        SuperAbstractClass object1 = new SuperAbstractClass();      //output A
        //ClassAbstract object2 = new ClassAbstract();              //not possible
        SubAbstractClass object3 = new SubAbstractClass();          //output A B C

        System.out.println("----------");

        //SuperAbstractClass object4 = new ClassAbstract();         //not possible
        SuperAbstractClass object5 = new SubAbstractClass();        //output A B C
        //ClassAbstract object6 = new SuperAbstractClass();         //not possible
        ClassAbstract object7 = new SubAbstractClass();             //output A B C
        //SubAbstractClass object8 = new ClassAbstract();           //not possible
        //SubAbstractClass object9 = new SuperAbstractClass();      //not possible

        System.out.println("----------");

        System.out.println(object1.attribute1);                     //output a
        System.out.println(object3.attribute1);                     //output a
        System.out.println(object3.attribute2);                     //output b
        System.out.println(object3.attribute3);                     //output c

        System.out.println("----------");

        object1.doAction1();                                        //output 1
        object3.doAction1();                                        //output 1
        object3.doAction2();                                        //output 2
        object3.doAction3();                                        //output 3
        object3.doAction4();                                        //output 4
    }
}

class SubAbstractClass extends ClassAbstract
{
    //attribute
    char attribute3 = 'c';

    //constructor
    public SubAbstractClass()
    {
        super();
        System.out.println("C");
    }

    //abstract method must be override
    @Override
    public void doAction3()
    {
        System.out.println(3);
    }

    //method
    public void doAction4()
    {
        System.out.println(4);
    }
}