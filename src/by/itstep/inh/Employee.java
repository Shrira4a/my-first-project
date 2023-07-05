package by.itstep.inh;

public class Employee extends Persoon
{
    private long salary;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(int i, String nicole, String shkredder, char w, int i1)
    {
        //FIRST OF ALL THE CONSTRUCTOR OF THE PARENT CLASS FOR INITIALIZING FIELDS
        //ЯВНЫЙ ВЫЗОВ КОНСТРУКТОРА РОД КЛАССА. ЕСЛИ ЭТО НЕ НАПИСАТЬ, ВЫЗОВ БУДЕТ НЕ ЯВНЫЙ
        super();
    }

    public Employee(int id,String name,String lastName)
    {
        //CALLING PARAMETRIZED CONSTRUCTOR. SUPER SHOULD EXIST IN THE PARENT CLASS WITH THE SAME PARAMETERS
        super(id,name,lastName,' ');
    }

    public Employee(int id,String name,String lastName,char gender)
    {
       //
        super(id,name,lastName,gender);
        this.salary=salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", gender=" + getGender() +
                ", salary=" + getSalary() +
                '}';
    }
}
