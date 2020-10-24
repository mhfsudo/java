package ch.mhf.klassen;

public class ClassMain
{
    //Datenfelder / Instanzvariablen
    private int variable1 = 10;                                 //nur innerhalb der Klasse verfügbar
    public int variable2 = 20;                                  //überall verfügbar
    protected int variable3 = 30;                               //innerhalt des Pakets und allen abgeleiteten Klassen verfügbar
    final double PI = 3.14159; 									//Konstante kann nicht mehr geändert werden
    public static final int VARIABLE = 40;

    public static void main(String[] args)                      //in der Main Methode beginnt das Programm
    {
        ClassMain object = new ClassMain();
        System.out.println(object.variable1);                   //output 10
        System.out.println(object.variable2);                   //output 20
        System.out.println(object.variable3);                   //output 30
        System.out.println(object.PI);							//output 3.14.159
        System.out.println(ClassMain.VARIABLE);        			//output 40
    }
}