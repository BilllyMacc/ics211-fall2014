---
title: "Assignment on ADT - Part I (asmt #8)"
published: true
morea_id: experience08
morea_type: experience
morea_summary: "Write a Java application for class Person"
morea_sort_order: 8
---

## Instructions

Write a Java application that does the following.


1. Takes a String, an Integer, a String, and an Integer as commandline input.
1. These four variables represent a name, an age (in years), a second name, and a second age (in years).
1. In the main method, the first name and age should be the two parameters for a constructor for a Person object. In other words, instantiate a Person object with the two variables for name and age.
1. In the main method, print out the Person object (person variable), using the toString() method. Do NOT use the System.out.println() method, instead use the JOptionPane.showMessageDialog() method.
1. Use the second name and age to instantiate another Person object. Use the toString() method, and the JOptionPane.showMessageDialog() method to output the information.
1. Below your LastnameFirstname8 class, create a second class in your LastnameFirstname8.java file.
1. Unlike your LastnameFirstname8 class, do NOT include the public modifier. In other words, the code for your Person class should look like this:

{% highlight java %}
	class Person{
		//data fields for name and age
		//constructor
		//toString() method
	}
{% endhighlight %}    
	
2. See LastnameFirstname08.java for a template for this assignment.

{% highlight java %}
import javax.swing.JOptionPane;

/**
 * Initialize Person objects to commmandline input and output Person object data
 * 
 * @author Your Name
 */
public class LastnameFirstname08 {
  public static void main(String[] args) {
    // initialize first Person object to commmandline input
    // initialize second Person object to commmandline input
    // use toString() method to display first Person object with JOptionPane.showMessageDialog()
    // use toString() method to display second Person object with JOptionPane.showMessageDialog()
  }
}// end of class LastnameFirstname08

/**
 * Class Person stores and displays the name and age for a person
 * 
 * @author Your Name
 */
class Person {
  // data field for name
  // data field for age
  // constructor
  // toString() method
}// end of class Person
{% endhighlight %}	

2. See JOptionPaneExample.java for an example of JOptionPane.showMessageDialog() and toString() methods.
2. See FractionCalculatorInOneFile.java for an example of several classes in one Java file.
2. Create two data fields. One data field for name and a second data field for age in your Person class.
2. Write the constructor for your Person class. You should have a String and Integer (or int) parameters, which initialize your two data fields.
2. Write the toString() method for your Person class. The return value should have the format: "X is Y years old."
2. Make sure your code follows the ICS 211 Java Coding Standard, in particular the Java documentation (Javadoc) comments that go above each method.
2. Write your original comments every 3-5 lines of code.
2. WARNING: In the edit method, do NOT copy my code or my comments. Use my code as a guide to write your own code.

## Example output

Here is example output for commandline arguments: <b>Nami 20 Nalu 25</b>

<p>
	<br>
	<img style="border: #3c8dc5 solid 5px" src="output1.jpg" alt="Nami is 20 years old.">
	<br>
	<br>
	<img style="border: #3c8dc5 solid 5px" src="output2.jpg" alt="Nalu is 25 years old.">
</p>