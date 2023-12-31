import java.io.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Theatre {
    static int[] row1 = new int[12];
    static int[] row2 = new int[16];
    static int[] row3 = new int[20];
    static ArrayList<String> tickets = new ArrayList<>(); //Arraylist for ticket information.
    static double totPrice = 0;  //Total price = 0 since no ticket is bought yet.
    static int totSeats = 48; //since the maximum amount of seats is 48. Cannot take more tickets than 48.
    public static Person newPerson = new Person();
    public static void main(String[] args) {
        System.out.println("Welcome to the New Theatre");
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter your name : ");
        String name = input.next();

        System.out.print("PLease enter your surname : ");
        String surname = input.next();

        System.out.print("Please enter your email : ");
        String email = input.next();

        newPerson.setName(name);
        newPerson.setSurname(surname);
        newPerson.setEmail(email);

        System.out.println("------------------------------------\n");
        System.out.println("Please select an option\n");
        System.out.println("1) Buy a ticket\n");
        System.out.println("2) Print seating area\n");
        System.out.println("3) Cancel ticket\n");
        System.out.println("4) List available seats\n");
        System.out.println("5) Save to file\n");
        System.out.println("6) Load from file\n");
        System.out.println("7) Print ticket information and total price\n");
        System.out.println("8) Sort tickets by price\n");
        System.out.println("      0) Quit\n");

        int option = -1;
        while (option != 0) {
            System.out.println("\n------------------------------------------");
            System.out.print("\nPlease enter option : ");
            option = input.nextInt();
            System.out.println("\n----------------------------------------");

            switch (option) {
                case 1 -> buy_ticket();
                case 2 -> print_seating_area();
                case 3 -> cancel_ticket();
                case 4 -> show_available();
                case 5 -> save();
                case 6 -> load();
                case 7 -> show_tickets_info();
                case 8 -> sort_tickets();
                case 0 -> System.out.println("Thank you for your visit.");
                default -> System.out.println("Please enter a valid response");
            }
        }
    }

    private static void buy_ticket() {
        if (totSeats>0 && totSeats<49 ){
            System.out.print("Please enter the row number : ");
            Scanner input = new Scanner(System.in);
            int rowNumber = input.nextInt();
            System.out.print("Please enter seat number : ");
            int seatNumber = input.nextInt();

            switch (rowNumber) {
                case 1:
                    if(row1[seatNumber-1] == 0) {
                        row1[seatNumber-1] = 1;
                        System.out.println("Booking confirmed");
                        tickets.add("Ticket 1-" + seatNumber +" costs $20.0");
                        totPrice = totPrice + 20.0;
                        totSeats--;
                        break;
                    } else {
                        System.out.println("This seat is already booked");
                        break;
                    }

                case 2:
                    if (row2[seatNumber-1] == 0) {
                        row2[seatNumber-1] = 1;
                        System.out.println("Booking confirmed");
                        tickets.add("Ticket 2-" + seatNumber+" costs $10.0");
                        totPrice = totPrice + 10.0;
                        totSeats--;
                        break;
                    } else {
                        System.out.println("This seat is already booked");
                        break;
                    }

                case 3:
                    if (row3[seatNumber-1] == 0) {
                        row3[seatNumber-1] = 1;
                        System.out.println("Booking confirmed");
                        tickets.add("Ticket 3-" + seatNumber+" costs $5.0");
                        totPrice = totPrice + 5.0;
                        totSeats--;
                        break;
                    } else {
                        System.out.println("This seat is already booked");
                        break;
                    }

                default:
                    System.out.println("Error. This row number doesnt exist.");
                    System.out.println("Please select rows 1-3.");
            }
        } else {
            System.out.println("Sorry all the seats are booked.");
        }
    }

    public static void print_seating_area() {
        System.out.println("     ***********");
        System.out.println("     *  STAGE  *");
        System.out.println("     ***********");
        System.out.print("    ");
        for (int i = 0; i < row1.length; i++) {
            if (row1[i] == 1) {
                System.out.print("X");
            } else {
                System.out.print("O");
            }
            if (i == 5) {
                System.out.print(" ");
            }
        }
        System.out.println("\n");
        System.out.print("  ");
        for (int i = 0; i < row2.length; i++) {
            if (row2[i] == 1) {
                System.out.print("X");
            } else {
                System.out.print("O");
            }
            if (i == 7) {
                System.out.print(" ");
            }
        }
        System.out.println("\n");
        for (int i = 0; i < row3.length; i++) {
            if (row3[i] == 1) {
                System.out.print("X");
            } else {
                System.out.print("O");
            }
            if (i == 9) {
                System.out.print(" ");
            }
        }
    }

    public static void cancel_ticket() {
        System.out.print("PLease enter row number : ");
        Scanner input = new Scanner(System.in);
        int rowNumber = input.nextInt();
        System.out.print("Please enter seat number : ");
        int seatNumber = input.nextInt();

        switch (rowNumber) {
            case 1:
                if (row1[seatNumber-1] == 1) {
                    System.out.println("Ticket canceled");
                    tickets.remove("Ticket 1-" + seatNumber);
                    totPrice = totPrice - 20.0;
                    totSeats++;
                    row1[seatNumber-1] = 0;
                } else {
                    System.out.println("Error. This seat is already available");
                }
                break;

            case 2:
                if (row2[seatNumber-1] == 1) {
                    System.out.println("Ticket canceled");
                    tickets.remove("Ticket 2-" + seatNumber);
                    totPrice = totPrice - 10.0;
                    totSeats++;
                    row2[seatNumber-1] = 0;
                } else {
                    System.out.println("Error. This seat is already available");
                }
                break;

            case 3:
                if (row3[seatNumber-1] == 1) {
                    System.out.println("Ticket canceled");
                    tickets.remove("Ticket 3-" + seatNumber);
                    totPrice = totPrice - 5.0;
                    totSeats++;
                    row3[seatNumber-1] = 0;
                } else {
                    System.out.println("Error. This seat is already available");
                }
                break;
        }
    }

    public static void show_available() {
        System.out.print("\nSeats available in row 1: ");
        for (int i = 0; i < row1.length; i++) {
            if (row1[i] == 0) {
                System.out.print(" " + (i + 1) + ",");
            }
        }

        System.out.print("\nSeats available in row 2: ");
        for (int i = 0; i < row2.length; i++) {
            if (row2[i] == 0) {
                System.out.print(" " + (i + 1) + ",");
            }
        }

        System.out.print("\nSeats available in row 3: ");
        for (int i = 0; i < row3.length; i++) {
            if (row3[i] == 0) {
                System.out.print(" " + (i + 1) + ",");
            }
        }
    }

    public static void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("rowInformation.txt")); //Got the idea from w3schools
            writer.write("Here 0 means available seats and 1 means the seats which are booked : ");
            writer.write("\nrow 1 : " + Arrays.toString(row1));
            writer.write("\nrow 2 : " + Arrays.toString(row2));
            writer.write("\nrow 3 : " + Arrays.toString(row3));
            writer.close();
            System.out.println("\nFile saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void load() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("rowInformation.txt"));
            String line; // To read every line and print it accordingly.
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void show_tickets_info() {
        System.out.println("\nFor example : \"Ticket 1-2\" means a ticket from row 1 seat 2.");
        Ticket.print(tickets,totPrice,newPerson);
    }
    public static void sort_tickets(){
        Collections.sort(tickets, Collections.reverseOrder()); //Got the idea from w3schools.
        Ticket.print(tickets,totPrice,newPerson);
        //Sorted using string methods since every input in "ticket" arraylist is same except the row and seat number.
    }
}