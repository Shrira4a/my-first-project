package by.itstep.oop.casting;

public class Driver
{
    private char[] types;

    public void drive()
    {
        System.out.println("driving........");
    }

    public void dpsCheck()
    {
        System.out.println("sharing documents.......");
        for(char type:types)
        {
            System.out.println(type);
        }

    }

    public Driver(char[] types) {
        this.types = types;
    }

    public char[] getTypes() {
        return types;
    }

    public void setTypes(char[] types) {
        this.types = types;
    }
}


class Programmer extends Driver
{
    public Programmer(char[] types)
    {
        super(types);
    }

    public void writeCode()
    {
        System.out.println("main(){}...");
    }
}

class Student extends Driver
{
    public Student(char[] types)
    {
        super(types);
    }

    public void drinkVodka()
    {
        System.out.println("drinking.....");
    }
}

class Test
{
    public static void main(String[] args)
    {
        char[]types={'A','B'};
        Driver d=new Driver(types);

        d.drive();
        d.dpsCheck();

        char[] types1={'B'};
        Programmer p1=new Programmer(types1);
        p1.dpsCheck();
        p1.drive();
        p1.writeCode();

        //IS-A RELATIONSHIP
        Driver d1=p1;

    }
}



