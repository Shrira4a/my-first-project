package fort;

public class ForTest
{
    public static void main(String[] args)
    {
        //      0       1            3         2
        //for(<var>;<condition>;<iteration>){body}
        //<var>-only one time
        //<condition>- true or false
        //<iteration>-every time after body
//        for(int i=0;i<10;i++)
//        {
//            System.out.println(i);
//        }
//
//        for(; true ;)
//        {
//            System.out.println("Always true");
//            int x=(int)(Math.random()*10);
//            System.out.println(x);
//            if(x==5)
//            {
//                break;//выход из цикла
//            }
//        }
//        step1000();
//        step2();
        step3();
        step4();
        step5();
        step6();
        step7();
        crystals();


    }
    public static void step1000()
    {

            for (int i = 2; i <= 1000; i=i+2)
            {
                System.out.print(i+" ");
            }

    }

    public static void step2()
    {
        System.out.print("Ряд с шагом 2: ");
        for(int i=1;i<=1000;i=i+2)
        {
            System.out.print(i+" ");
        }
    }

    public static void step3()
    {
        System.out.print("\nРяд с шагом 10: ");
        for(int i=0,number=10;i<50;i++)
        {
            System.out.print(number+" ");
            number+=10;
        }
    }
    public static void step4()
    {
        System.out.print("\nРяд с шагом -1: ");
        for(int i=0,number=-1;i<100;i++)
        {
            System.out.print(number+" ");
            number-=1;
        }
    }
    public static void step5()
    {
        System.out.println("\nИнверсия:");
        for(int i=0,number=-1;i<100;i++)
        {
            if(number%2==0)
            {
                System.out.print(((-1)*number)+" ");
            }
            else
                {
                System.out.print(number+" ");
            }
           number--;

        }
        System.out.println();

    }
    public static void step6()
    {
        System.out.println("\nРандом:");
        for(int i=0,number;i<25;i++)
        {
           number=(int)(Math.random()*11);
            System.out.print(number+" ");

        }
        System.out.println();
    }

    public static void step7()
    {
        System.out.println("\nТаблица умножения:");
        for(int i=2;i<=10;i++)
        {
            for(int j=2;j<10;j++)
            {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");

            }
            System.out.println();

        }

    }

    public static void crystals()
    {
        for(int a=0;a<9;a++)
        {
            int studentNumber=(int)(Math.random()*12)+1;
            System.out.println(studentNumber);
        }
    }

}
