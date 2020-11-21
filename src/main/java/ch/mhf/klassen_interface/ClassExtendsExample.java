package ch.mhf.klassen_interface;

class Vehicle
{
    protected String brand = "Tesla";
    public void honk()
    {
        System.out.println("Tuut");
    }
}

public class ClassExtendsExample extends Vehicle
{
    private String modelName = "Model X";
    public static void main(String[] args)
    {
        ClassExtendsExample myCar = new ClassExtendsExample();
        myCar.honk();                                                   //output Tuut
        System.out.println(myCar.brand + " " + myCar.modelName);        //output Tesla Model X
    }
}