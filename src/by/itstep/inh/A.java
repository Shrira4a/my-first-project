package by.itstep.inh;

public class A
{
    int a;
    void m1()
    {
        System.out.println("m1: Inside A");
    }

}

class B extends A
{
    int b;
    void m2()
    {
        System.out.println("m2:Inside A");
    }

}
class C extends A
{
    int c;
    void m1()
    {
        System.out.println("m1: Inside C");
    }
    void m3()
    {
        System.out.println("m3: Inside C");
    }

}
class D extends B
{
    int d;
    void m1()
    {
        System.out.println("m1: Inside D");
    }

    void m2()
    {
        System.out.println("m2:Inside D");
    }

    void m3()
    {
        System.out.println("m3: Inside D");
    }

}
class E extends D
{
    int e;
    void m4()
    {
        System.out.println("m4: Inside E");
    }

}
class ABCDE
{
    public static void main(String[] args) {
        E e=new E();
        C c=new C();
        e.m1();
        e.m2();
        e.m3();
        e.m4();

        c.m1();
        c.m3();
    }
}