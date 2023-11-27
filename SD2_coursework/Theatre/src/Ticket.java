import java.util.ArrayList;
public class Ticket {
    private int row;
    private int seat;
    private double price;
    private Person persons;
    public Ticket(int row, int seat, double price, Person person){
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.persons = person;
    }
    public static void print(ArrayList ticketsInfo, double totPrice, Person newPerson){
        System.out.println("Ticket information : ");
        for (Object i: ticketsInfo){
            System.out.println(i);
        }
        System.out.println("\nTotal price : "+totPrice);
        System.out.println("\nInformation \n" + "Name : " + newPerson.getName());
        System.out.println("Surname : "+newPerson.getSurname());
        System.out.println("Email : "+newPerson.getEmail());
    }
}
