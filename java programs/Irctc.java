import java.util.ArrayList;
import java.util.Scanner;

class user{
    int userid;
    int entered_id;
    String name;
    long phone_number;
    void login(){
        if(entered_id== userid){
            System.out.println("Welcome to The IRCTC Web portal");
        }
        else{
            System.out.println("The login credentials are Incorrect.please Try again");
        }
    }

    
    void signup(String name,long l,int userid){
        this.name=name;
        this.phone_number=l;
        this.userid=userid;
    }
}    

class Train {
    private String name;
    private String departureTime;
    private String sourceStation;
    private String destinationStation;
    private int passengerStrength;
    private int trainNumber;

    public Train(String name, String departureTime, String sourceStation, String destinationStation,
                 int passengerStrength, int trainNumber) {
        this.name = name;
        this.departureTime = departureTime;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.passengerStrength = passengerStrength;
        this.trainNumber = trainNumber;
    }
}

public class Irctc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        user us = new user();
        System.out.println("Welcome to IRCTC railway booking app");
        System.out.println();
        System.out.println("Login / signup");
        System.out.println();
        System.out.println("Enter your choice : ");
        int choice1 = sc.nextInt();

        switch(choice1){
            case 1:
                us.login();
                break;
            case 2:
                us.signup("Varun",6381876633L, 10032);
                break;
        }
        System.out.println("Display Available Trains");
        System.out.println("Check seat availability");
        System.out.println("Book a Ticket");
        System.out.println("Cancel a Ticket");
        System.out.println("Display Ticket Details");
        System.out.println("Exit");
        System.out.println("Enter your choice : ");
        int choice2 = sc.nextInt();

        switch(choice2){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:

            default:
                System.out.println("Sorry! Invalid choice");

        }
    }
}



















