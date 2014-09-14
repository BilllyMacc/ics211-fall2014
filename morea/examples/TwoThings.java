/**
 * A Generic class that stores objects of any two classes
 * 
 * @author William McDaniel Albritton
 */
public class TwoThings<T, C> {
  private T item1;
  private C item2;

  /**
   * Constructor - Used To Create EAch Object & Initialize DAta Fields.
   * 
   * @param item1 is the first object.
   * @param item2 is the last object.
   */
  public TwoThings(T itemA, C itemB) {
    item1 = itemA;
    item2 = itemB;
    // item2 = itemA;
  }

  /**
   * Used to Display The Two Objects.
   * 
   * @return the toString() for the 2 Objects separated by a semi-colon
   */
  public String toString() {
    String display = item1.toString() + "; " + item2.toString();
    return display;
  }

  /**
   * This Is An "Accessor" Method - Used To Get A Data Field.
   * 
   * @return the first object
   */
  public T getItem1() {
    return item1;
  }

  /**
   * This Is An "Accessor" Method - Used To Get A Data Field.
   * 
   * @return the second object
   */
  public C getItem2() {
    return item2;
  }

  /**
   * This Is A "Mutator" Method - Used To Set A Data Field.
   *
   * @param itemA is the first object.
   */
  public void setItem1(T itemA) {
    item1 = itemA;
  }

  /**
   * This Is A "Mutator" Method - Used To Set A Data Field.
   *
   * @param itemB is the second object.
   */
  public void setItem2(C itemB) {
    item2 = itemB;
  }

  /**
   * Driver code to test class
   * 
   * @param arguments Commandline arguments not used
   */
  public static void main(String[] arguments) {
    // instantiate object of generic class Two
    // that stores a String and an Integer
    TwoThings<String, Integer> object1 = new TwoThings<String, Integer>("Nami", 25);
    System.out.println(object1.toString());
    // get the age, subtract one year, and reset age
    Integer age = object1.getItem2();
    age--;
    object1.setItem2(age);
    System.out.println(object1.toString());

    // instantiate object of generic class Two
    // that stores Name and a Fraction
    Name name = new Name("Nalu", "Suzuki");
    Fraction years = new Fraction(5, 2);
    TwoThings<Name, Fraction> object2 = new TwoThings<Name, Fraction>(name, years);
    System.out.println(object2.toString());
    // change the first name
    name = object2.getItem1();
    name.setFirstName("Sally");
    object2.setItem1(name);
    System.out.println(object2.toString());
  }// end of main

} // end of class

/*
PROGRAM OUTPUT:
    Nami; 25
    Nami; 24
    Suzuki, Nalu; 5 / 2
    Suzuki, Sally; 5 / 2
*/
