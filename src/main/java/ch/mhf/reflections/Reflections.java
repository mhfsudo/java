package ch.mhf.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
Ergänzen Sie im folgenden Codefragment den Rumpf der Methode toString.
Die Methode soll folgende Funktion implementieren:
-        Es werden alle öffentlichen Member-Variablen mit Namen und Typ ausgegeben, die in der Klasse „className“ enthalten sind.
-        Für statische Member wird zusätzlich der Wert der Variablen ausgegeben.
-        Es muss kein Exception Handling implementiert werden.
 */

public class Reflections
{
    public static void toString(String className) throws Exception
    {
        Class clazz = Class.forName(className);    // 2 Punkte

        Field[] fields = clazz.getFields();        // 2 Punkte
        for (Field f : fields)
        {
            System.out.print("" + className + "." + f.getName() + "(" + f.getType() + ")");  // 2 Punkte
            if (Modifier.isStatic(f.getModifiers())) // 2 Punkte
                System.out.print("=" + f.get(null));  // 1 Punkt
            System.out.println();         // 1 Punkt für korrekte Formatierung der Ausgabe
        }
    }
}