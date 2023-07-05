package by.itstep;

import javafx.scene.transform.Scale;

import java.math.RoundingMode;
import java.util.Scanner;

public class Tasks {
    public static void task1() {
        System.out.println("Begin method body");
        System.out.println("Logic is here...");
        System.out.println("End");
    }

    public static void uravnenie1() {
        System.out.println("Введите значение a:");
        Scanner ina = new Scanner(System.in);
        int a = ina.nextInt();

        System.out.println("Введите значение b:");
        Scanner inb = new Scanner(System.in);
        int b = inb.nextInt();

        System.out.println("Введите значение c:");
        Scanner inc = new Scanner(System.in);
        int c = inc.nextInt();


        double d = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Ваше значение дискриминанта:" + d);
        if (d < 0) {
            System.out.println("Нет корней");
        } else if (d == 0) {
            System.out.println("Один корень:");
            double x = -b / (2 * a);
            System.out.println(x);
        } else if (d > 0) {
            System.out.println("Два корня:");
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1: " + x1 + " x2: " + x2);
        }
    }

    public static void triangle() {
        System.out.println("Введите значение первой стороны треугольника:");
        Scanner inaa = new Scanner(System.in);
        int a1 = inaa.nextInt();

        System.out.println("Введите значение второй стороны:");
        Scanner inbb = new Scanner(System.in);
        int b1 = inbb.nextInt();

        System.out.println("Введите значение третьей стороны:");
        Scanner incc = new Scanner(System.in);
        int c1 = incc.nextInt();
        if (a1 + b1 > c1 && a1 + c1 > b1 && c1 + b1 > a1) {
            if (a1 == b1 || b1 == c1 || c1 == a1) {
                System.out.println("Треугольник равнобедренный");
            } else if (a1 == b1 && b1 == c1) {
                System.out.println("Треугольник равносторонний");
            }
            double p = a1 + b1 + c1;
            double squaretr = Math.sqrt(p * (p - a1) * (p - b1) * (p - c1));
            System.out.println("Площадь треугольника: " + squaretr + ", периметр: " + p);

        } else {

            System.out.println("Треугольник невозможно построить, повторите: ");
        }
    }

    public static void ssquare() {
        System.out.println("Введите значение первой стороны четырехугольника:");
        Scanner ins = new Scanner(System.in);
        int s1 = ins.nextInt();

        System.out.println("Введите значение второй стороны:");
        Scanner inss = new Scanner(System.in);
        int s2 = inss.nextInt();
        if (s1 == s2) {
            System.out.println("Это квадрат");
            double ssqsq = Math.pow(s1, 2);
            System.out.println("Площадь квадрата: " + ssqsq + ", его периметр: " + s1 * 4);
        } else {
            System.out.println("Это не квадрат");
        }


    }

    public static void menu() {
        System.out.println("Введите номер функции, которую хотите выполнить.:");
        System.out.println("1)Треугольник, 2)Квадрат, 3)Круг");
        Scanner inm = new Scanner(System.in);
        int m = inm.nextInt();
        while (!(m == 1 || m == 2 || m == 3)) {
            System.out.println("Введено неправильное значение, повторите: ");
            Scanner im = new Scanner(System.in);
            m = im.nextInt();
        }
        switch (m) {
            case 1:
                triangle();
                break;
            case 2:
                ssquare();
                break;
            case 3:
                circle();
                break;
        }

    }

    public static void calories(double BMR)
    {
        int snickers=36;
        double s=0;
        System.out.println("Введите свой вес:");
        Scanner inw = new Scanner(System.in);
        double weight = inw.nextDouble();

        System.out.println("Введите свой рост:");
        Scanner inh = new Scanner(System.in);
        double height = inh.nextDouble();

        System.out.println("Введите свой возраст:");
        Scanner inag = new Scanner(System.in);
        int age = inag.nextInt();

        System.out.println("Вы мужчина(male) или женщина(female)?:");
        Scanner ing = new Scanner(System.in);
        String gender = ing.next();
        if(gender.equals("male"))
        {
            BMR=88.36+(13.4*weight)+4.8*height-(5.7*age);
            s=BMR/snickers;

        }
        else if(gender.equals("female"))
        {
            BMR=447.6+(9.2*weight)+3.1*height-(4.2*age);
            s=BMR/snickers;

        }
        else
        {
            System.out.println("Простите, такого варианта на сайте пока нет.");
        }
        System.out.println("Ваша суточная норма калорий: "+BMR+", вы можете съесть столько сникерсов: "+s);

    }

    public static void circle() {
        System.out.println("Введите значение радиуса круга:");
        Scanner inr = new Scanner(System.in);
        int r1 = inr.nextInt();
        double sqrad = 3.14 * Math.pow(r1, 2);
        double length = 3.14 * r1 * 2;
        System.out.println("Площадь круга: " + sqrad + ", длина его окружности: " + length);
    }

    public static void main(String[] args) {
        Tasks t = new Tasks();

        System.out.println("Begin main body");
        t.task1();//run method
        System.out.println("Logic main is here...");
//        t.uravnenie1();
//        t.triangle();
//        t.ssquare();
//        t.circle();
//        menu();
        calories(0);
        System.out.println("End");
    }
}
