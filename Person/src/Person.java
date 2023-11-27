public class Person {
    private String myName;
    private int myAge;
    private String myGender;
    public Person(String name, int age, String gender){
        myName = name;
        myAge = age;
        myGender = gender;
    }
    public String toString(){
        return myName+", age: "+myAge+", gender: "+
                myGender;
    }
    public String getName(){
        return this.myName;
    }
    public int getAge(){
        return this.myAge;
    }
    public String getGender(){
        return this.myGender;
    }
    public void setMyAge(int age){
        myAge = age;
    }
    public void setMyName(String name){
        myName = name;
    }
    public void setMyGender(String gender){
        myGender = gender;
    }
}
