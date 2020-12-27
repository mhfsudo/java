package ch.mhf.method;

public class MethodGetSetTheory
{
    //attribute
    private String attribute;

    //Setter Method
    public void setMethodName(String attribute)
    {
        this.attribute = attribute;
    }

    //Getter Method
    public String getMethodName()
    {
        return attribute;
    }

    public static void main(String[] args)
    {
        MethodGetSetTheory object = new MethodGetSetTheory();
        object.setMethodName("Lisa");
        System.out.println(object.getMethodName());            //output Lisa
    }
}
