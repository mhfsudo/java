package ch.mhf.classes;

public class Attributes
{
    private int attribute1 = 1;                                                 //attribute
    private static int attribute2 = 2;                                          //static attribute
    private final int ATTRIBUTE3 = 3; 			                                //constant attribute
    private static final int ATTRIBUTE4 = 4;                                    //static constant attribute

    public static void main(String[] args)
    {
        Attributes object1 = new Attributes();                                    //object1
        Attributes object2 = new Attributes();                                    //object2

        System.out.println(object1.attribute1 + " " + object2.attribute1);      //output 1 1
        object1.attribute1 = 10;
        System.out.println(object1.attribute1 + " " + object2.attribute1);      //output 10 1

        System.out.println(Attributes.attribute2 + " " + Attributes.attribute2);  //output 2 2
        Attributes.attribute2 = 20;
        System.out.println(Attributes.attribute2 + " " + Attributes.attribute2);  //output 20 20

        System.out.println(object1.ATTRIBUTE3 + " " + object2.ATTRIBUTE3);      //output 3 3
        //object1.FIELD3 = 30;                                                  //not possible because field is static

        System.out.println(object1.ATTRIBUTE4 + " " + object2.ATTRIBUTE4);      //output 4 4
        //object1.FIELD4 = 40;                                                  //not possible because field is static
    }
}