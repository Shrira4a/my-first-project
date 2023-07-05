package by.itstep.inh;

import by.itstep.Cat;

public class Tester
{
    public static void main(String[] args) {
        Third third=new Third();
        third.setIq(7);
        third.setName("Антон");
        third.setAge(12);
        third.setIq(3000);

        //"USE" RELATIONSHIP
        Cat cat=new Cat();
        third.setCat(cat);
        System.out.println(cat.toString());
        third.getCat();

        third.sayMyName();
        third.run();
        third.jump();

        System.out.println(third.toString());
    }
}
