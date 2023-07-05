package by.itstep;

import lombok.Data;

@Data
public class Person
{
    int age;
    String name;
    String lastName; //
    char gender;// can be 'f', 'm'
    boolean isSingle;
    boolean hasOwner;
    String[] cats;

    Cat[] cats2;
    Dog[] dogs;


    public Cat[] getCats2() {
        return cats2;
    }

    public void setCats2(Cat[] cats2) {
        this.cats2 = cats2;
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }

    public Person getGod1() {
        return god1;
    }

    public void setGod1(Person god1) {
        this.god1 = god1;
    }

    Person god1;



    Person(Cat o)
    {

    }
    Person(Dog b)
    {

    }
//    public void goodPerson(boolean trait)
//    {
//        if(trait==true) {
//            System.out.println("The person is taking care of the cat");
//        }
//        else
//        {
//            System.out.println("The person doesn't like cats,he's a dog owner");
//        }
//    }
    //methods <=> functions.
    void sayMyName()
    {
        System.out.println("Hello , my name is " + name);
    }

    void dance()
    {
        System.out.println(name + " is dancing");
    }

    void drink()
    {
        if(age >= 18){
            System.out.println("Vine or/and Beer");
        } else {
            System.out.println("Water, only water");
        }
    }
    void marriage()
    {
        if(isSingle==true)
        {
            System.out.println("He is single or divorced");
        }
        if(isSingle==false)
        {
            System.out.println("He is married");
        }
    }


}
    class Car
    {
        public String engine;
        public String brand;
        public int speed;
        public String color;
        public int year;
        public int price;
        public String gas;
        public String owner;
        public boolean isCar;

        Car(String engine,String brand,int speed,String color,int year,int price,String gas,String owner,boolean isCar)
        {
            this.engine=engine;
            this.gas=gas;
            this.brand=brand;
            this.owner=owner;
            this.isCar=isCar;
            this.year=year;
            this.price=price;
            this.color=color;
            this.speed=speed;

        }

        public void fast()  {

            if(speed>120)
            {
                System.out.println("You have a nascar");
            }
            else
            {
                System.out.println("You drive like my grandma");
            }
            System.out.println("We are going faster!");

        }
        public void ifCar()
        {
            if(isCar==true)
            {
                System.out.println("You drive a car");
            }
            else
            {
                System.out.println("You go by feet");
            }
        }
        public void time()
        {
            if(year>2000)
            {
                System.out.println("It's a modern car");
            }
            else
            {
                System.out.println("It's a time machine");
            }
        }
        public void own()
        {
            if(owner.equals("me"))
            {
                System.out.println("You are the owner of the car");
            }
            else
            {
                System.out.println("Get away from my car");
            }
        }
        public void showBrand()
        {
            if(brand.equals("lada"))
            {
                System.out.println("It's a specific choice of brand");
            }
            else
            {
                System.out.println("It's an oversea car");
            }
        }
        public void setEngine()
        {
            if(engine.equals("electro"))
            {
                System.out.println("You care about environment");
            }
            else
            {
                System.out.println("It's bad for nature,but fast");
            }
        }
        public void setColor()
        {
            if(color.equals("white"))
            {
                System.out.println("Your car has no color");
            }
            else
            {
                System.out.println("Your car has a color");

            }
        }
    }

class Tester {
    public static void main(String[] args) {
        int num;
        //
//        Person person;
//        // instance creation <=> object creation. via 'new' operator
//        person = new Person();
//
//        // instance fields initialisation <=> object populating
//        person.name = "John";
//        person.age = 32;
//        person.gender = 'm';
//        person.isSingle = true;
//        person.lastName = "Johnson";
//
//        // object behavior <=> methods invocation
//        person.sayMyName();
//        person.drink();
//        person.dance();
//        person.marriage();
//
//        System.out.println("*********************");

        Car car=new Car("electro","bmw",200,"black",2003,100000,"electro","me",true);
        car.own();
        car.fast();
        car.ifCar();
        car.setColor();
        car.time();
        car.showBrand();
        car.setEngine();


    }
}
