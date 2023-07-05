package by.itstep;

import java.util.Scanner;

public class Calculator
{

    public static int a;
    public static int b;
    public static void printSumma(int a,int b)
    {
        System.out.println("Summa = "+(a+b));
    }
    public static void multi(int a,int b)
    {
        System.out.println("Multiplication ="+(a*b));
    }
    public static void minus(int a,int b)
    {
        System.out.println("Substraction ="+(a-b));
    }
    public static void del(double a,double b)
    {
        if(b==0)
        {
//            System.out.println("Oopsies, the second value is 0");
            throw new IllegalArgumentException("Oopsies, the second value is 0");
        }
        else {
            System.out.println("Delenie =" + (a / b));
        }

    }

    public static void sqrt(int a)
    {
        if(Math.sqrt(a)!=0)
        {
            System.out.println("Square=" + Math.sqrt(a));
        }
        if(Math.sqrt(a)!=Integer.valueOf((int) Math.sqrt(a)))
        {
            System.out.println("The square isn't integer");
        }
        else if(Math.sqrt(a)==Integer.valueOf((int) Math.sqrt(a)))
        {
            System.out.println(Math.sqrt(a));
        }
        else
            {
            System.out.println("Oopies, something is zero");
        }
    }

    public static int road(int v,int t)
    {
        System.out.println("Ваше расстояние "+(v*t));
        return v*t;
    }
    public static int summa(int a,int b)
    {
        final int result = a + b;
        return result;
    }
//    public static double summa(double a,double b)
//    {
//        final int result = a + b;
//        return result;
//    }
    public static int sub(int a,int b)
    {
        int resul = a - b;
        return resul;
    }
    public static int multip(int a,int b)
    {
        final int result = a + b;
        return result;
    }

    public static int pifagor(int a,int b)
    {
       int suma=(int)(Math.pow(a,2)+Math.pow(b,2));
        int pif=(int)Math.sqrt(suma);
        System.out.println("Гипотенуза:"+pif);
        return suma;
    }

    public static void menu()
    {
        System.out.println("Введите значения для функций:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Выберите пункт:\n1)Summary;\n2)Substraction;\n3)Division;\n4)Multiplication;\n5)Pifagor;\n6)Road.");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Введите значения:");
                printSumma(a,b);
                summa(0,0);
                break;
            case 2:
                System.out.println("Введите значения:");
                minus(a,b);
                break;
            case 3:
                System.out.println("Введите значения:");
                del(a,b);
                break;
            case 4:
                System.out.println("Введите значения:");
                multi(a,b);
                break;
            case 5:
                System.out.println("Введите значения:");
                pifagor(a,b);
                break;
            case 6:
                System.out.println("Введите значения:");
                road(a,b);
                break;
            default:
                System.out.println("You didn't choose anything");
        }
        System.out.println("Хотите повторить?(y/n):");
        String ok=sc.next();
        if(ok.equals("y"))
        {
            menu();
        }
        if(ok.equals("n"))
        {
            System.out.println("Вы вышли из программы");
        }
        else if(!ok.equals("y")&& !ok.equals("n"))
            {
            System.out.println("Вы ввели не то значение!");
        }
    }
    public static void menur()
    {
        System.out.println("Введите значения для функций:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int ch=(int)(Math.random()*6)+1;
        System.out.println("Наш ассистент выберет за вас функцию, она под номером:"+ch);
        switch (ch)
        {
            case 1:
                printSumma(a,b);
                summa(0,0);
                break;
            case 2:
                minus(a,b);
                break;
            case 3:
                del(a,b);
                break;
            case 4:
                multi(a,b);
                break;
            case 5:
                pifagor(a,b);
                break;
            case 6:
                road(a,b);
                break;
            default:
                System.out.println("You didn't choose anything");
        }
        System.out.println("Хотите повторить?(y/n):");
        String ok=sc.next();
        if(ok.equals("y"))
        {
            menur();
        }
        if(ok.equals("n"))
        {
            System.out.println("Вы вышли из программы");
        }
        else if(!ok.equals("y")&& !ok.equals("n"))
        {
            System.out.println("Вы ввели не то значение!");
        }

    }

    //Client
    public static void main(String[] args) {
//        printSumma(10,60);
//        int s=summa(10,20);
//        road(10,4);
//        System.out.println("Сумма3:"+summa(10,20));
//        System.out.println(s);
//        minus(12,18);
//        int subs=sub(12,18);
//        multi(34,6);
//        del(10,6);
//        sqrt(4);
//        System.out.println(sub(sub(2,2),summa(4,4)));
//        pifagor(3,4);
        menur();


    }
}
