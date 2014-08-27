---
title: "Name.java"
published: true
morea_id: reading-materials10-Name
morea_summary: "Class Name is used to store a first and last name"
morea_type: reading
morea_sort_order: 2
morea_labels:
---

File: 

  * [Name.java](../examples/Name.java)

Source code:

{% highlight java %}
//An interface used to compare two objects.
//Must implement method compareTo()
import java.lang.Comparable;

/**
 * Class Name is used to store a first and last name
 * 
 * @author William McDaniel Albritton
 */
public class Name implements Comparable {

  // data fields.
  // "protected" means that these data fields are visible in the subclass.
  // "protected" also means that these data fields are NOT visible outside the class
  // "protected" is halfway between "private" & "public".
  protected String first;
  protected String last;

  /**
   * Constructor - Used To Create EAch Object & Initialize DAta Fields.
   * 
   * @param firstName is the first name.
   * @param lastName is the last name.
   */
  public Name(String firstName, String lastName) {
    // This Code Initializes The Data Fields.
    // Syntax: dataField = parameter;
    first = firstName;
    last = lastName;
  }

  /**
   * Used to Display The Data Stored In EAch Object's DAta Field.
   * 
   * @return a String in format: LastName, FirstName
   */
  public String toString() {
    // Create a Local VAriable.
    String fullName = last + ", " + first;
    // Return the Local Variable.
    return fullName;
  }

  /**
   * Used to Display The Initials.
   * 
   * @return The Initials For Someone's Name.
   */
  public String initials() {
    // Create a Local VAriable For Initials.
    String theInitials = first.substring(0, 1) + ". " + last.substring(0, 1) + ".";
    return theInitials;
  }

  /**
   * This Is An "Accessor" Method - Used To Get A Data Field.
   * 
   * @return the First Name
   */
  public String getFirstName() {
    // Return the Data Field.
    return first;
  }

  /**
   * This Is An "Accessor" Method - Used To Get A Data Field.
   * 
   * @return the Last Name
   */
  public String getLastName() {
    // Return the Data Field.
    return last;
  }

  /**
   * This Is A "Mutator" Method - Used To Set A Data Field.
   *
   * @param firstNameParameter is the first name.
   */
  public void setFirstName(String firstNameParameter) {
    // SEt the Data Field.
    first = firstNameParameter;
  }

  /**
   * This Is A "Mutator" Method - Used To Set A Data Field.
   *
   * @param lastNameParameter is the last name.
   */
  public void setLastName(String lastNameParameter) {
    // set the Data Field.
    last = lastNameParameter;
  }

  /**
   * Compares this object with the specified object for order. Returns a negative integer, zero, or
   * a positive integer as this object is less than, equal to, or greater than the specified object.
   * 
   * @param object The Object to be compared.
   * @return A negative integer, zero, or a positive integer as this object is less than, equal to,
   *         or greater than the specified object.
   */
  public int compareTo(Object object) {
    // get the string for 1st name to be compared (this class)
    String name1 = this.toString();
    // get the string for the 2nd name to be compared (parameter)
    String name2 = object.toString();
    // use the compareTo method of String class
    int result = name1.compareTo(name2);
    return result;
  }

}// End of Class.


{% endhighlight %}