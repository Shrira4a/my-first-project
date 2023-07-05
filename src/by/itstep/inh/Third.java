package by.itstep.inh;

public class Third extends Child
{

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void run()
    {
        System.out.println("Умеет бегать "+ getName());
    }

    public static void main(String[] args) {

    }
}
