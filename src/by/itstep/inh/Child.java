package by.itstep.inh;

import by.itstep.Cat;

//"IS-A" RELATIONSHIP
public class Child extends Parent
{
    private int iq;


    //"HAS-A" RELATIONSHIP
    private Cat cat;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    //ПЕРЕОПРЕДЕЛЕНИЕ
    @Override
    public void sayMyName()
    {
        //SUPER-ССЫЛКА НА СУПЕРКЛАСС
        super.sayMyName();
        System.out.println("My name is "+ getName());
    }

    public void jump()
    {
        System.out.println("jumping "+getName());
    }

    public static void main(String[] args) {

    }
}
