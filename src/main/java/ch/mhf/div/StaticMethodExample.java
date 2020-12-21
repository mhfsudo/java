package ch.mhf.div;

public class StaticMethodExample
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
        myStaticMethod();                               //output I'm static

        //we have to create an instance to call the nonStaticMethod

        StaticMethodExample object = new StaticMethodExample();
        object.myNonStaticMethod();                    //output I'm not static
    }
}