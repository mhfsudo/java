package ch.mhf.method;

public class Method
{
    //Method
    public static void myMethod1()
    {
        System.out.println("Hello");
    }

    //Method with parameter
    public static void myMethod2(String parameter1, int parameter2)
    {
        System.out.println("Hello " + parameter1 + parameter2);
    }

    //Method with return value
    public static int myMethod3()
    {
        return 5;
    }

    //Method with parameter and return value
    public static String myMethod4(String parameter3)
    {
        return "Hello " + parameter3;
    }

    public static void main(String[] args)
    {
        myMethod1();                                           //output Hello
        myMethod2("World",1);                                  //output Hello World1
        System.out.println(myMethod3());                       //output 5
        System.out.println(myMethod4("World"));      //output Hello World
    }
}