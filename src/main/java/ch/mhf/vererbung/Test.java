package ch.mhf.vererbung;

public final class Test {

    public static void main(String[] args)
    {
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println("----");
        a.t();
        ((A) b).t();
        System.out.println("----");
        A a2 = new C();
        a2.t();
    }
}

class A {

    public A()
    {
        System.out.println("A");
    }

    public void t()
    {
        System.out.println("A.t");
    }
}

class B extends A
{

    @Override
    public void t()
    {
        System.out.println("B.t");
    }
}

class C extends B
{

    public C()
    {
        System.out.println("C");
    }

    @Override
    public void t()
    {
        super.t();
        B b = new B();
    }
}
