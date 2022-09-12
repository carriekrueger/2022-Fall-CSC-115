// Carrie Krueger
// 9-12-22
// Notes about variables and Strings

public class Variables {
    public static void main(String[] args) {

        variables(); // a method to investigate variables
        aboutStrings(); // a method to investigate Strings
    }

    // in this method we will look at variables
    public static void variables() {

        /*
            A variable is a place to store a value.
            A variable holds data.
            A variable is a named location in the computer's memory.

            There are a few different kinds of information we can store:

            integer (whole number):   int 
            decimal (3.14, -6.02):    double
            boolean (true, false):    boolean
            character('a', '3', '?'): char 

            Other types: long, short, float, byte

            All PRIMITIVE DATA TYPES

        */

        // When you want to use a variable: declare
        // DECLARE a variable named 'age' that holds a whole number (integer)
        // variable names always start with a lowercase letter and 
        // follow camelCase
        // class names always start with an uppercase letter

        int age;

        // When you want to give your variable a value: assign with =
        // ASSIGN the variable 'age' a value of 40

        age = 40;

        // You can do both at once!
        // DECLARE a variable named 'gpa' that holds a decimal 
        // and ASSIGN it a value at the same time

        double gpa = 3.14;

        // DISPLAY the current value of your variables
        System.out.println("Your age is " + age + ".");
        System.out.println("Your gpa is " + gpa);

        // Reassign the value of 'gpa'

        gpa = 2.718;
        System.out.println("Your gpa is now " + gpa);

        // In general:
        // int      num       =  28
        // type
        //          name
        //                      value


        int num1 = 4;
        int num2 = 5;

        // you can do stuff with variable --> printing, math

        int sum = num1 + num2;
        System.out.println(sum);


        int x;            // x has been DECLARED but not yet ASSIGNED

       // System.out.println(x);  // error! (needs to be initialized)

       // You try!
       // 1. Create a new class Test.java
       // 2. Declare 2 int variables and assign them values
       // 3. Display the sum
       // 4. Display the product


    }

    // in this method we will look at Strings
    public static void aboutStrings() {

        // STRING
        // A String is a variable that can hold a bunch of characters
        // (like a word)
        // String is a class (note the uppercase) but we can use it like a primitive

        String firstName = "Carrie";  // note the camelCase
        System.out.println(firstName + " " + "Krueger"); // CONCATENATE

        // Mixing Strings and numbers is a tricky business...

        System.out.println("3 + 4");
        System.out.println(3 + 4);
        System.out.println(3 + 4 + " = 3 + 4");
        System.out.println("3 + 4 = " + 3 + 4); // concatenates numbers onto the String

        System.out.println("3 + 4 = " + (3 + 4)); // using () helps

        System.out.println(3 - 4);
        //System.out.println("3 - 4" + 3 - 4);//syntax error! can't handle -
        
        System.out.println("3 - 4 =" + (3 - 4));  // order of ops

        int difference = 3 - 4;
        System.out.println("3 - 4 =" + difference);
        



    }
}
