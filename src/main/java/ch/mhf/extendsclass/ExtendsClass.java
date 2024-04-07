package ch.mhf.extendsclass;

class Vehicle
{
    protected String brand = "Tesla";
    public void honk()
    {
        System.out.println("Tuut");
    }
}

public class ExtendsClass extends Vehicle
{
    private String modelName = "Model X";
    public static void main(String[] args)
    {
        ExtendsClass myCar = new ExtendsClass();
        myCar.honk();                                                   //output Tuut
        System.out.println(myCar.brand + " " + myCar.modelName);        //output Tesla Model X
    }
}
