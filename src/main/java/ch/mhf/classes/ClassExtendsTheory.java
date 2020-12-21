package ch.mhf.classes;

/*
 * Fields und Methods der Superclass werden an die Subclass weitervererbt
 */

class SuperClass
{
    //attribute
    char attribute1 = 'a';

    //constructor
    public SuperClass()
    {
        System.out.println("A");
    }

    //method
    public void doAction1()
    {
        System.out.println(1);
    }
}

class ClassExtendsTheory extends SuperClass
{
    //attribute
    char attribute2 = 'b';

    //constructor
    public ClassExtendsTheory()
    {
        super();
        System.out.println("B");
    }

    //method
    public void doAction2()
    {
        System.out.println(2);
    }

    public static void main(String[] args)
    {
        SuperClass object1 = new SuperClass();                  //output A
        ClassExtendsTheory object2 = new ClassExtendsTheory();  //output A B
        SubClass object3 = new SubClass();                      //output A B C

        System.out.println("----------");

        SuperClass object4 = new ClassExtendsTheory();          //output A B
        SuperClass object5 = new SubClass();                    //output A B C
        //ClassExtendsTheory object6 = new SuperClass();        //not possible
        ClassExtendsTheory object7 = new SubClass();            //output A B C
        //SubClass object8 = new ClassExtendsTheory();          //not possible
        //SubClass object9 = new SuperClass();                  //not possible

        System.out.println("----------");

        System.out.println(object1.attribute1);                 //output a
        System.out.println(object2.attribute1);                 //output a
        System.out.println(object2.attribute2);                 //output b
        System.out.println(object3.attribute1);                 //output a
        System.out.println(object3.attribute2);                 //output b
        System.out.println(object3.attribute3);                 //output c

        System.out.println("----------");

        object1.doAction1();                                    //output 1
        object2.doAction1();                                    //output 1
        object2.doAction2();                                    //output 2
        object3.doAction1();                                    //output 1
        object3.doAction2();                                    //output 2
        object3.doAction3();                                    //output 3
    }
}

class SubClass extends ClassExtendsTheory
{
    //attribute
    char attribute3 = 'c';

    //constructor
    public SubClass()
    {
        super();
        System.out.println("C");
    }

    //method
    public void doAction3()
    {
        System.out.println(3);
    }
}