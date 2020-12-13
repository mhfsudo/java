package ch.mhf.div;

/*
 * Zeichenketten können nicht geänder werden,
 * es wird eine neue Zeichenkette generiert
 */

public class StringExample
{
    public static void main(String[] args)
    {
        String s1 = "Lisa";
        String s2 = "Lisa";
        String s3 = " Lisa ";
        String s4 = "This is Lisa";
        String s5 = "123";
        Integer i3 = 123;

        s1.equals(s2);                          //return true - Strings vergleichen
        s1.equals("Lisa");                      //return true - Strings vergleichen
        i3.toString();                          //return "123" - Zahl in String konventieren
        String.valueOf(i3);                     //return "123" - Zahl in String konventieren
        Integer.toString(123);                //return "123" - Zahl in String konventieren
        Integer.parseInt(s5);                   //return 123 - String in Zahl konventieren
        s1.length();                            //return 3 - Länge des Strings
        s1.toLowerCase();                       //return lisa
        s1.toUpperCase();                       //return LISA
        s3.trim();                              //return Lisa - entfernt die Leerzeichen
        s4.indexOf("Lisa");                     //return 8
        s1.concat(s2);                          //return LisaLisa

        /*
         * \' = '
         * \" = "
         * \\ = \
         * \n = new Line
         * \r = carriage return
         * \t = new tab
         * \f = form feed
         */

    }
}