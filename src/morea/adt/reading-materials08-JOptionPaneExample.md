---
title: "JOptionPaneExample.java"
published: true
morea_id: reading-materials08-JOptionPaneExample
morea_summary: "Writes a word backwards using iteration & recursion. The results are returned to the main() method and printed there"
morea_type: reading
morea_sort_order: 2
morea_labels:
---

File: 

  * [JOptionPaneExample.java](../examples/JOptionPaneExample.java)

Source code:

{% highlight java %}
import javax.swing.JOptionPane;

/**
 * Example of JOptionPane and toString() method. Must be compiled with Fraction.java file in the
 * same folder
 * 
 * @author William Albritton
 */
public class JOptionPaneExample {
  /**
   * main() method: begins program
   * 
   * @param arguments is not used
   */
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Here is example output using JOptionPane");
    JOptionPane.showMessageDialog(null, "Here is a second output statement using JOptionPane");

    // example of toString() for class Fraction
    Fraction fraction1 = new Fraction(1, 2);
    String display = fraction1.toString();
    JOptionPane.showMessageDialog(null, "fraction1 is " + display);
    System.out.println("The toString() output for fraction1 is " + display);
  }
}// end of class


{% endhighlight %}
  
  