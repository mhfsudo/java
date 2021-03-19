package ch.mhf.multithreading;

/*
    Implementieren des Interface Runnable und der run() Methode
 */

public class InterfaceThread implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("Start " + Thread.currentThread().getName());
        try
        {
            for (int i = 0; i < 5; i++)
            {
                System.out.println(i + " ");
                Thread.sleep(500);
            }
        }catch (InterruptedException e)
        {
            //Flag erneut setzen und dadurch Abrruch ermöglichen
            Thread.currentThread().interrupt();
        }
        System.out.println("Stop " + Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
        Thread thread1 = new Thread(new InterfaceThread(), "first thread");
        Thread thread2 = new Thread(new InterfaceThread(), "second thread");

        thread1.start();
        thread2.start();
    }
}