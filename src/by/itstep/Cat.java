package by.itstep;

import java.util.Scanner;

public class Cat
{
    private String sound;
    private String breed;
    private char gender;
    private int kg;

    public Cat() {

    }


    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }



    public void play(boolean action)
    {
        if(action==true) {
            System.out.println("The cat is playing");
        }
        else
        {
            System.out.println("The cat is looking at you");
        }

    }
    public void eat(boolean action)
    {
        if(action==true) {
            System.out.println("The cat is eating");
        }
        else
        {
            System.out.println("The cat isn't hungry");
        }

    }
    public void sleep(boolean action)
    {
        if(action==true) {
            System.out.println("The cat is sleeping");
        }
        else
        {
            System.out.println("The cat is active");
        }

    }
    public Cat(String[] cats)
    {


    }
    public void goodPerson(boolean trait)
    {
//        if(trait==true) {
//            System.out.println("The person is taking care of the cat");
//        }
//        else
//        {
//            System.out.println("The person doesn't like cats,he's a dog owner");
//        }

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String []cats=new String[5];
        System.out.println("This person has 5 cats:");
        for(int i=0;i<cats.length;i++)
        {
            System.out.println("Enter a cat's "+i+" name:");
            cats[i]=sc.next();
        }
        for(int i=0;i<cats.length;i++)
        {
            System.out.print(cats[i]+" ");

        }

        Cat cat=new Cat(cats);
//        Person person=new Person(cat);
        cat.setSound("\nMeow");
        cat.setBreed("It's a british cat");
        cat.setGender('W');
        cat.setKg(8);
        System.out.println(cat.getSound()+" "+cat.getBreed()+" "+cat.getKg()+"kg "+cat.getGender());
        cat.eat(true);
        cat.play(false);
        cat.sleep(false);
        Person person=new Person(cat);
        person.getCats2();
//        person.setCats2(a);
//        person.setDogs();
        person.getDogs();

    }
}
