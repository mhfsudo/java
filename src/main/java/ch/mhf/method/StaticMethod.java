package ch.mhf.method;

public class StaticMethod
{
    static void myStaticMethod()
    {
        System.out.println("I'm static");
    }

    void myNonStaticMethod()
    {
        System.out.println("I'm not static");
    }

    public static void main(String[] args)
    {
        StaticMethod.myStaticMethod();                                      //output I'm static

        //we have to create an instance to call the nonStaticMethod
        StaticMethod object = new StaticMethod();
        object.myNonStaticMethod();                                         //output I'm not static
    }
}