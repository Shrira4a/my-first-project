package by.itstep.inh.evolution;

public class Australopithecus  extends Human
{
    void fight()
    {
        super.fight();
        super.fight();
        super.fight();

    }
    void eat()
    {
        System.out.println(getStage()+" сейчас где-то ест мамонта");
    }
    void lives()
    {
        System.out.println(getStage()+" сейчас живет в эре "+ getAge());
    }

    @Override
    void speech()
    {
        System.out.println(" Ooga Booga");
    }
}
