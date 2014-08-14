---
title: "Session #5 materials"
published: true
morea_id: reading-materials05
morea_summary: "Links to lecture, slides, and examples"
morea_type: reading
morea_sort_order: 5
morea_labels:
---

# Lecture material

  * [Link to Lecture #5](https://laulima.hawaii.edu/access/content/group/LEE.52916.201430/Podcasts/ICS211_Session05_The%20Big%20O.mov)

  * [Link to the slides for Lecture #5](../slides/lecture05.pptx)

<script async class="speakerdeck-embed" data-id="b928936005630132c57e062c6c3577e6" data-ratio="1.77777777777778" src="//speakerdeck.com/assets/embed.js"></script>

# Example programs

File:

  * [FactorialProgram.java](../examples/FactorialProgram.java)

Source code:

{% highlight java %}
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
{% endhighlight %}

File:

  * [BigOCode.java](../examples/BigOCode.java)

Source code:

{% highlight java %}
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
{% endhighlight %}

File:

  * [GroceryListProgram4.java](../examples/GroceryListProgram4.java)

Source code:

{% highlight java %}
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Implements a Grocery List Version 4: Has code for all methods (final version)
 * 
 * @author William McDaniel Albritton
 */
public class GroceryListProgram4 {
  /**
   * The main() Method Starts The Program.
   * 
   * @param commandlineArguments 1st argument is INPUT File, 2nd argument is OUTPUT File
   */
  public static void main(String[] commandlineArguments) {
    // Error Checking For 2 Command Line Arguments..
    if (commandlineArguments.length != 2) {
      System.out.println("Please enter the INPUT file name as "
          + "the 1st commandline argument.");
      System.out.println("Please enter the OUTPUT file name as "
          + "the 2nd commandline argument.");
      System.out.println("Please enter exactly "
          + "two (2) commandline arguments.");
    }// end of if
     // if no commandline argument errors, continue program
    else {
      // Declare and instantiate array of 100 Strings
      final Integer MAX_SIZE = new Integer(100);
      String groceryList[] = new String[MAX_SIZE];
      // Set size of grocery list to zero (0) items
      Integer size = new Integer(0);
      // read grocery items from file & store in array for grocery list
      try {
        size = GroceryListProgram4.readFromFile(commandlineArguments[0],
            groceryList, size);
      } catch (ArrayIndexOutOfBoundsException exception) {
        System.out.print("ERROR: Too many items in input file. ");
        System.out.println("Please limit to " + MAX_SIZE + " items.");
        // Immediately terminates program
        System.exit(1);
      }

      // user's choice for Menu
      Integer choice = new Integer(0);
      // choice for ending program
      final Integer QUIT = new Integer(4);
      // if the user does not want to QUIT, keep looping
      while (!choice.equals(QUIT)) {
        // get the user's choice
        choice = GroceryListProgram4.displayMenu();
        // add grocery item
        if (choice.equals(1)) {
          size = GroceryListProgram4.add(groceryList, size);
        }
        // delete grocery item
        else if (choice.equals(2)) {
          size = GroceryListProgram4.delete(groceryList, size);
        }
        // display grocery item
        else if (choice.equals(3)) {
          GroceryListProgram4.display(groceryList, size);
        }
        // error message
        else if (!choice.equals(QUIT)) {
          System.out.println("ERROR: Please enter an integer in the range from 1 to 4");
        }
      }// end of "while"
       // write to from grocery list array to OUTPUT file
      GroceryListProgram4.writeToFile(commandlineArguments[1], groceryList,
          size);
    }// end of "else"
  }// end of main() method

  /**
   * Displays the menu for the program and returns user's choice
   * 
   * @return the choice of the user (if error, returns 0)
   */
  public static Integer displayMenu() {
    // display menu
    System.out.println();
    System.out.println("\tGROCERY LIST MENU");
    System.out.println("\t Enter 1 to Add");
    System.out.println("\t Enter 2 to Delete");
    System.out.println("\t Enter 3 to Display");
    System.out.println("\t Enter 4 to Quit");
    System.out.print("\tEnter your choice: ");
    // get input from user
    Scanner keyboardInput = new Scanner(System.in);
    Integer choiceOfUser = new Integer(0);
    try {
      // non-integer input will throw InputMismatchException
      choiceOfUser = keyboardInput.nextInt();
    } catch (InputMismatchException exception) {
      // Already have error message in main() method,
      // as choiceOfUser = 0
    }
    System.out.println();
    return choiceOfUser;
  }

  /**
   * Reads grocery items from a file and stores items in an array
   * 
   * @param inputFile is the INPUT File
   * @param array is the Grocery List array
   * @param size is the number of items in Grocery List
   * @return the new size of the grocery list
   * @throws ArrayIndexOutOfBoundsException if array size is less than number of
   *         items in input file
   */
  public static Integer readFromFile(String inputFile, String[] array,
      Integer size) throws ArrayIndexOutOfBoundsException {
    // connect to file (does NOT create new file)
    File file = new File(inputFile);
    Scanner scanFile = null;
    try {
      scanFile = new Scanner(file);
    } catch (FileNotFoundException exception) {
      // Print error message.
      // In order to print double quotes("),
      // the escape sequence for double quotes (\") must be used.
      System.out.print("ERROR: File not found for \"");
      System.out.println(inputFile + "\"");
    }
    // if made connection to file, read from file
    if (scanFile != null) {
      // keeps looping if file has more lines..
      while (scanFile.hasNextLine()) {
        // get a line of text..
        String line = scanFile.nextLine();
        // display a line of text to screen..
        // System.out.println(line);
        // array[0] stores the first row (headings) to table
        array[size] = line;
        // increment size
        ++size;
      }
      // In order to print double quotes("),
      // the escape sequence for double quotes (\") must be used.
      System.out.println("Read from file \"" + inputFile + "\"");
    }// end of "if" for connecting to file
    return size;
  }

  /**
   * Adds a grocery item to an array
   * 
   * @param list is the grocery list
   * @param listSize is the size of the grocery list
   * @return new size of the grocery list
   */
  public static Integer add(String[] list, Integer listSize) {
    // get item from user
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter name of item: ");
    String name = keyboard.nextLine();
    System.out.print("Enter number of items: ");
    String number = keyboard.nextLine();
    // add to the end of the array
    list[listSize] = name + ", " + number;
    // add one to the size (one item to end of list)
    return listSize + 1;
  }

  /**
   * Deletes a grocery item from an array
   * 
   * @param list is the grocery list
   * @param listSize is the size of the grocery list
   * @return new size of the grocery list
   */
  public static Integer delete(String[] list, Integer listSize) {
    // get user input
    System.out.print("Enter the row number of the item you wish to delete: ");
    Scanner keyboard = new Scanner(System.in);
    try {
      // throws an exception if not an integer
      Integer row = keyboard.nextInt();
      // check for negative integers
      if (row <= 0) {
        System.out.println("ERROR: The integer cannot be negative or zero.");
      }
      // check for integer too big
      else if (row > listSize - 1) {
        System.out.println("ERROR: The integer is too big for the list.");
      } else {
        // delete item by shifting items on the right of the item to the left
        for (int i = row; i < listSize; i++) {
          list[i] = list[i + 1];
        }
        // subtract one from the size (one item deleted from list)
        --listSize;
      }
    } catch (InputMismatchException exception) {
      System.out.println("ERROR: You must enter an integer to delete an item.");
    }
    return listSize;
  }

  /**
   * Displays a grocery list
   * 
   * @param list is the grocery list
   * @param listSize is the size of the grocery list
   */
  public static void display(String[] list, Integer listSize) {
    // loop through the array
    for (int i = 0; i < listSize; i++) {
      // display headings
      if (i == 0) {
        System.out.println("Row  " + list[i]);
      }
      // display grocery list items as a numbered list
      else {
        System.out.println(i + ".   " + list[i]);
      }
    }
  }

  /**
   * Write grocery list array to file
   * 
   * @param list is the grocery list
   * @param listSize is the size of the grocery list
   */
  public static void writeToFile(String outputFile, String[] list,
      Integer listSize) {
    // "PrintWriter" is a Class Used To Write to A File.
    PrintWriter fileWriter = null;
    try {
      /*
       * Must use try-catch block, because PrintWriter may throw
       * FileNotFoundException, which is a checked exception. This will connect
       * to a file in the current directory. If the file does not exists, a new
       * file will be created. If the file does exists, the file will be
       * overwritten.
       */
      fileWriter = new PrintWriter(outputFile);
    } catch (FileNotFoundException exception) {
      // Print error message.
      // In order to print double quotes("),
      // the escape sequence for double quotes (\") must be used.
      System.out.print("ERROR: File not found for \"");
      System.out.println(outputFile + "\"");
    }
    // if file opened successfully, then below code executes..
    // continue program if writeToFile is not "null"
    if (fileWriter != null) {
      // loop through list (grocery list) and write to file
      for (int i = 0; i < listSize; i++) {
        fileWriter.println(list[i]);
      }
      // REMEMBER: always give feedback to the user!
      System.out.println("Wrote to file \"" + outputFile + "\"");
      // WARNING: don't forget to close the file!
      // will not write to file if not closed!
      fileWriter.close();
    }// end of "if" statement for writeToFile

  }

}// end of class
{% endhighlight %}


File:
  
  * [MoreBigO.java](../examples/MoreBigO.java)

Source code:

{% highlight java %}
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
{% endhighlight %}

File:

  * [MoreBigOAnswers.txt](../examples/MoreBigOAnswers.txt)

File content:

{% highlight java %}
Steps to take to complete the assignment: 
1. Big-O is an estimate of how long a section of code takes to run. 
2. For each problem, you need to ask yourself this question: "How many times will the loop repeat itself?"
3. O(1) means that the loop repeats a constant number of times. 
4. O(log n) means that the counter is (tripling, quadrupling, etc.), so the loop repeats log(n) times.
5. O(n) means that the loop repeats the same number of times as n.
6. O(2^n) means that the loop repeats the 2^n (2 to the power of n) number of times. 
7. If the loops are nested, you multiply the Big-O terms, so O(1) is canceled out by the other Big-O terms. 
8. If the loops are separate, you add the Big-O terms, so the largest (slowest run time) term cancels out 
   all the smaller (faster run time) terms. 
 

Example 1: 
Answer: O(1)
Detailed explanation: 
This for-loop repeats 10 times, so it is a constant. 
Even if n is really large, the number of loops does not change.
So this for-loop runs really fast!
Therefore, the loop has a Big-O of O(1).
 
Example 2:  
Answer: O(log n)
Detailed explanation: 
This for-loop doubles its count with every loop. In other words, i = 1, 2, 4, 8, 16, etc. 
Whenever we see this kind of doubling (tripling, quadrupling, etc.), 
then we know that the time it takes to complete the loop is logarithmic time, 
which is quite fast. This for-loop repeats log2(n) times (log base 2 times).
For example, if you enter the number 10000000000000000, then log2 (10000000000000000) = 53.15085, 
so the loop repeats 54 times.
Typically, we leave off the base for logarithms, as we are only interested in an estimated time, not the exact time.
Therefore, the loop has a Big-O of O(log n). 

Example 3: 
Answer: O(1) + O(log n) = O(log n) 
Detailed explanation: 
These are two separate loops, so we add the Big-O terms together.
O(1) is much smaller (faster running) than O(log n). 
In other words, the second loop of O(log n) will run much slower than the first loop of O(1), 
so we can just ignore the time it takes the O(1) loop to repeat.
If you enter the number 10000000000000000, you can see that the loop repeats itself 64 (10 + 54) times.

Example 4: 
Answer: O(1) * O(log n) = O(1*log n) = O(log n)
Detailed explanation: 
These are two nested loops, so we multiply the Big-O terms.
Just like "regular" math, one times a number is the number.
In other words, 1 * log(n) = log(n). 
If you enter the number 10000000000000000, you can see that the loop repeats itself 540 (10 * 54) times.

Example 5: 
Answer: O(n)
Detailed explanation: 
This loop repeats n number of times, so it is O(n). 
If you enter the number 10000000000000000, you will have to wait a long time! This is because, 
it will loop 10000000000000000 times! 
So enter a smaller number such as 100000000. You will see that this loops many more times, 
and so takes much longer time, than examples 1-4
 
Example 6: 
Answer: O(1) + O(log n) + O(n) = O(n)
Detailed explanation: 
These are two separate loops, so we add the Big-O terms together.
The largest (slowest running) term is O(n).
The O(n) loop takes so much more time than the other two loops of O(1) and O(log n), 
that we can ignore the O(1) and O(log n) terms.
For input 100000000, the count is 100000037, so this does not take so much longer than example 5, 
which is also O(n).

Example 7: 
Answer: O(1) * O(log n) * O(n) = O(n * log n)
Detailed explanation: 
These are two nested loops, so we multiply the Big-O terms.
Just like 1*x=x, O(1) is not included in the final result.
For input 100000000, you might have to wait a long time, depending on the speed of your computer. 
This makes sense, because O(n * log n) will take longer time to run than O(n).
So you should change the input to a shorter number such as 1000000.
You can see now that example 6 repeats 1000030 times, but example 7 repeats 200000000 times! 

Example 8: 
Answer: O(n) * O(n) = O(n * n) = O(n^2)
Detailed explanation: 
These are two nested loops, so we multiply the Big-O terms.
Since O(n^2) takes longer than O(n * log n), you need to enter a smaller number such as 10000.
If you compare example 8 to example 7, you will see that example 8 loops many more times than example 7.

Example 9: 
Answer: O(n) * O(n) * O(n) = O(n * n * n) = O(n^3)
Detailed explanation: 
These are three nested loops, so we multiply the Big-O terms.
Since O(n^3) takes longer than O(n^2), you need to enter a smaller number such as 1000.
Again, you will see that the larger Big-O terms take longer to execute than the smaller Big-O terms.

Example 10: 
Answer: O(2^n) 
Detailed explanation: 
This loop repeats 2^n (2 to the power of n) number of times.
Again, you will see that the larger Big-O terms take longer to execute than the smaller Big-O terms.
{% endhighlight %}

