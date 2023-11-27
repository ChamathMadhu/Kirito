public class Teacher extends Person{
    private double salary;
    private String subject;

    public Teacher(String name, int age, String gender, String subject, double salary){
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;

    }
    public double getSalary(){
        return this.salary;
    }
    public String getSubject(){
        return this.subject;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
}
