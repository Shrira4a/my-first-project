package by.itstep.inh.evolution;

public class Darwin
{
    public static void main(String[] args)
    {
        Australopithecus a=new Australopithecus();
        a.setAge(2000000);
        a.setStage("Австралопитек");
        a.eat();
        a.fight();
        a.lives();
        a.speech();
        System.out.println();
        a.setGod("Боже");

        Homosapiens h=new Homosapiens();
        h.setAge(40000);
        h.setStage("Кроманьонец");
        h.eat();
        h.circle();
        h.speech();
        h.fight();
        h.lives();
        System.out.println();

        ModernHuman m = new ModernHuman();
        m.setStage("Современный человек");
        m.eat();
        m.culture();
        m.setAge(2023);
        m.lives();
        m.fight();
        m.speech();

        System.out.println();
        WaterLife w=new WaterLife();
        w.setStage("Первая жизнь");
        w.eat();
        w.fight();
        w.lives();
        w.speech();

    }
}
