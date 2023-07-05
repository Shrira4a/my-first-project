package by.itstep.inh;

public class Persoon
{
    private int id;
    private String name;
    private String lastname;
    private char gender;

    //CONSTRUCTOR - IS THE ONLY METHOD TO CREATE AN OBJECT
    //CONSTRUCTOR NEVER RETURNS ANYTHING
    public Persoon()
    {
//CALLING EXISTING CONSTRUCTOR IN THIS CLASS. CALLING CONSTRUCTOR SHOULD BE IN THE FIRST LINE
        this(0,"Stranger");
    }

    //CONSTRUCTOR THAT INITIALIZES FIELDS
    public Persoon(int id,String name,String lastName,char gender)
    {
        System.out.println("Person + 1");
        this.id=id;
        this.name=name;
        this.lastname=lastName;
        this.gender=gender;

    }


    public Persoon(int id,String name)
    {
        this(id,name,null,'!');
    }

    public Persoon(int id, String name, String lastName, long avg, char gender) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                '}';
    }
}
    class Test
{
    public static void main(String[] args) {
        Persoon p=new Persoon();
        p.setId(29);
        p.setGender('w');
        p.setName("sabinina");
        p.setLastname("mama");
        System.out.println(p);
        Persoon p1=new Persoon();

        Employee e=new Employee(32572, "Nicole", "Shkredder", 'w', 12);
        e.setId(342);
        e.setSalary(1000000);
        e.setLastname("Jiji");
        e.setName("kiki");
        e.setGender('f');
        System.out.println(e);

        Persoon p2=new Persoon(55,"Mickey","Mouse",'m');
        System.out.println(p2);

        Persoon p3=new Persoon();
        System.out.println(p3);

        Persoon p4=new Persoon(333,"Angel");
        Employee e1=new Employee(32572, "Nicole", "Shkredder", 'w', 12);
        System.out.println(e1);

        Employee e3=new Employee(32572,"Nicole","Shkredder",'w',12);
        System.out.println(e3);

        Student st=new Student(232,"Nicki","Minaj",263286,'w');
        System.out.println(st);

        Student st1=new Student(122,"Justin","Bieber");
        System.out.println(st1);
        Student st2=new Student(111);
        System.out.println(st2);

    }
}
