package by.itstep;

public class Dog
{
    private long id;
    private String name;
    private String type;
    private char gender;
    private int age;
    private double w;
    private double n;
//    public static void main(String[] args) {
//
//    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int agen)
    {
        this.age=agen;
        if(agen<0)
        {
            System.out.println("Incorrect");
        }
        else
        {
            age=agen;
        }
    }

    public void setGender(char gender)
    {
        this.gender=gender;
    }
    public char getGender()
    {
        return gender;
    }

}
class DogTester
{
    public static void main(String[] args)
    {
        Dog dog=new Dog();
        dog.setName("Dobbie");
        System.out.println(dog.getName());
        dog.setAge(-2);
        System.out.println(dog.getAge());
        dog.setGender('M');
        System.out.println(dog.getGender());
    }
}
