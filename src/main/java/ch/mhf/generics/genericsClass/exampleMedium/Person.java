package ch.mhf.generics.genericsClass.exampleMedium;

public class Person
{
    private String name;
    private String place;

    public Person(String name, String place)
    {
        this.name = name;
        this.place = place;
    }

    @Override
    public String toString()
    {
        return name + " from " + place;
    }

    public static void main(String[] args)
    {
        Person alice = new Person("Alice", "Bern");
        Person bob = new Person("Bob", "Zofingen");

        Pair<String, Person> pair1 = new Pair<>("Angry", alice);
        Pair<String, Person> pair2 = new Pair<>("Bad", bob);

        System.out.println(pair1.getFirst() + " " + pair1.getSecond()); // output Angry Alice from Bern
        System.out.println(pair2.getFirst() + " " + pair2.getSecond()); // output Bad Bob from Zofingen
    }
}