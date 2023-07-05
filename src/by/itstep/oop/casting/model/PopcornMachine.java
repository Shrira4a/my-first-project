package by.itstep.oop.casting.model;

import java.util.Scanner;

public class PopcornMachine
{
    private static int salesCounter=0;

    private final double maxOilTank=100;
    private final double maxSyrupTank=80;
    private final double maxBattery=100;
    private final double maxGarbageTank=500;
    private int maxOilTemp=90;

    private String model;
    private int numberOfBuckets;

    private double oilTank;
    private double battery;
    private double syrupTank;
    private double garbageTank;

    private int currentOilTemp;
    private boolean isOn=false;
    private boolean isActive=false;

    PopcornMachine(String model)
    {
        salesCounter++;
        this.model=model;
    }
    public void switchOn() throws InterruptedException {
        if(!isOn) {
            System.out.println("Popcorn machine " + model + " is starting...");
            Thread.sleep(1000);
            isOn=true;
            System.out.println("Popcorn machine " + model + " is started!");
        }else
        {
            System.out.println(".....has already started");
        }
    }
    public void switchOff() throws InterruptedException {
        if(isOn) {
            System.out.println("Popcorn machine " + model + " is stopping...");
            Thread.sleep(1000);
            System.out.println("Popcorn machine " + model + " is stopped!");
        }
        else
        {
            System.out.println(".....has already stopped");
        }
    }
    public void addOil(double extraOil) throws InterruptedException {
        extraOil=10;
        if(extraOil+oilTank>=maxOilTank)
        {
            System.out.println("The limit of oil has been reached");
        }
        else if(oilTank<50)
        {
            for(int i=0;i<100;i++) {
                System.out.println("Popcorn machine needs oil, adding some!");
                oilTank += extraOil;
                Thread.sleep(5);
            }
            System.out.println("The oil is full!");
        }
    }
    public void addBattery(double extraBattery) throws InterruptedException {
        extraBattery=5;
        if(extraBattery>=maxBattery)
        {
            System.out.println("The limit of energy has been reached");
        }
        else if(battery<10)
        {
            for(int i=0;i<100;i++) {
                System.out.println("Popcorn machine needs energy: "+battery+", adding some!");
                oilTank += extraBattery;
                Thread.sleep(5);
            }
            System.out.println("The battery is full!");

        }

    }
    public void addSyrupTank(double extraSyrup) throws InterruptedException {
        extraSyrup=20;
        if(extraSyrup+syrupTank>=maxSyrupTank)
        {
            System.out.println("The limit of syrup has been reached");
        }
        else if(syrupTank<10)
        {
            for(int i=0;i<100;i++) {
                System.out.println("Popcorn machine needs syrup, adding some!");
                oilTank += extraSyrup;
                Thread.sleep(5);
            }
        }
    }
    public void clear(int numberOfBuckets)
    {
           garbageTank=numberOfBuckets*3;
           if(garbageTank>=120) {
               System.out.println("Clear the garbage!");
           }
       else
       {
           System.out.println("...continues to work");
       }
    }
    public void temp(int cels) throws InterruptedException {
        int extrat=5;
        if(maxOilTemp<=currentOilTemp)
        {
            System.out.println("The machine is too hot to work with!");
            currentOilTemp-=extrat;
            Thread.sleep(5);
        }
      else
        {
            System.out.println("The machine is safe to work with!");
        }
    }
    public void popularity()
    {
        System.out.println("Hey kid! Choose the flavor:\n1-salt\n2-caramel\n3-lime\n4-chocolate\n5-spicy");
        Scanner sc=new Scanner(System.in);
        int flag=sc.nextInt();
        for (int i=0;i<5;i++)
        {
            switch (flag)
            {
                case 1:
                    System.out.println("You've chosen the salty one!");
                    break;
                case 2:
                    System.out.println("You've chosen the caramel one!");
                    break;
                case 3:
                    System.out.println("You've chosen the lime one!");
                    break;
                case 4:
                    System.out.println("You've chosen the chocolate one!");
                    break;
                case 5:
                    System.out.println("You've chosen the spicy one!");
                    break;
            }
        }
    }
    public void makePopcorn() throws InterruptedException {

            addOil(200);
            addBattery(5);
            addSyrupTank(40);
            clear(60);
            temp(100);

    }

}
