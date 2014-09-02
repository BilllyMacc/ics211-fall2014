/**
 * Count 1 to 5 using iteration & recursion
 * 
 * @author William McDaniel Albritton
 */
public class Counting {

  /**
   * Program starts with this method
   * 
   * @param args Nnone
   */
  public static void main(String[] arguments) {
    Integer result = Counting.loop(1);
    System.out.println("Iterative solution: " + result);
    result = Counting.recursion(1);
    System.out.println("Recursive solution: " + result);
    // make infinite loop (DO NOT DO THIS!)
    // result = Counting.recursion(6);
    // System.out.println("Recursive solution: " + result);
  }

  /**
   * Counts 1 to 5 using iteration.
   * 
   * @param number should use Integer 1 (one)
   * @return sum of 1 to 5
   */
  public static Integer loop(Integer number) {
    Integer sum = 0;
    for (int i = number; i <= 5; i++) {
      sum = sum + i;
    }
    return sum;
  }

  /**
   * Counts 1 to 5 using recursion.
   * 
   * @param number should use Integer 1 (one)
   * @return sum of 1 to 5
   */
  public static Integer recursion(Integer number) {
    // base case:
    if (number == 5) {
      return number;
    }
    // recursive case:
    else {
      return number + Counting.recursion(number + 1);
    }// end of else
  }

}// end of class

