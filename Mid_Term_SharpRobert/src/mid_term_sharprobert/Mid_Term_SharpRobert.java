package mid_term_sharprobert;
import java.util.Scanner;
/**
 * Robert Sharp
 * February 24th 2023
 * Programming 1
 * Professor Mitchell Frogge
 */
public class Mid_Term_SharpRobert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //bringing scanner in
        System.out.print("Enter the customer's name: "); //getting name
        String billName = sc.nextLine(); //creating sting to save name
        System.out.print("Enter a plan: "); // getting plan number
        String userChoice = sc.nextLine(); //saving choice as string
        int planNum = Integer.parseInt(userChoice); //changing string to int
        System.out.print("Enter the number minutes used: "); //getting number of minutes
        String userTime = sc.nextLine(); //getting user time as a string
        int userMin = Integer.parseInt(userTime); //Making sting into an int
        System.out.print(""); //Creating space
        switch (planNum) { //using switch to find the method to use
            case 1: //setting for plan 1
                //planOne; //moving to method
                break; //breaking out of switch
            case 2: //setting for plan 2
                //planTwo; //moving to method
                break; //breaking out of switch
            case 3: //setting for case 3
                //planThree; //moving to method
                break; //breaking out of switch
            default: // setting error
                System.out.println("Must Enter a valid plan!");// printing error
                break;
        }
        System.out.println("Bill Name: " + billName); //printing customer's name
        System.out.print("Plan: " + planNum); //printing plan information
        System.out.println("Plan Base Charge: ");
        
        
        
        
        
        
    }
    
}
