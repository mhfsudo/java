package ch.mhf.compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Getraenk implements Comparable<Getraenk>
{
    private String name;

    private int zuckerGehaltInProzent;

    public Getraenk(String name, int zuckerGehaltInProzent) {
        this.name = name;
        this.zuckerGehaltInProzent = zuckerGehaltInProzent;
    }

    @Override
    public String toString() {
        return ("Ich bin ein/e " + name + " und ich habe " + zuckerGehaltInProzent + "% Zucker.");
    }

    @Override
    public int compareTo(Getraenk anderesGetraenk)
    {
        return this.zuckerGehaltInProzent - anderesGetraenk.zuckerGehaltInProzent;
    }
}

class SortGetraenke
{
    public static void main(String[] args) {
        List<Getraenk> getraenkeListe = new ArrayList<>();
        getraenkeListe.add(new Getraenk("Vanilla Coke", 11));
        getraenkeListe.add(new Getraenk("Coca Cola", 10));
        getraenkeListe.add(new Getraenk("Cola Zero", 0));
        getraenkeListe.add(new Getraenk("Mountain Dew", 15));
        getraenkeListe.add(new Getraenk("Apfelsaft", 5));

        Collections.sort(getraenkeListe);

        for (Getraenk aktuellesGetraenk : getraenkeListe) {
            System.out.println(aktuellesGetraenk);
        }
    }
}