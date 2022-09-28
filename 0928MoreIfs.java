// Carrie Krueger
// 9-28-22
// Efficiently using if/else statements and multiple conditionals and boolean logic

import java.util.Scanner;

public class MoreIfs {
    public static void main(String[] args) {

       betterIfs(); // efficiently using if/else statements
       multipleIfs(); // looking at multiple conditionals and boolean logic
    }

    // This method shows the preferred way to handle code that is being reused
    public static void betterIfs() {

        // When you have code that ends up being reused in your program:

        // preferred way:
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();

        if(age >= 65)  {
            System.out.println("Age is just a number!");        
        }

        System.out.println(age + " is a good age.");

       
        // less preferred way
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();

        if(age >= 65)  {
            System.out.println("Age is just a number!");
            System.out.println(age + " is a good age.");
        }

        if(age < 65) {
            System.out.println(age + " is a good age.");
        }
        */

    }

    // this method looks at multiple conditionals and boolean logic
    public static void multipleIfs() {

         // let's compare num to 10 in a better way than we did before
         // multiple ways to handle multiple conditionals
         
         // only one outcome possible
         // NESTED
         // note the indentation: every { --> next line is indented with a tab
         
         int num = 2;

         if(num > 10) {
             System.out.println("num is greater!");
         } else {
             if(num < 10) {
                System.out.println("num is less!"); 
             } else {
                 System.out.println("num is equal!");
             }
         }

         // only one outcome possible
         // neater nesting (else if)

         if(num > 10) {
            System.out.println("num is greater!");
         } else if(num < 10) {
            System.out.println("num is less!");
         } else {
            System.out.println("num is equal!");
         }

         // more than one outcome possible
         // not nested (stacking)

         num = 50;

         if(num > 10) {
            System.out.println("num is greater!");
         }

         if(num > 100) {
            System.out.println("Really big number!");
         }

         num = 42;

         // boolean logic operator AND --> short-circuit

         if(num >= 40 && num <= 60) {
            System.out.println("num is in range!");
         }

         // boolean logic operator OR --> short-circuit
         if(num >= 40 || num <= 10) {
            System.out.println("You win!");
         }


         // Another option: Switch Statements
         // Textbook 6.3

         // Pros and Cons:
         // if/else statements can handle ranges
         // switch statements can only handle exact values
         // switch statements can only be used with certain primitives and Strings
         // if/else can get messy with { }, more prone to errors
         // (both syntax or logic)





    }
}
