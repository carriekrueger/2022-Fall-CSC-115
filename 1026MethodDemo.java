// Carrie Krueger
// 10-26-22
// A menu of math to demonstrate methods:
// Ask the user for two numbers, perform the chosen operation
// and display the result.

// NOTE: Every method should have a comment description of what it does, 
// and additional comments throughout as needed. 
// Also include comments in the main method (major steps)

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
    
        // Main method runs the program (major steps --> methods)
        // Keep Scanner and user input in here to make it easier 
        
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for 2 numbers
        
        int num1;
        int num2;
        
        System.out.println("Enter number 1:");
        num1 = sc.nextInt();
        
        System.out.println("Enter number 2:");
        num2 = sc.nextInt();

    }
}
