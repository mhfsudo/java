package ch.mhf.collatz;

public class Collatz
{
    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        for (int durchlauf = 1; durchlauf <= 10; durchlauf++) {
            long startTime = System.nanoTime();
            for (long zahl = 1; zahl <= 5_000_000L; zahl++) {
                collatz.berechneFolgeRekursiv(zahl);
            }
            long endTime = System.nanoTime();
            System.out.format("Dauer für rekursiv: %.2f s    ", (endTime - startTime) / 1_000_000_000.);

            startTime = System.nanoTime();
            for (long zahl = 1; zahl <= 5_000_000L; zahl++) {
                collatz.berechneFolgeIterativ(zahl);
            }
            endTime = System.nanoTime();
            System.out.format("Dauer für iterativ: %.2f s%n", (endTime - startTime) / 1_000_000_000.);
        }

        System.out.println("Puh, geschafft!");
    }


    private void berechneFolgeRekursiv(long zahl) {
//        System.out.print(zahl + " ");

        if (zahl == 1) {             /* Abbruchbedingung */
            return;
        } else if (zahl % 2 == 0) {  /* gerade Zahl */
            berechneFolgeRekursiv(zahl / 2);
        } else {                     /* ungerade Zahl */
            berechneFolgeRekursiv(3 * zahl + 1);
        }
    }

    private void berechneFolgeIterativ(long zahl) {
        do {
//            System.out.print(zahl + " ");

            if (zahl % 2 == 0) {
                zahl = zahl / 2;
            } else {
                zahl = 3 * zahl + 1;
            }
        } while (zahl > 1);

//        System.out.print(zahl + " ");
    }
}
