---
title: "Fibonacci.java"
published: true
morea_id: reading-materials07-Fibonacci
morea_summary: "Calculates and displays the Fibbonaci value for an number entered on the command line. Both Iterative and Recursive methods are used."
morea_type: reading
morea_sort_order: 3
morea_labels:
---

# Fibonacci.java

File:

[Fibonacci.java](../examples/Fibonacci.java)

Source: 

{% highlight java %}
/**
 * Calculates and displays the Fibbonaci value for an number entered on the command line. Both
 * Iterative and Recursive methods are used.
 * 
 * @author William McDaniel Albritton
 */
public class Fibonacci {

  /**
   * Program starts here
   * 
   * @param arguments 1st argument is N for the Nth Fibonacci number
   */
  public static void main(String[] arguments) {
    // check for correct number of arguments (at least 1)
    if (arguments.length < 1) {
      System.out.print("Error: You must enter at least 1 argument ");
      System.out.println("(" + arguments.length + " entered)");
    }
    else {
      // initialize variables
      int n = 0;
      try {
        n = Integer.parseInt(arguments[0]);
      }
      catch (NumberFormatException exception) {
        System.out.print(exception);
        System.out.println(" is not an integer!");
        System.exit(1); // end program
      }
      // call iterative methods & display results
      int result = 0;
      result = Fibonacci.iterative(n);
      // error checking to see if it is non-negative
      if (result < 0) {
        System.out.println("ERROR: non-negative integers are undefined!");
        System.exit(1); // end program
      }
      System.out.println("iterative result = " + result);
      System.out.println("number of loops  = " + loops + "\n");
      // call recursive methods & display results
      result = Fibonacci.recursive(n);
      System.out.println("recursive result = " + result);
      System.out.println("number of calls  = " + recursiveCalls);
    }
  }// end of main method

  /** Count number of loops to method iterative() */
  public static int loops = 0;

  /**
   * Computes a term in the Fibonacci sequence
   * 
   * @param number a positive integer
   * @return the nth Fibonacci number, or -1 for error
   */
  public static int iterative(int number) {
    // error condition
    if (number < 0) {
      return -1;
    }
    // two special cases
    if (number == 0 || number == 1) {
      return number;
    }
    // values for n = 0, 1, 2
    int first = 0;
    int second = 1;
    int third = first + second;
    // calculate next value
    for (int i = 3; i <= number; i++) {
      first = second;
      second = third;
      third = first + second;
      loops++; // count the number of loops
    }
    return third;
  }

  /** Count number of recursive calls */
  public static int recursiveCalls = 0;

  /**
   * Computes a term in the Fibonacci sequence
   * 
   * @param number a positive integer
   * @return the nth Fibonacci number, or -1 for error
   */
  public static int recursive(int number) {
    // count number of method calls
    recursiveCalls++;
    // base cases
    if ((number == 0) || (number == 1)) {
      return number;
    }
    // recursive case
    if (number > 1) {
      return Fibonacci.recursive(number - 1) + Fibonacci.recursive(number - 2);
    }
    // base case (error for negative numbers)
    return -1;
  }// end of recursive()

}// end of Fibonacci class

{% endhighlight %}






