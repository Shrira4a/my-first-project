package by.itstep.oop.casting.Init;

public class Child extends Parent
{
        private int p;
        private static int pStatic;

        static {
            System.out.println("Child Static block begin:");
            System.out.println(pStatic);
            pStatic=123;
            System.out.println(pStatic);
            System.out.println("Child Static block ends:");
        }

        {
            System.out.println("Child non-static block begin:");
            System.out.println(p);
            p=123;
            System.out.println(p);
            System.out.println("Child non-static block ends:");
        }
        public Child()
        {
            System.out.println("child constructor begin");
            p=321;
            System.out.println(p);
            System.out.println("child constructor ends");
        }

        public int getP() {
            return p;
        }

        public static int getpStatic() {
            return pStatic;
        }


}
