package by.itstep;

import java.util.Scanner;

public class WhileTester
{
    public static int number;
    public static void main(String[] args) throws InterruptedException {

        int temp=23;//konstanta
        System.out.println("Введите объем воды(от 1 до 5000):");
        Scanner sc=new Scanner(System.in);
        int scanner=sc.nextInt();
        final int max=100;

        if(scanner<5000 && scanner>1)
        {
            while (temp < max)
            {

                Thread.sleep(500*(scanner/1000));
                System.out.println("Температура воды:");
                int x = (int) (Math.random() * 6) + 5;
                System.out.println(temp);
                temp += x;


            }
        }

        else
        {
            System.out.println("Not a real value");
        }

        step3();
        step4();
        step5();
        step6();
        crystals();

    }

    public static void step3()
    {
        System.out.print("\nРяд с шагом 10: ");
//        for(int i=0,number=10;i<50;i++)
        number=0;
        while(number<50)
        {
            System.out.print(number+" ");
            number+=10;
        }
    }
    public static void step4()
    {
        System.out.print("\nРяд с шагом -1: ");
//        for(int i=0,number=-1;i<100;i++)
        number=-1;
        while(number>-100)
        {
            System.out.print(number+" ");
            number-=1;
        }
    }
    public static void step5()
    {
        System.out.println("\nИнверсия:");
//        for(int i=0,number=-1;i<100;i++)
        number=-1;
        while(number>-100)
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
//        for(int i=0,number;i<25;i++)
        int i=0;
        while(i<25)
        {

            number=(int)(Math.random()*11);
            System.out.print(number+" ");
            i++;


        }
        System.out.println();
    }

    public static void crystals()
    {
        int a=0;
//        for(int a=0;a<9;a++)
        System.out.println("Кристалы:");
        while(a<10)
        {
            int studentNumber=(int)(Math.random()*13)+1;
            System.out.print(studentNumber+" ");
            a++;
        }
    }
}
