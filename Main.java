import java.util.Scanner;

/* Multiplies and outputs the result of 2 integer inputs */
public class Main {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); // Initializing varibale named scan
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      
      int result = num1 * num2; // Multiplying our inputs and storing new variable
      
      System.out.println(num1 + " x " + num2 + " = " + result); // Prints and outputs problem and the result
   }
}

/* Vocab:
Preconditon - what needs to be true ahead of our code working
Postcondition - what needs to be true after our code has worked */