package by.itstep.oop.casting;

public abstract class JavaProgrammer
{
    abstract void makeCode();
    public void playTennis()
    {
        System.out.println("Play Tennis....");
    }
}
class MiddleJavaDeveloper extends JavaProgrammer
{

    @Override
    void makeCode()
    {
        System.out.println("Write some good code");
        playTennis();
    }
    void drinksCoffee()
    {
        System.out.println("drinks coffee");
    }

}
class SeniorJavaDeveloper extends JavaProgrammer
{
    void makeCode()
    {
        System.out.println("Write some perfect code");
        playTennis();
    }
    void leaveOffice()
    {
        System.out.println("leave office.");
    }
}
class JuniorJavaDeveloper extends JavaProgrammer
{
    void makeCode()
    {
        System.out.println("Write some bad code");

    }
    void studyLanguage()
    {
        System.out.println("studies.");
    }
}
class Company
{
    public static void main(String[] args) {
        JuniorJavaDeveloper junior=new JuniorJavaDeveloper();
        JavaProgrammer programmer=junior;//upcasting

        Object o =(Object)new SeniorJavaDeveloper();
        Object o2=(Object)(JavaProgrammer)new MiddleJavaDeveloper();

        JavaProgrammer jp=new SeniorJavaDeveloper();
        if(jp instanceof SeniorJavaDeveloper)
        {
            SeniorJavaDeveloper sjp = (SeniorJavaDeveloper) jp;
            sjp.leaveOffice();
        } else if (jp.getClass() == JuniorJavaDeveloper.class)
        {
            JuniorJavaDeveloper jun=(JuniorJavaDeveloper) jp;
            jun.studyLanguage();
        }

        //
        JavaProgrammer [] programmers={junior,(JavaProgrammer)o,(JavaProgrammer)o2,jp};
        System.out.println("programmers "+programmers.length);
        for(JavaProgrammer pr:programmers)
        {
            pr.makeCode();
        }

        method(2,3);
        method(2.0,3.4);
    }
    static void method(int a,int b)
    {
        System.out.println(a+b);

    }
    static void method(double a,double b)
    {
        System.out.println(a+b);

    }
}