package ch.mhf.classes;

/*
 *Der Konstruktor hat den gleichen Namen wie die Klasse
 *Es können mehrere Konstruktoren vorkommen
 *Der Konstruktor erzeugt eine neue Instanz/Objekt der Klasse
 */

public class Constructor
{
    String str;                                                 //create a class attribute

    public Constructor(String str)                              //create a class constructor for the class ConstructorExample
    {
        this.str = str;                                         //initialize the attribute str
    }

    public static void main(String[] args)
    {
        //this will call the constructor
        Constructor object1 = new Constructor("Hello");          //create object of the class
        Constructor object2 = new Constructor("World");
        System.out.println(object1.str + " " + object2.str);     //output Hello World
    }
}