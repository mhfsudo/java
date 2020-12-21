package ch.mhf.classes;

class OverrideSuperClass
{
    public int doAction()
    {
        return 0;
    }
}
public class OverrideExample extends OverrideSuperClass
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