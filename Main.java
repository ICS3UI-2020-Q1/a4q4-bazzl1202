import java.util.Scanner;
/**
 *
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user to input integer
    System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
    int integer = input.nextInt();

    // declare and initialize counting variable
    int count = 1;
 
    while(count <= integer){
      count = count + 1;
      // determines if should say FizzBuzz
      if( count%3 == 0 && count%5 == 0){
        System.out.println("FizzBuzz");
        // determines if divisble by 5
      } else if( count%5 == 0){
        System.out.println("Buzz");
        // determines if divisble by 3
      } else if( count%3 == 0){
        System.out.println("Fizz");
      } else{
        //says integer because not divisble by 3 or 5
        System.out.println(count);
      }
    }
    
  }
}
