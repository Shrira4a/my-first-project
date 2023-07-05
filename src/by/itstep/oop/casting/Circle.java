package by.itstep.oop.casting;

public class Circle extends Shape
{
    int r;
    @Override
    public void print()
    {
        System.out.println("       ..     ");
        System.out.println("  .          .");
        System.out.println(" .            .");
        System.out.println("  .          .");
        System.out.println("       ..     ");
        if(r==0)
        {
            System.out.println("????????");
        }

    }

    Circle(int r)
    {
        this.r=r;
    }
    @Override
    public void calculateP()
    {
        int pe=(int)Math.PI*2*r;
        setP(pe);
    }

    @Override
    public void calculateS() {
        int si=(int)Math.PI*r;
        setS(si);

    }
    public void chance()
    {
        if(r==0)
        {
            System.out.println("It has no radius,it's not round");
        }
        else
        {
            System.out.println("It's a circle indeed");
        }
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
