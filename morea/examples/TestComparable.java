//An interface used to compare two objects.
import java.lang.Comparable;

/**
 * A test for the compareTo() method for several classes
 * 
 * @author William McDaniel Albritton
 */
public class TestComparable {

  /**
   * main() method: begins program
   * 
   * @param arguments is not used
   */
  public static void main(String[] arguments) {
    // compare two Integers
    Comparable objectA = new Integer(7);
    Comparable objectB = new Integer(3);
    TestComparable.output(objectA, objectB);
    // compare two Strings
    // note that A < Z, for alphabetical ordering
    objectA = new String("apple");
    objectB = new String("zebra");
    TestComparable.output(objectA, objectB);
    // compare two Fractions
    objectA = new Fraction(1, 2);
    objectB = new Fraction(2, 4);
    TestComparable.output(objectA, objectB);
    // compare two Names
    objectA = new Name("Zeus", "Aoki");
    objectB = new Name("Sally", "Suzuki");
    TestComparable.output(objectA, objectB);
    // compare two ThreeNames
    objectA = new ThreeNames("Sally", "Grace", "Suzuki");
    objectB = new ThreeNames("Sally", "Ann", "Suzuki");
    TestComparable.output(objectA, objectB);
    try {
      // compare a Name to a Fraction
      objectA = new Fraction(5, 6);
      objectB = new Name("Isoroku", "Yamamoto");
      TestComparable.output(objectA, objectB);
    }
    catch (ClassCastException exception) {
      System.out.println(exception);
    }
  }

  /**
   * Outputs the toString() method and compareTo() method for two objects
   * 
   * @param object1 is the 1st object
   * @param object1 is the 2nd object
   */
  public static void output(Comparable object1, Comparable object2) {
    System.out.println("object1 = " + object1);
    System.out.println("object2 = " + object2);
    System.out.println("object1.compareTo(object2) = " + object1.compareTo(object2));
  }// end of method

}// end of class

