// Garrick Morley
// ISYS 216 001, Fall 2019
// Dr. Kinuthia
// Assignment Two Source

package morleygassignmenttwo;

import java.util.Scanner;

public class MorleyGAssignmentTwo {

    public static void main(String[] args) {
    
        
    int UserInput;
    
    Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number in the range of 1-10: ");
            UserInput = keyboard.nextInt();
            
    switch (UserInput) {
        case 1:
            System.out.println("I");
            break;
        case 2:
            System.out.println("II");
            break;
        case 3:
            System.out.println("III");
            break;
        case 4:
            System.out.println("IV");
            break;
        case 5:
            System.out.println("V");
            break;
        case 6:
            System.out.println("VI");
            break;
        case 7:
            System.out.println("VII");
            break;
        case 8:
            System.out.println("VIII");
            break;
        case 9:
            System.out.println("IX");
            break;
        case 10:
            System.out.println("X");
            break;
        default:
            System.out.println("You did not enter a number between 1 and 10.");
            break;
    }
    } 
}