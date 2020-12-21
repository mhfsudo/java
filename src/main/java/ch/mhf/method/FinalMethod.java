package ch.mhf.method;

class FinalMethod
{
    public void myMethod()
    {
    }

    public final void myFinalMethod()
    {
    }
}

class FinalMethod2 extends FinalMethod
{
    @Override
    public void myMethod()
    {
    }

    /*
        @Override
        public void myFinalMethod()
        {
        }
     */
}