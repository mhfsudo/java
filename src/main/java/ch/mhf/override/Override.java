package ch.mhf.override;

import java.util.ArrayList;
import java.util.List;

public class Override
{

    public static void main(String[] args)
    {

        List<Dog> hundeListe = new ArrayList<>();
        hundeListe.add(new Hound());
        hundeListe.add(new Hound());
        hundeListe.add(new Dog());
        hundeListe.add(new Dog());
        hundeListe.add(new Dog());

        for (Dog currentElement : hundeListe) {
            currentElement.bark();
        }
    }
}

class Dog
{
    public void bark()
    {
        System.out.println("I'm a dog. Woof!");
    }
}

class Hound extends Dog
{
    @java.lang.Override
    public void bark()
    {
        System.out.println("I'm a hound. Howl!");
    }
}
