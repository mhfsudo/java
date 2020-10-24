package ch.mhf.div;

/*
 * Break = jump out of a switch statement or a loop
 * Continue = break one iteration and continue with the next
 */

public class BreakContinue
{

    public static void breakE()
    {
        int i = 0;
        while (i < 10) {
            System.out.println(i);          //Output 0 1 2 3
            i++;
            if (i == 4) {
                break;
            }
        }
    }

    public static void continueE()
    {
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);          //Output 0 1 2 3 5 6 7 8 9
            i++;
        }
    }

    public static void main(String[] args)
    {
        BreakContinue breakExample = new BreakContinue();
        breakExample.breakE();
        BreakContinue continueExample = new BreakContinue();
        continueExample.continueE();
    }
}