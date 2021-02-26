package ch.mhf.multithreading;

/*
    Ableiten von der Klasse Thread und Überschreiben der run() Methode
 */

public class ClassThread extends Thread
{
    String name;

    //Constructor
    public ClassThread(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        System.out.println("Start " + name);
        try
        {
            for (int i = 0; i < 5; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            //Flag erneut setzen und dadurch Abrruch ermöglichen
            Thread.currentThread().interrupt();
        }
        System.out.println("Stop " + name);
    }

    public static void main(String[] args)
    {
        ClassThread thread1 = new ClassThread("first thread");
        ClassThread thread2 = new ClassThread("second thread");

        thread1.start();
        thread2.start();
    }
}