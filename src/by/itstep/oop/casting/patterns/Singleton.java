package by.itstep.oop.casting.patterns;

import java.util.Date;

public class Singleton
{
    private static Singleton singleton;
    private String value;
    Singleton()
    {
        System.out.println("new Instance created");

    }

    //LAZY IMPLEMENTATION-CREATING AN EXAMPLE ON THE FIRST CALL OF THE CLIENT
    public static Singleton getInstance()
    {
        if(singleton==null)
        {
            singleton=new Singleton();
            singleton.value=new Date().toString();
        }
        return singleton;
    }

    public String getValue()
    {
        return value;
    }
}

class SingleDemo
{
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton.getValue());

    }
}
