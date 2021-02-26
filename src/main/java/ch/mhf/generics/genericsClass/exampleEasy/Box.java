package ch.mhf.generics.genericsClass.exampleEasy;

/*
    Ohne Generics müsste nun ein Konstruktor für jeden Datentypen erstellt werden,
    zusätzlich auch eine getter-Methode
 */

public class Box <T>
{
    private T objectInBox;

    public Box(T objectInBox)
    {
        this.objectInBox = objectInBox;
    }

    public T getObjectInBox()
    {
        return objectInBox;
    }
}
