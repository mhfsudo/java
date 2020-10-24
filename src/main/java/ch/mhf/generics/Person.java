package ch.mhf.generics;

public class Person
{
    final Person wizard = new Person("Wizard", "Bern");
    final Person mike = new Person("Mike", "Zofingen");

    final Pair<String, Person> pair1 = new Pair<>("Dark", wizard);
    final Pair<String, Person> pair2 = new Pair<>("Iron", mike);

    public Person(String wizard, String bern)
    {
    }
}