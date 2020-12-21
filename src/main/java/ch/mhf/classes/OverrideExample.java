package ch.mhf.classes;

class SuperClass
{
    public int doAction()
    {
        return 0;
    }
}
public class OverrideExample extends SuperClass
{
    @Override
    public int doAction()
    {
        return 1;
    }

    public static void main(String[] args)
    {
        OverrideExample myClass = new OverrideExample();
        System.out.println(myClass.doAction());                 //output 1 because @Override
    }
}