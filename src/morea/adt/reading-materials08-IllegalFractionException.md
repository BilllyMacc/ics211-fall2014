---
title: "IllegalFractionException.java"
published: true
morea_id: reading-materials08-IllegalFractionException
morea_summary: "An Exception for use with the Fraction class"
morea_type: reading
morea_sort_order: 2
morea_labels:
---

File: 

  * [IllegalFractionException.java](../examples/IllegalFractionException.java)

Source code:

{% highlight java %}
/**
 * An Exception for use with the Fraction class
 * 
 * @author William McDaniel Albritton
 */
public class IllegalFractionException extends RuntimeException {
  /**
   * Constructor
   * 
   * @param message Describes the cause of the error
   */
  public IllegalFractionException(String message) {
    super(message);
  }
}// end of class


{% endhighlight %}
  
  