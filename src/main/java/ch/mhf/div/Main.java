package ch.mhf.div;

/*
 * Beim Aufruf der Main-Methode können theoretisch String-Attribute mitgegeben werden.
 * Dies wird allerdings in der Praxis kaum angewendet.
 */

public class Main
{
    private int value;

    public Main(int value)
    {
        this.value = value;
    }

    public void getValue()
    {
        System.out.println(value);
    }

    public static void main(String[] args)
    {
        int value = 77;                         //Default Wert falls kein Wert mitgegeben wird
        if (args.length > 0)
        {
            value = Integer.valueOf(args[0]);  //Falls ein Wert mitgegeben wird, wird dieser verwendet
        }
        Main mainTest = new Main(value);
        mainTest.getValue();                    //Output 77
    }
}