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
            Thread.sleep(100);
        }catch (InterruptedException e)
        {
            //Flag erneut setzen und dadurch Abrruch ermöglichen
            Thread.currentThread().interrupt();
        }
        System.out.println("Stop " + name);
    }

    public static void main(String[] args)
    {
        ClassThread t1 = new ClassThread("first thread");
        ClassThread t2 = new ClassThread("second thread");

        t1.start();
        t2.start();
    }
}