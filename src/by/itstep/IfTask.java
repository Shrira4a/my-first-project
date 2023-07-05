package by.itstep;

public class IfTask
{
    public static void main(String[] args) {
        boolean flag, flag1, flag2;
        int cash = 3444000, age = 51, IQ = 200;

        System.out.println("он богатый, умный и старый?");
        if (cash > 2000000 && age > 49 && IQ > 180)
        {
            flag = true;
            System.out.println(flag);

        }
        else
            {
                System.out.println("Неправда, я говорю нет");

            }
    }
}
