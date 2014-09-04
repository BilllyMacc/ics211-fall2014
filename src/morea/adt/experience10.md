---
title: "Assignment on ADT - Part III (asmt #10)"
published: true
morea_id: experience10
morea_type: experience
morea_summary: "Write a Java application for class Person and subclass Earthling"
morea_sort_order: 10
---

## Instructions 

Write a Java application that does the following.


1. For this program, add a subclass to the class Person code from Assignment #9.
1. Takes a String, a String, and an Integer as commandline input.
1. These three variables represent a first name, a last name, and an age (in years).
1. Use inheritance to add class Earthling to your code, which is a subclass of class Person.
1. Class Earthling should include a data field for the family name.
1. In the main method, the first name, family name, and age should be the three parameters for a constructor for a Earthling object. In other words, instantiate a Earthling object with the three variables for first name, last name, and age.
1. In the main method, print out the Earthling object (person variable), using the toString() method. Do NOT use the System.out.println() method, instead use the JOptionPane.showMessageDialog() method.
1. Then call both the phd() method and birthday() methods. Again, output the object using the toString() method, and the JOptionPane.showMessageDialog() method.
1. Below your LastnameFirstname10 class, create a second class in your LastnameFirstname10.java file.
1. Unlike your LastnameFirstname10 class, do NOT include the public modifier. In other words, the code for your Person and Earthling classes should look like this:

{% highlight java %}
	class Person{
		//data fields for first name and age
		//constructor
		//toString() method
		//phd() method
		//birthday() method
	}
	class Earthling extends Person{
		//data field for family name
		//constructor
		//toString() method
	}
{% endhighlight %} 
	
1. See FractionCalculatorInOneFile.java for an example of several classes in one Java file.
1. Replace the keyword "private" with the keyword "protected" for all data fields in superclass Person. Otherwise, you do not need to make any changes to superclass Person.
1. Create one data field for the family name in class Earthling.
1. Write the constructor for your Earthling class. You should have two String parameters and one Integer (or int) parameter, which initialize your three data fields. Note that 1 data field is in class Earthling. 2 data fields are in class Person.
1. Write the toString() method for your Earthling class. The return value should have the format: "X is Y years old."
1. Make sure your code follows the ICS 211 Java Coding Standard, in particular the Java documentation (Javadoc) comments that go above each method.
1. Write your original comments every 3-5 lines of code.
1. WARNING: In the edit method, do NOT copy my code or my comments. Use my code as a guide to write your own code.


## Example output

Here is example output for commandline arguments: <b>Nami Suzuki 25</b>

<p>
	<br />
	<img style="border: #3c8dc5 solid 5px" src="output5.jpg" alt="Nami Suzuki is 25 years old." >
	<br />
  	<br />
	<img style="border: #3c8dc5 solid 5px" src="output6.jpg" alt="Dr. Nami Suzuki is 26 years old." >
	<br />
</p>
  
  	