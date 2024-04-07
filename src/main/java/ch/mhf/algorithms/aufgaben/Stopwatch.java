package ch.mhf.aufgaben;

public class Stopwatch
{
    private long startTime;
    private long stopTime;

    /**
     * starting the stop watch.
     */
    public void start()
    {
        startTime = System.nanoTime();
    }

    /**
     * stopping the stop watch.
     */
    public void stop()
    {
        stopTime = System.nanoTime();
    }

    /**
     * elapsed time in nanoseconds.
     */
    public long getTime()
    {
        return (stopTime - startTime);
    }

    public String toString()
    {
        return "elapsed time: " + getTime() + " nanoseconds.";
    }
}
