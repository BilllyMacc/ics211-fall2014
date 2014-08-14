/**
 * Calculates and displays the factorial for an number entered on the commandline
 * 
 * @author William McDaniel Albritton
 */
public class FactorialProgram {
  /**
   * Program starts here
   * 
   * @param commandlineArguments The 1st commandline argument should be a non-negative number
   */
  public static void main(String[] commandlineArguments) {
    // check for correct number of commandlineArguments (at least 1)
    if (commandlineArguments.length == 0) {
      System.out.print("Error: You must enter at least 1 commandline argument ");
    }
    else {
      // initialize variables
      Integer number = new Integer(0);

      // error checking to see if it is an integer
      try {
        number = Integer.parseInt(commandlineArguments[0]);
      }
      catch (NumberFormatException exception) {
        System.out.print(exception);
        System.out.println(" is not an integer");
        System.exit(1); // end program
      }
      // call methods & display results
      Integer result = FactorialProgram.factorial(number);
      // error checking to see if it is non-negative
      if (result.equals(-1)) {
        System.out.println("ERROR: Negative integers are undefined for factorials!");
      }
      else {
        System.out.println(number + "! = " + result);
      }
    }
  }// end of main

  /**
   * Computes the factorial of a nonnegative number.
   * 
   * @param number is a nonnegative integer
   * @return the factorial of number, or -1 for negative integers (error)
   */
  public static Integer factorial(Integer number) {
    // check for negative integers
    if (number < 0) {
      return -1; // error condition
    }
    // by mathematical definition, 0! = 1
    if (number.equals(0)) {
      return 1;
    }
    // need to use integer variable to store product
    Integer product = new Integer(1);
    // loop from "n" to 1, count down by 1
    for (int i = number; i >= 1; i--) {
      // multiply "n" times to get factorial result
      product = product * i;
    }
    // return result of factorial
    return product;
  }

}// end of class
