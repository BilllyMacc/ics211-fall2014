import java.lang.Math; //for the Math.pow() method

/**
 * Code for the Big-O examples (n is the 1st commandline argument)
 * 
 * @author William McDaniel Albritton
 */
public class BigOCode {
  /**
   * Program starts here
   * 
   * @param commandlineArguments The 1st commandline argument should be a non-negative number (n)
   */
  public static void main(String[] commandlineArguments) {
    // check for correct number of commandlineArguments (at least 1)
    if (commandlineArguments.length == 0) {
      System.out.print("Error: You must enter at least 1 commandline argument ");
    }
    else {
      // initialize variables
      Integer n = new Integer(0);

      // error checking to see if it is an integer
      try {
        n = Integer.parseInt(commandlineArguments[0]);
      }
      catch (NumberFormatException exception) {
        System.out.print(exception);
        System.out.println(" is not an integer!");
        System.exit(1); // end program
      }

      // O(1)
      int x = n;
      int y = x * 10 + 2 / x - 3 % x;
      if (x < y) {
        x++;
      }
      else {
        --y;
      }
      System.out.println(y);

      // O(log n)
      for (int i = 1; i < n; i = i * 2) {
        System.out.println(i);
      }

      // O(log n)
      for (int i = 1; i < n; i = i * 10) {
        System.out.println(i);
      }

      // O(log n)
      for (int i = n; i > 1; i = i / 7) {
        System.out.println(i);
      }
      for (int i = n; i > 1; i = i / 17) {
        System.out.println(i);
      }

      // O(log n)
      for (int i = 1; i < 32; i = i * 2) {
        System.out.println(i);
      }

      // O(n)
      for (int i = 1; i < n; i++) {
        System.out.println(i);
      }

      // O(n)
      for (int i = n; i > 0; i--) {
        System.out.println(i);
      }

      // O(n)
      for (int i = 0; i < n; i = i + 108) {
        System.out.println(i);
      }

      // O(1)
      for (int i = n; i <= n; i++) {
        System.out.println(i);
      }

      // O(n*log n)
      for (int i = 1; i < n; i++) {
        System.out.println(i);
        for (int j = 1; j < n; j = j * 2) {
          System.out.println(j);
        }// inner loop: O(log2n)
      }// outer loop: O(n)

      // O(n*log n)
      for (int i = 1; i < n; i = i * 2) {
        System.out.println(i);
        for (int j = 1; j < n; j++) {
          System.out.println(j);
        }// inner loop: O(n)
      }// outer loop: O(log2n)

      // O(n^2)
      for (int i = 1; i < n; i++) {
        System.out.println(i);
        for (int j = 1; j < n; j++) {
          System.out.println(j);
        }// inner loop: O(n)
      }// outer loop: O(n)

      // O(n^3)
      for (int i = 1; i < n; i++) {
        for (int j = 1; j < n; j++) {
          for (int k = 1; k < n; k++) {
            System.out.println(k);
          }// 2nd inner loop: O(n)
        }// inner loop: O(n)
      }// outer loop: O(n)

      // O(2^n)
      for (int i = 0; i < Math.pow(2, n); i++) {
        System.out.println(i);
      }

    }// end of else
  }// end of main
}// end of class

