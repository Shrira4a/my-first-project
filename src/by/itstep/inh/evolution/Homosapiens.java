package by.itstep.inh.evolution;

public class Homosapiens extends Human
{
    void fight()
    {
        super.fight();
        super.fight();
        super.fight();

    }
    void eat()
    {
        System.out.println(getStage()+" сейчас где-то ест саблезубого тигра");
    }
    void lives()
    {
        System.out.println(getStage()+" сейчас живет в эре "+ getAge());
    }

    @Override
    void speech()
    {
        System.out.println(" Hello my friend");
    }
    void circle()
    {
        System.out.println(getStage()+ " пытается создать колесо...");
    }
}
