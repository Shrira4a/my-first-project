package by.itstep.inh.evolution;

import by.itstep.Person;


public class Human extends Evolution
{

    public String getGod() {
        return god;
    }

    public void setGod(String god) {
        this.god = god;
    }

    private String god;

    void fight()
    {
        System.out.println(getStage()+ " дерется");
    }
    void eat()
    {
        System.out.println(getStage()+" сейчас где-то ест");
    }
    void lives()
    {
        System.out.println(getStage()+" сейчас живет в эре "+ getAge());
    }
    void speech()
    {
        System.out.println(" Разговаривает на своем");
    }

}
