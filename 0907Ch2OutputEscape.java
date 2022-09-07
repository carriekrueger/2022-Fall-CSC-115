// Carrie Krueger
// 9-7-22
// Ch. 2 Notes - Output and Escape Sequences

public class Ch2OutputEscape {
   public static void main(String[] args) {
   
      escape(); //a method to explore escapes
      
    }
    
    //in this method we will look at escape sequences
    public static void escape() {
    
         // print vs. println
         System.out.print("Hello Class!");  // next thing prints on same line
         System.out.println("It is Wednesday."); // next thing prints on next line
         System.out.println("Halfway there!");
         System.out.println();  // prints blank line
         
         // OUTPUT
         System.out.println(2); // you can put text or numbers in a print statement
         System.out.println(1 + 2 * 3); // can even do math! (order of operations)
         
         // ESCAPE SEQUENCES
         // special characters denoted with \ (escape character)
         
         // \n -> new line 
         System.out.println("Hello\n\n\n");
         System.out.println("H\n\n\nello");
         System.out.println();
         
         // \t -> tab
         System.out.println("Hi\t\t\tHi!");
         System.out.println();
         
         // \\ -> \
         System.out.println("\\");
         
         // \" -> "
         System.out.println("She said \"Java is the best language ever!\"");
         
         // You try!
         
         // Think of quotation or saying that you know
         // Create a new class PrintQuote.java
         // Output your saying with visible quotation marks in the output
         // Don't forget to use a method to print your quote!
         
         Ex. output: "That's the way the cookie crumbles."
         
         
    }
    
 }
