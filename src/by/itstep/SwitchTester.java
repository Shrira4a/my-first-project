package by.itstep;

import java.util.Scanner;

public class  SwitchTester
{
    public static void main(String[] args)
    {
        System.out.println("Введите день недели:");
        Scanner sc=new Scanner(System.in);
        int scan=sc.nextInt();

        switch(scan)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Normal mode");



        }
        System.out.println("Введите номер месяца:");
        int scana=sc.nextInt();
        switch(scana)
        {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;


            default:
                System.out.println("Normal mode");

        }
        if(scana>=3 && scana<=5)
        {
            System.out.println("THIS IS SPRING!!");
        }
        if(scana>=6 && scana<=8)
        {
            System.out.println("THIS IS SUMMER!!");
        }
        if(scana>=9 && scana<=11)
        {
            System.out.println("THIS IS AUTUMN!!");
        }
        else
        {
            System.out.println("THIS IS WINTER!!");
        }



//        char number[]=new Character[]

//        char codepoint='0';
//        Character scanner=sc.next().charAt(0);
//        boolean b1=scanner.isAlphabetic(codepoint);
//        switch(scanner)
//        {
//            case (Character.isAlphabetic):
//            {
//                System.out.println("Это буква!");
//                break;
//            }
//            default:
//                System.out.println("Это не буква!");
//        }

        System.out.println("Введите символ:");
        Character scanner=sc.next().charAt(0);
        if(Character.isAlphabetic(scanner.charValue()))
        {
            int code=(int)scanner;
            if(code==65||code==69||code==73||code==79||code==85||code==89)
            {
                System.out.println("Это гласные");

            }
            for(code=65;code<122;code++)
            {
              code+=32;
            }
            System.out.println("Это гласные, но не заглавные");
        }
        else
        {
            System.out.println("Вы ввели не букву!");
        }
    }
}
