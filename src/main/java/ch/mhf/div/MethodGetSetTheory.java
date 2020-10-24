package ch.mhf.div;

public class MethodGetSetTheory
{
    //Datenfelder / Instanzvariablen
    private String parameter;

    //Setter Method
    public void setMethodName(String newParameter)
    {
        this.parameter = newParameter;
    }

    //Getter Method
    public String getMethodeName()
    {
        return parameter;
    }

    public static void main(String[] args)
    {
        MethodGetSetTheory myObject = new MethodGetSetTheory();
        myObject.setMethodName("Lisa");
        System.out.println(myObject.getMethodeName());
    }
}
