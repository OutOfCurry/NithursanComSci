//Ask the user for a number between 1 and 10.  If the value is larger than or equal to 5, then output the words �You won!�.
import java.util.*;
class Numbers {
  public static void main(String [] args) {
    while(true) {
      Scanner reader = new Scanner(System.in);
      System.out.println("Type a number between 1 and 10.");
      int number = reader.nextInt();
      int secretnumber = 5;
   
      if (number < secretnumber ) 
      {
      
        System.out.println("Invalid Number");
        
      }
      
      if (number >= secretnumber)
        
      {
        System.out.println("You won!");
      
      }
    }
  }
}