package by.itstep.oop.casting.patterns.factory;

public abstract class Transport
{
    public abstract void deliver();
}

class Plane extends Transport
{
    @Override
    public void deliver() {
        System.out.println("Fly delivery");
    }
}
class Truck extends Transport
{

    @Override
    public void deliver() {
        System.out.println("Road delivery");
    }
}

class Ship extends Transport
{
    @Override
    public void deliver()
    {
        System.out.println("Sea delivery");
    }
}

class FactoryPatternMethod
{
    public static Transport getTransport(String type)
    {
        switch (type)
        {
            case "Plane":
                return new Plane();
            case "Truck":
                return new Truck();
            case "Ship":
                return new Ship();
            default:
                throw new IllegalArgumentException("no such delivery type");
        }
    }
}

class Client
{
    public static void main(String[] args)
    {
        Transport tr1= FactoryPatternMethod.getTransport("Ship");
        tr1.deliver();
    }
}

