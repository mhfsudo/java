package ch.mhf.classes;

public class NestedClass
{
    //...
    static class StaticNestedClass
    {
        //...
    }
    class InnerClass
    {
        //...
    }

    public static void main(String[] args)
    {
        //instances an object of the static nested class
        NestedClass.StaticNestedClass nestedObject = new NestedClass.StaticNestedClass();

        //instances an object of the outer class and then an object of the inner class
        NestedClass outerObject = new NestedClass();
        NestedClass.InnerClass innerObject = outerObject.new InnerClass();
    }
}
