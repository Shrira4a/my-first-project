package by.itstep.oop.casting;

public class Rectangle extends Shape
{
    public int a,b;
    @Override
    public void print()
    {
        if(a!=b)
        {
            System.out.println(" -------------");
            System.out.println("|             |");
            System.out.println("|             |");
            System.out.println("|             |");
            System.out.println("|             |");
            System.out.println("|             |");
            System.out.println("|             |");
            System.out.println(" -------------");
        }
        else
        {
            System.out.println(" -------------");
            System.out.println("|             |");
            System.out.println("|             |");
            System.out.println("|             |");
            System.out.println("|             |");
            System.out.println(" -------------");
        }

    }
    Rectangle(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    Rectangle(int a)
    {
        this.a=a;
    }

    @Override
    public void calculateP()
    {
        int pi=(a+b)*2;
        setP(pi);

    }

    @Override
    public void calculateS()
    {
       int sq=a*b;
       setS(sq);
    }
    public void chance()
    {
        if(a==b)
        {
            System.out.println("It's a square");
        }
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
}
