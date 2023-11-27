public class Student extends Person{
    private int IDNumber;
    private double fee;
    private int grade;
    public Student(String name, int age, String gender, int IDNumber){
        super(name, age, gender);
        this.IDNumber = IDNumber;
    }
    public void setIDNumber(int idNumber){
        this.IDNumber = idNumber;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int getIDNumber(){
        return this.IDNumber;
    }
    public double getFee(){
        return this.fee;
    }
    public int getGrade(){
        return this.grade;
    }
    public String toString(){
        return super.toString()+ " Student ID: "+ this.IDNumber+
                " Student grade: "+this.grade+
                " Student fee: "+this.fee;
    }
}
