package by.itstep.oop.casting.model;

public class PopcornMaker {
    public static void main(String[] args) throws InterruptedException {
        PopcornMachine popcornMachine =new PopcornMachine("Super machine 1000");
        popcornMachine.switchOff();
        popcornMachine.switchOn();
        popcornMachine.makePopcorn();
    }
}
