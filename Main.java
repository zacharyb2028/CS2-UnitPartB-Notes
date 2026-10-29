import java.util.Scanner;

/* Multiplies and outputs the result of 2 integer inputs */
public class Main {

   public static void main(String []args) {
      
      // practicing using static methods from the Math class 
      /* ABSOLUTE VALUE 
         int Math.abs(int x) 
         double Math.abs(double x)
      */ 


     int z = Math.abs(-45);
     System.out.println(z);

     double y = (int) Math.abs(-75.5);
     System.out.println(y);

     /* POWER METHOD 
     double Math.pow(double base, double power)
     */

     int base = 3;
     int power = 4; 
     double result = Math.pow(base, power);
     System.out.println(result);

     // we can nest these functions together
     double combined = Math.pow(5, Math.abs(-3));

     /* SQUARE ROOT
     double Math.sqrt(double x)
     */

     // positive number 
     double pos = Math.sqrt(5);
     System.out.println(pos);

     // what if we gave a negative number?
     double neg = Math.sqrt(-16);
     System.out.println(neg);
     // NaN means "not a number"

     /* RANDOM METHOD
     double Math.random() 
     gives us a random number between 0.0 and 1.0 NOT INCLUSIVE 
     */

     double rand = Math.random();
     System.out.println(rand);

     /* (int)(Math.random()*range) + min 
            moves the random number into a range starting from a minimum number.
            
            The range of possible values is: 
            (max - min + 1). */
         double other_rand = (int) (Math.random() * 9) + 1;
         System.out.println(other_rand);
      

      // testing out our pizza object 
      // initialize an object from our class 
      Pizza firstPizza = new Pizza();
      System.out.println(firstPizza.isBaked);
   }
}

/ build our class skeleton 
public class Pizza {
    //all of the code for our class "blueprint" goes here! 

    //part 1 of class - attributes 
    boolean hasPep;
    boolean hasChicken; 
    boolean hasPineapple; 
    boolean isBaked; 
    boolean isSold;
    boolean isPurchased;

    double price; 
    int servingSize;
    String pizzaSize;
    String style;


    //part 2 of class - methods 
    // we ALWAYS need a constructor 
    public Pizza() {
        hasPep = true; 
        hasChicken = true; 
        hasPineapple = true; 
        isBaked = false;



        pizzaSize = "large";
        servingSize = 1; 
        style = "New York";
        price = 23.49;
    }

    public Pizza(String size) {
        pizzaSize = size;
    }

    // we can also add methods that are behaviors! 
    public void bakePizza() {
        isBaked = true; 
        System.out.println("Your pizza is hot and ready!");
    }

    public void sellPizza() {
        isSold = true;
    }

    public void purchasePizza() {
        isPurchased = true;
    }
}
/* Vocab:
Preconditon - what needs to be true ahead of our code working
Postcondition - what needs to be true after our code has worked */
// Class xyz = new CLass();