package by.itstep.oop.casting.Init;

public class Parent
{
    private int p;
    private static int pStatic;

    static {
        System.out.println("Parent Static block begin:");
        System.out.println(pStatic);
        pStatic=123;
        System.out.println(pStatic);
        System.out.println("Parent Static block ends:");
    }

    {
        System.out.println("Parent non-static block begin:");
        System.out.println(p);
        p=123;
        System.out.println(p);
        System.out.println("Parent non-static block ends:");
    }
    public Parent()
    {
        super();
        System.out.println("parent constructor begin");
        p=321;
        System.out.println(p);
        System.out.println("parent constructor ends");
    }

    public int getP() {
        return p;
    }

    public static int getpStatic() {
        return pStatic;
    }
}
