//A class to generate "random" numbers.
import java.util.Random;
//An interface used to compare two objects.
import java.lang.Comparable;
//displays mini-windows
import javax.swing.JOptionPane;

/**
 * Searches for a Fraction with an array of Fractions. Enter two numbers on commandline for your
 * guess. 1st argument is numerator, 2nd argument is denominator. Outputs the index of your guess
 * (if correct). If guess correct, reduces Fraction to lowest terms, sorts, and outputs again. If
 * guess incorrect, sets 1st element to your guess, sorts, and outputs again.
 * 
 * @author William McDaniel Albritton
 */
public class Searching {

  /**
   * main() method: begins program
   * 
   * @param arguments 1st argument is numerator, 2nd argument is denominator
   */
  public static void main(String[] arguments) {
    // initialize all variables
    // size of array
    Integer MAX = new Integer(10);
    Integer numerator = new Integer(0);
    Integer denominator = new Integer(0);
    String message = new String("no message");
    Fraction guess = new Fraction(0, 1);
    // instantiate Random object
    Random generator = new Random();
    // fill array with random numbers
    Fraction[] array = new Fraction[MAX];
    for (int i = 0; i < MAX; i++) {
      // nextInt() outputs "random" integer between 0 and n-1
      numerator = generator.nextInt(MAX) + 1;
      denominator = generator.nextInt(MAX) + 1;
      array[i] = new Fraction(numerator, denominator);
    }
    // display array
    Sorting.print(array);
    try {
      // get number from commandline
      numerator = Integer.parseInt(arguments[0]);
      denominator = Integer.parseInt(arguments[1]);
      guess = new Fraction(numerator, denominator);
    }
    catch (ArrayIndexOutOfBoundsException exception1) {
      // output information about exception
      System.out.println("ERROR: Please enter 2 integers as commandline arguments");
      // Immediately terminate program
      System.exit(1);
    }
    catch (IllegalFractionException exception2) {
      System.out.println(exception2);
      // Immediately terminate program
      System.exit(1);
    }
    catch (NumberFormatException exception3) {
      System.out.println("ERROR: Please enter INTEGERS as commandline arguments");
      // Immediately terminate program
      System.exit(1);
    }
    // sequential search for first occurrence of number in array
    Integer index = Searching.sequentialSearch(array, guess);
    if (index.equals(-1)) {
      message = guess + " is NOT in the array";
    }
    else {
      message = guess + " is at index = " + index + " (" + array[index] + ")";
    }
    // display message
    JOptionPane.showMessageDialog(null, message);
    // if guess not found, change the 1st element to your guess!
    if (index.equals(-1)) {
      array[0].setNumerator(numerator);
      array[0].setDenominator(denominator);
    }
    // set Sorting.display to "false" to prevent System.out.println() statements
    Sorting.display = false;
    // sort the array
    Sorting.quickSort(array);
    // display array
    Sorting.print(array);
    // binary search for any occurance of number in array
    // binary search only works with SORTED array!
    index = Searching.binarySearch(array, guess);
    if (index.equals(-1)) {
      message = guess + " is NOT in the array";
    }
    else {
      message = guess + " is at index = " + index + " (" + array[index] + ")";
    }
    // display message
    JOptionPane.showMessageDialog(null, message);
  }

  /**
   * Sequential search through an array
   * 
   * @param array is the array of Comparable objects
   * @param guess is an object that might be in the array
   * @return -1, if element not found; index of element, if found
   */
  public static Integer sequentialSearch(Comparable[] array, Comparable guess) {
    for (int i = 0; i < array.length; i++) {
      if (guess.compareTo(array[i]) == 0) {
        return i;
      }
    }
    // if not found, return negative index number
    return -1;
  }// end of method

  /**
   * Binary search through an array
   * 
   * @param array is the array of Comparable objects
   * @param guess is an object that might be in the array
   * @return -1, if element not found; index of element, if found
   */
  public static Integer binarySearch(Comparable[] array, Comparable guess) {
    return Searching.binarySearch(array, guess, 0, array.length - 1);
  }// end of method

  /**
   * Binary search through an array
   * 
   * @param array is the array of Comparable objects
   * @param guess is an object that might be in the array
   * @param start is the index of first element in the array
   * @param end is the index of last element in the array
   * @return -1, if element not found; index of element, if found
   */
  private static Integer binarySearch(Comparable[] array, Comparable guess, Integer start,
      Integer end) {
    // base case, NOT in array
    if (start > end) {
      return -1;
    }
    // base case, if found!
    Integer half = (start + end) / 2;
    if (guess.compareTo(array[half]) == 0) {
      return half;
    }
    // recursive case, if in 1st half of array
    else if (guess.compareTo(array[half]) < 0) {
      return binarySearch(array, guess, start, half - 1);
    }
    // recursive case, if in 2nd half of array
    else {
      return binarySearch(array, guess, half + 1, end);
    }
  }// end of method

}// end of class

