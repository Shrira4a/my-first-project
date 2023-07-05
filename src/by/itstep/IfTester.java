package by.itstep;

public class IfTester
{
    public static void main(String[] args)
    {
//        System.out.println("Begin");
//        int t=-30;
//        //if(<condition>) {<body>}, where condition can be true or false.
//        //if condition is true -> body
//        if(t>20)
//        {
//            System.out.println("Майка");
//        }
//        else if(t<-15)
//        {
//            System.out.println("Шуба");
//        }


//        double m1=3,m2=3,m3=10,m4=5,m5=10;
//        double avg=(m1+m2+m3+m4+m5)/5;
//        if(avg<=8)
//        {
//            System.out.println("Ты хорошист "+avg);
//        }
//        else if(avg>8)
//        {
//            System.out.println("Ты отличник "+avg);
//        }
//        else
//        {
//            System.out.println("Ой "+avg);
//        }
//        int d1=7,d2=9,d3=3;
//        if(d1+d2>d3 && d2+d3>d1 && d2+d1 >d3)
//        {
//            System.out.println("Можно построить треугольник");
//        }
//       else
//        {
//            System.out.println("Нельзя построить");
//        }
       int num1=7,num2=4,num3=1;
       if(num1==num2 || num2==num3)
       {
           System.out.println("Равны 1 и 2 или 2 и 3");
       }
        if(num1<num2 || num3<num2)
        {
            System.out.println("Первое или третее меньше второго");

        }
        if(num1>num2 || num1>num3)
        {
            System.out.println("Второе или третье меньше первого");

        }

        double y;
        double x=20;
        if(x<=-50)
        {
            y=7*Math.pow(x,2.0);

        }
        else
        {
            if(x>-50 && x<=50)
            {
                y=3*x;
            }
            else
            {
                y=Math.pow(x,3);
            }
        }
        System.out.println("Корень:"+y);

        double y1;
        double x1=-30;
        if(x1<=-20)
        {
            y1=3*Math.pow(x1,2.0);

        }
        else
        {
            if(x>-20 && x<=30)
            {
                y1=-x1;
            }
            else
            {
                y1=30;
            }
        }
        System.out.println("Корень 1:"+y1);


        int a=0,b=0,c=0,min=0;
        if(a<b)
        {
            min=a;
        }
        if(min>c)
        {
            min=c;
        }
        System.out.println("Минимум: "+min);
        System.out.println("End.");
    }
}
