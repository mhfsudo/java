package ch.mhf.output;

/*
 * Programm in der Konsole aufrufen java ReadKeyboard.java
 */

public class ReadKeyboard
{
    public static void main(String[] args)
    {
        java.io.Console cons = System.console();
        String name;
        int age;
        char[] password;

        if (cons != null)
        {
            cons.printf("Gib Deinen Namen ein: ");
            name = cons.readLine();
            cons.printf("Gib Dein Alter ein: ");
            age = Integer.parseInt(cons.readLine());
            cons.printf("Gib ein Passwort ein: ");
            password = cons.readPassword();
            //cons.printf("Name: " + name + " Alter: " + age + " Password: " + password);
            cons.printf("Name: %s Alter: %d Passwort: %s \n", name, age, password);
        }
    }
}