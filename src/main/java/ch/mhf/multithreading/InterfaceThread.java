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
        Thread thread1 = new Thread(new InterfaceThread("first thread"));
        Thread thread2 = new Thread(new InterfaceThread("second thread"));

        thread1.start();
        thread2.start();
    }
}