package ch.mhf.generics.genericsClass.exampleEasy;

public class Program
{
    public static void main(String[] args)
    {
        Box<Integer> box1 = new Box<>(77);
        System.out.println(box1.getObjectInBox());                  // output 77

        Box<String> box2 = new Box<>("Hello Generics");
        System.out.println(box2.getObjectInBox());                  // output Hello Generics
    }
}
