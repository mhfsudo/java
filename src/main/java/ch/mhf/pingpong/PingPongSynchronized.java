package ch.mhf.pingpong;

/*
Gegeben sei folgende Klasse PingPong, die parallel die Strings „Ping“ und „Pong“
ausgibt. Ändern Sie den Code so ab, dass die beiden Strings abwechselnd ausgegeben
werden. Die beiden Strings sollen dabei weiterhin in unterschiedlichen Threads
ausgegeben werden.
 */

public class PingPongSynchronized extends Thread
{
    String message;
    Object lock;

    public PingPongSynchronized(String message, Object lock)
    {
        this.message = message;
        this.lock = lock;
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (lock)
            {
                System.out.println(message);

                //Notify
                lock.notify();

                //Wait
                try
                {
                    lock.wait();
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Object lock = new Object();

        PingPongSynchronized pingThread = new PingPongSynchronized("Ping", lock);
        PingPongSynchronized pongThread = new PingPongSynchronized("Pong", lock);
        pingThread.start();
        pongThread.start();
    }
}