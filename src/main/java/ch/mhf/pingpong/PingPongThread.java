package ch.mhf.pingpong;

public class PingPongThread extends Thread
{
    String message;
    public PingPongThread(String message)
    {
        this.message = message;
    }

    @Override
    public void run()
    {
        System.out.println(message);
    }

    public static void main(String[] args)
    {
        PingPongThread pingThread = new PingPongThread("Ping");
        PingPongThread pongThread = new PingPongThread("Pong");
        pingThread.start();
        pongThread.start();
    }
}