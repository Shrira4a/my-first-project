package by.itstep.oop.casting;

//DESCRIBE BASIC FIELDS AND FUNCTIONS - CANNOT CREATE EXAMPLE
public abstract class Shape
{
    private int s;
    private int p;
    private String color;

    //ABSTRACT METHODS DON'T HAVE BODIES, ARE USED FOR A DECLARATION OF DESCENDANTS
    public abstract void print();
    public abstract void calculateP();
    public abstract void calculateS();

    public void showInfo()
    {
        System.out.println("Shape: S = "+s+", P= "+p+", Color is "+color);
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args)
    {

    }
}
