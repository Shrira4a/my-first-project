package by.itstep.oop.casting.Init;

public class Third extends Child
{
        private int p;
        private static int pStatic;

        static {
            System.out.println("Third Static block begin:");
            System.out.println(pStatic);
            pStatic=123;
            System.out.println(pStatic);
            System.out.println("Third Static block ends:");
        }

        {
            System.out.println("Third non-static block begin:");
            System.out.println(p);
            p=123;
            System.out.println(p);
            System.out.println("Third non-static block ends:");
        }
        public Third()
        {
            System.out.println("third constructor begin");
            p=321;
            System.out.println(p);
            System.out.println("third constructor ends");
        }

        public int getP() {
            return p;
        }

        public static int getpStatic() {
            return pStatic;
        }


}
