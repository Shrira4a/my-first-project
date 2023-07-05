package by.itstep;


public class VarTester {
    //    public static int temp=20;
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        System.out.println("My name is Nicka!!!");
        System.out.print("Current t=-2!!!\n");
        System.out.print("tomorrow t=-6!!!\n");
        //variable declaration - создание переменных хихи
        //<type> <var_name>;
        int temp;

        //variable initialisation - ввод данных в переменные
        //<var_name>=<value>;
        temp = -2;

        //variable declaration and initialisation
        //<type><var_name>=<value>;
        double d1 = Math.random()+9;
        double d2 = Math.random()+9;
        double d3 = Math.random()+9;
        double avg = (d1 + d2 + d3) / 3;
        System.out.println("Среднее значение:" + avg);

        double height=5.6;
        System.out.println("Рост:" + height);
        System.out.println(temp);

        int tomTemp=34;
        System.out.println(tomTemp);

        int a=15,b=16;
        int c1=3,c2=6,c3=8,c4=9;


    }
}
