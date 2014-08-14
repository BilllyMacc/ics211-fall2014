import java.lang.Math; //for the Math.pow() method

/**
 * More Big-O examples (n is the 1st commandline argument) Input these numbers: 10, 100, 1000,
 * 10000, etc. You will notice that it takes longer & longer for the program to run. And the loops
 * with a large Big-O will quickly increase their running time, as compared to those loops with a
 * small Big-O.
 * 
 * @author William McDaniel Albritton
 */
public class MoreBigO {
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
      Long n = new Long(0);
      Long count = new Long(0);
      Long startTimeInMilliseconds = new Long(0);
      Long totalTimeInMilliseconds = new Long(0);

      // error checking to see if it is a long integer
      try {
        n = Long.parseLong(commandlineArguments[0]);
      }
      catch (NumberFormatException exception) {
        System.out.print(exception);
        System.out.println(" is not a long integer!");
        System.exit(1); // end program
      }

      // example 1: O(1)
      startTimeInMilliseconds = System.currentTimeMillis();
      for (long i = 0; i < 10; i++) {
        count++;
      }
      totalTimeInMilliseconds = System.currentTimeMillis() - startTimeInMilliseconds;
      System.out.println("example 1: O(1)");
      System.out.println("count = " + count);
      System.out.println("time = " + totalTimeInMilliseconds + " milliseconds" + "\n");

      // example 2: O(log n)
      count = new Long(0);
      startTimeInMilliseconds = System.currentTimeMillis();
      for (long i = 1; i < n; i = i * 2) {
        count++;
      }
      totalTimeInMilliseconds = System.currentTimeMillis() - startTimeInMilliseconds;
      System.out.println("example 2: O(log n)");
      System.out.println("count = " + count);
      System.out.println("time = " + totalTimeInMilliseconds + " milliseconds" + "\n");

      // example 3: O(log n)
      count = new Long(0);
      startTimeInMilliseconds = System.currentTimeMillis();
      for (long i = 0; i < 10; i++) {
        count++;
      }
      for (long i = 1; i < n; i = i * 2) {
        count++;
      }
      totalTimeInMilliseconds = System.currentTimeMillis() - startTimeInMilliseconds;
      System.out.println("example 3: O(log n)");
      System.out.println("count = " + count);
      System.out.println("time = " + totalTimeInMilliseconds + " milliseconds" + "\n");

      // example 4: O(log n)
      count = new Long(0);
      startTimeInMilliseconds = System.currentTimeMillis();
      for (long i = 0; i < 10; i++) {
        for (long j = 1; j < n; j = j * 2) {
          count++;
        }
      }
      totalTimeInMilliseconds = System.currentTimeMillis() - startTimeInMilliseconds;
      System.out.println("example 4: O(log n)");
      System.out.println("count = " + count);
      System.out.println("time = " + totalTimeInMilliseconds + " milliseconds" + "\n");

      // example 5: O(n)
      count = new Long(0);
      startTimeInMilliseconds = System.currentTimeMillis();
      for (long i = 0; i < n; i++) {
        count++;
      }
      totalTimeInMilliseconds = System.currentTimeMillis() - startTimeInMilliseconds;
      System.out.println("example 5: O(n)");
      System.out.println("count = " + count);
      System.out.println("time = " + totalTimeInMilliseconds + " milliseconds" + "\n");

      // example 6: O(n)
      count = new Long(0);
      startTimeInMilliseconds = System.currentTimeMillis();
      for (long i = 0; i < 10; i++) {
        count++;
      }
      for (long i = 1; i < n; i = i * 2) {
        count++;
      }
      for (long i = 0; i < n; i++) {
        count++;
      }
      totalTimeInMilliseconds = System.currentTimeMillis() - startTimeInMilliseconds;
      System.out.println("example 6: O(n)");
      System.out.println("count = " + count);
      System.out.println("time = " + totalTimeInMilliseconds + " milliseconds" + "\n");

      // example 7: O(n * log n)
      count = new Long(0);
      startTimeInMilliseconds = System.currentTimeMillis();
      for (long i = 0; i < 10; i++) {
        for (long j = 1; j < n; j = j * 2) {
          for (long k = 0; k < n; k++) {
            count++;
          }
        }
      }
      totalTimeInMilliseconds = System.currentTimeMillis() - startTimeInMilliseconds;
      System.out.println("example 7: O(n * log n)");
      System.out.println("count = " + count);
      System.out.println("time = " + totalTimeInMilliseconds + " milliseconds" + "\n");

      // example 8: O(n^2)
      count = new Long(0);
      startTimeInMilliseconds = System.currentTimeMillis();
      for (long i = 0; i < n; i++) {
        for (long j = 1; j < n; j++) {
          count++;

        }
      }
      totalTimeInMilliseconds = System.currentTimeMillis() - startTimeInMilliseconds;
      System.out.println("example 8: O(n^2)");
      System.out.println("count = " + count);
      System.out.println("time = " + totalTimeInMilliseconds + " milliseconds" + "\n");

      // example 9: O(n^3)
      count = new Long(0);
      startTimeInMilliseconds = System.currentTimeMillis();
      for (long i = 0; i < n; i++) {
        for (long j = 1; j < n; j++) {
          for (long k = 1; k < n; k++) {
            count++;
          }
        }
      }
      totalTimeInMilliseconds = System.currentTimeMillis() - startTimeInMilliseconds;
      System.out.println("example 9: O(n^3)");
      System.out.println("count = " + count);
      System.out.println("time = " + totalTimeInMilliseconds + " milliseconds" + "\n");

      // example 10: O(2^n)
      count = new Long(0);
      startTimeInMilliseconds = System.currentTimeMillis();
      for (long i = 0; i < Math.pow(2, n); i++) {
        count++;
      }
      totalTimeInMilliseconds = System.currentTimeMillis() - startTimeInMilliseconds;
      System.out.println("example 10: O(2^n)");
      System.out.println("count = " + count);
      System.out.println("time = " + totalTimeInMilliseconds + " milliseconds" + "\n");

    }// end of else

  }// end of main

}// end of class

