package by.itstep.oop.casting;

public class ShapeTester
{
    public static void main(String[] args)
    {
        Triangle triangle=new Triangle();
        triangle.setA(11);
        triangle.setB(9);
        triangle.setS(6);
        triangle.calculateP();
        triangle.calculateS();
        triangle.print();
        triangle.setColor("Red");
        triangle.showInfo();

        System.out.println();
        Rectangle rectangle=new Rectangle(9,9);
        rectangle.chance();
        rectangle.calculateP();
        rectangle.calculateS();
        rectangle.print();
        rectangle.setColor("Yellow");
        rectangle.showInfo();

        System.out.println();
        Circle c=new Circle(5);
        c.chance();
        c.calculateP();
        c.calculateS();
        c.print();
        c.setColor("Purple");
        c.showInfo();

        //CASTING-DOESN'T CHANGE THE STATE OF AN OBJECT

        //UPCASTING - WE SEE AN OBJECT WITH A MUTUAL PARENT LINK, THE FUNCTIONALITY OF THIS CLASS ISN'T APPROACHABLE
        Shape sh1=new Rectangle(3,7);

        //LITERAL UPCASTING (<SUPER TYPE>) INSTANCE
        Shape sh2=(Shape) new Rectangle(54);

        //DOWNCASTING - WE GET A SPECIFIC OBJECT
        Shape sh3=new Rectangle(3,9);
        Rectangle sh4=(Rectangle) sh3;
        sh4.setA(11);
//
        //



    }
}
