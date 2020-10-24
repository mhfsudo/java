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
        Integer i3 = 123;

        s1.equals(s2);                          //return true
        s1.equals("Lisa");                      //return true
        i3.toString();                          //return "123"
        Integer.toString(123);                  //return "123"
        s1.length();                            //return 3
        s1.toLowerCase();                       //return lisa
        s1.toUpperCase();                       //return LISA
        s3.trim();                              //return Lisa
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