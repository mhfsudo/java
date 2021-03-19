package ch.mhf.multithreading;

public class EndThread extends Thread
{
    @Override
    public void run()
    {
        int i = 0;

        while (!isInterrupted())
        {
            try
            {
                System.out.println(i);
                i++;
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                //Flag erneut setzen und dadurch Abrruch ermöglichen
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        EndThread thread1 = new EndThread();
        thread1.start();

        Thread.sleep(2000);
        thread1.interrupt();
    }
}
