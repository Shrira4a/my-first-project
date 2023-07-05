package by.itstep.oop.casting;

import by.itstep.ArraysUtil;

public class Human
{
    private static int counter;
    private int age;
    private String name;
    public Human()
    {
        System.out.println("New human +1 ");
        counter++;
        age++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

class TestH
{
    public static void main(String[] args) {

//        System.out.println("Number of humans "+n);
        Human human=new Human();

        new Human();
        new Human();
        new Human();
        new Human();
        int n=Human.getCounter();
        int age=human.getAge();
        System.out.println("Number of humans "+n+",their age "+age);
    }
}