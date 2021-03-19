package ch.mhf.multithreading;

public class SynchThread
{
    private int bankAccount = 2000;

    public void transaction() throws InterruptedException
    {
        Thread thread1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 10_000; i++)
                {
                    addOneCHF();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 10_000; i++)
                {
                    subtractOneCHF();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("New bank balance: " + getBankAccount());
    }

    public synchronized void addOneCHF()
    {
        bankAccount++;
    }

    public synchronized void subtractOneCHF()
    {
        bankAccount--;
    }

    public int getBankAccount()
    {
        return this.bankAccount;
    }

    public static void main(String[] args) throws InterruptedException
    {
        SynchThread myBankAccount = new SynchThread();

        System.out.println("Actual bank balance: " + myBankAccount.getBankAccount());

        myBankAccount.transaction();
    }

}
