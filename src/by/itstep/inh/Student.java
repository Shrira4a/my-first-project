package by.itstep.inh;

public class Student extends Persoon
{
    Student(int id,String name,String lastName,long avg,char gender)
    {
        super(id,name,lastName,avg,gender);
        System.out.println("Person + 1");
    }
    Student(int id,String name,String lastName)
    {
        setName(name);
        setId(id);
        setLastname(lastName);
    }
    Student(long avg)
    {
        this.avg=avg;
    }
    public double getAvg()
    {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    private double avg;


}
