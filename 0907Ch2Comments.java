// Carrie Krueger
// 9-7-22
// Chapter 2 Notes: Comments

public class Comments {
   public static void main(String[] args) {
      comments(); // in this method we will look at comments
   }
   
   // a method to investigate comments
   public static void comments() {
      // anything you write in a comment is NOT read by the compiler
      
      // We use comments for: 
      // -Adding your name to the program
      // -Adding a brief desciption of the program 
      // As you go along, to explain to others (and yourself) what your code should do
      
      // Also - DEBUGGING
      // if there's code that doesn't work quite yet
      // if there's a bunch of lines that don't work and you want to isolate them 
      
      // GIVE CREDIT
      // if you use someone else's code, use comments to credit the course
      // ex. shamelessly stolen from github.com/awesomecoder
      
      // HOW DO WE MAKE COMMENTS?
      
      // Line comments: anything after the // is ignored by the compiler
      // Block comments:  /*  */ (slash star star slash) (comment sandwich)
      // Java Doc comments: /** */  will automatically generate code documentation
      
      // EXAMPLES:
      
      /* 
         When you have multiple lines that you want to comment
         You can use a block comment because
         you can add as many lines as you want. 
         Good for program name/description at top of program
      */
      
      // DEBUGGING 
      
      System.out.println("Hello World!");
      System.out.println("Hello World!");
      //System.out.println("Hello World!");
      System.out.println("Hello World!");
      //System.out.println("Hello World!");
      System.out.println("Hello World!");
      
      /*
      System.out.println("Hello World!");
      System.out.println("Hello World!");
      System.out.println("Hello World!");
      System.out.println("Hello World!");
      System.out.println("Hello World!");
      System.out.println("Hello World!");
      */


      
   }
   
 }
