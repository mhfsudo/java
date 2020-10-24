package ch.mhf.generics;

/*
    Wir definieren den Container Pair mit zwei formalen Typparametern T1 und T2,
    die qls Platzhalter für konkrete Typen beim Einsatz dienen.
 */

public final class Pair<T1, T2>
{
    private final T1 first;
    private final T2 second;

    public Pair(final T1 first, final T2 second)
    {
        this.first = first;
        this.second = second;
    }

    public final T1 getFirst() {return first;}
    public final T2 getSecond() {return second;}


}