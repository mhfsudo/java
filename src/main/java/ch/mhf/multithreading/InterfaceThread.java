package ch.mhf.multithreading;

/*
    Implementieren des Interface Runnable und der run() Methode
 */

public class InterfaceThread implements Runnable
{
    String name;

    //Constructor
    public InterfaceThread (String name)
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
        Thread t1 = new Thread(new InterfaceThread("first thread"));
        Thread t2 = new Thread(new InterfaceThread("second thread"));

        t1.start();
        t2.start();
    }
}