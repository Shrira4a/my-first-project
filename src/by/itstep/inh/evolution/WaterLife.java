package by.itstep.inh.evolution;

public class WaterLife extends Human
{
    void fight()
    {
        System.out.println(getStage()+ " дерется за выживание");
    }
    void eat()
    {
        System.out.println(getStage()+" сейчас где-то ест молекулы");
    }
    void lives()
    {
        System.out.println(getStage()+" сейчас живет в эре "+ getAge());
    }
    void speech()
    {
        System.out.println(" Молчит");
    }
    void god()
    {
        System.out.println(getGod());
    }
}
