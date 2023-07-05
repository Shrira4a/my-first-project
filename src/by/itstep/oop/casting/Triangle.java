package by.itstep.oop.casting;

public class Triangle extends Shape
{
    private int a,b,c;
    @Override
    public void print() {
        System.out.println("    ^");
        System.out.println("   /|");
        System.out.println("  / |");
        System.out.println(" /  |");
        System.out.println("/___|");

    }

    @Override
    public void calculateP()
    {
        int per=a+b+c;
        setP(per);
    }

    @Override
    public void calculateS()
    {
        int square= (int) (0.5*b*a);
        setS(square);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public static void main(String[] args)
    {

    }
}
