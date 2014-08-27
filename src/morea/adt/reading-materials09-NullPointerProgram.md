---
title: "NullPointerProgram.java"
published: true
morea_id: reading-materials09-NullPointerProgram
morea_summary: "Demonstrates a NullPointerException"
morea_type: reading
morea_sort_order: 2
morea_labels:
---

File: 

  * [NullPointerProgram.java](../examples/NullPointerProgram.java)

Source code:

{% highlight java %}
/**
 * Demonstrates a NullPointerException
 * 
 * @author William McDaniel Albritton
 */
public class NullPointerProgram {

  /**
   * main() method: begins program
   * 
   * @param arguments is not used
   */
  public static void main(String[] arguments) {

    Integer x = new Integer(5); // initialize variable
    x = null; // set the address to nothing
    String str = x.toString(); // throws NullPointerException
    System.out.println(str);

  }// End of Main.

}// End of Class.


{% endhighlight %}
  
  