package ch.mhf.arraylistverketten;

import java.util.ArrayList;

public class ArrayListVerketten
{
    public static void main(String[] args) {

        ArrayList<String> liste1 = new ArrayList<String>();
        ArrayList<String> liste2 = new ArrayList<String>();
        ArrayList<String> rueckgabeListe = new ArrayList<String>();

        liste1.add(0, "ABDCD");
        liste1.add(1, "012345");
        liste1.add(2, "hervor");
        liste1.add(3, "un");
        liste1.add(4, "Besser");
        liste1.add(5, "Club");
        liste1.add(6, "Maus");
        liste1.add(7, "Hallo");

        liste2.add(0, "EFGH");
        liste2.add(1, "6789");
        liste2.add(2, "ragend");
        liste2.add(3, "bedingt");
        liste2.add(4, "wisser");
        liste2.add(5, "999");

        int i = 0;

        while(i < liste1.size() || i < liste2.size())
        {
            if(i < liste1.size() && i < liste2.size())
            {
                rueckgabeListe.add(liste1.get(i) + liste2.get(i));
            }else if(i < liste1.size())
            {
                rueckgabeListe.add(liste1.get(i));
            }else
            {
                rueckgabeListe.add(liste2.get(i));
            }
            i++;
        }
        System.out.println(rueckgabeListe.toString());	//output [ABDCDEFGH, 0123456789, hervorragend, unbedingt, Besserwisser, Club999, Maus, Hallo]
    }
}