---
title: "Comparable.java"
published: true
morea_id: reading-materials-Comparable
morea_summary: "A Comparable interface based on Java API's Comparable interface"
morea_type: reading
morea_sort_order: 2
morea_labels:
---

# Comparable.java

File: 

  * [Comparable.java](../examples/Comparable.java)

Source code:

{% highlight java %}
/**
 * A Comparable interface based on Java API's Comparable interface
 * 
 * @author William McDaniel Albritton
 */
public interface Comparable {

  /**
   * Compares this object with the specified object for order. Returns a negative integer, zero, or
   * a positive integer as this object is less than, equal to, or greater than the specified object.
   * 
   * @param object The Object to be compared.
   * @return A negative integer, zero, or a positive integer as this object is less than, equal to,
   *         or greater than the specified object.
   * @exception ClassCastException If the specified object's type prevents it from being compared to
   *            this Object.
   */
  public int compareTo(Object object) throws ClassCastException;
}

{% endhighlight %}
  
  