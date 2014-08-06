---
title: "Java Coding Standard"
published: true
morea_id: reading-java-coding-standard
morea_type: reading
morea_summary: "Java Coding Standard"
morea_sort_order: 1
morea_labels:

---

# ICS Java Coding Standard

## Basic Coding Rules to Follow

1. Use descriptive and appropriate names for all identifiers
   (variables, method names, class names, constants, etc.).
2. Comment confusing sections of code.
3. Be neat.

## Identifier Naming and Capitalization

**Guidelines**

* Use descriptive names for all variables, function names, constants,
   and other identifiers. Use single letter identifiers only for the
   counter in loops.
 * Variable names start with lower case.
 * Multi-word identifiers are internally capitalized.
 * Do not use hyphens or underscores to separate multi-word
   identifiers (exception only for those who use speech recognition
   software).

**Example**

{% highlight java %}
private static float sumOfSquares = 0;
{% endhighlight %}

**Counter Example**

{% highlight java %}
private static float Sum = 0;
private static float sumofsquares = 0;
private static float sum_of_squares = 0;
private static float qw = 0; 
{% endhighlight %}

##Comments: Classes

**Guidelines**

* Every class should be preceded with a descriptive comment using the
  "JavaDoc" notational convention. The comment should name the class,
  describe its purpose, and name the author.

**Example**

{% highlight java %}
/**
 * Haiku, prints a haiku.
 *
 * @author Suzuki, Susan
 */
public class Haiku {
    // ...
}
{% endhighlight %}

## Comments: Methods

**Guidelines**

* Every method should be preceded with a descriptive comment using the
  "JavaDoc" notational convention. The comment should name the method,
  describe its purpose, comment all arguments, the return value, and
  any exceptions using JavaDoc keywords. (Omit @return and @exception,
  if the return value is void or there are no exceptions thrown.) 

**Example**

{% highlight java %}
/**
 * Attempts to print a word. Indicates whether printing was possible.
 *
 * @param word to print, must not contain spaces
 * @return true if printer is available, false otherwise
 * @exception SpacesFoundException if there are any spaces in the word
 */
public boolean printWord(String word) throws SpacesFoundException {
  // ...
}
{% endhighlight %}

## Comments: Public variables

**Guidelines**

* Every public variable should be preceded with a descriptive comment
  using the "JavaDoc" notational convention. The comment should
  describe the purpose for the public variable. 

**Example**

{% highlight java %}
/** Toggles between Frame and NoFrame mode. */
public boolean frameMode = true;
{% endhighlight %}

## Comments: In-line

**Guidelines**

* In-line comments should be used to explain complicated sections of
  code, such as loops. Use the // comment delimiter for in-line
  comments. Do not comment generally known features of the java
  language. 

**Example**

{% highlight java %}
// Do a 3D transmogrification on the matrix.
for (int i = 0; i < matrix.length; i++) {
  for (int j = 0; j < matrix.length; j++) {
    for (int k = 0; k < matrix.length; k++) {
      values.transmogrify(matrix[i],matrix[j],matrix[k]);
    }
  }
}
{% endhighlight %}

**Counter Example**

{% highlight java %}
i++; // increments i
// the variable "i" loops from 0 to the length of matrix
for (int i = 0; i < matrix.length; i++) {
  // ...
}
{% endhighlight %}


## Spacing: Between lines

**Guidelines**

* Use two blank lines to separate each method within a class
  definition. Use one blank line to separate logical sections of code
  within a method. 

**Example**

{% highlight java %}
  public static void main(String[] arg) {
    System.out.println("Hello" + " " + "World");
  }

  public void foo() {
    // ...
  }
{% endhighlight %}


## Spacing: Within lines

**Guidelines**

* Put a single space before every "{".
* Separate all operators such as "+" with a single space.

**Example**

{% highlight java %}
  public static void main(String[] arg) {
    System.out.println("Hello" + " " + "World");
  }
{% endhighlight %}

**Counter Example**

{% highlight java %}
  public static void main(String[] arg){
    System.out.println("Hello"+" "+"World");
  }
{% endhighlight %}

## Indentation

**Guidelines**

* Indent two spaces when beginning a new block.
* Open braces (i.e. "{") do not start a new line.
* Close braces (i.e. "}") do start a new line, and are indented with
  the code they close.
* Comments line up with the block they comment.

**Example**

{% highlight java %}
for (int i=0; i < args.length; i = i + 1) {
  vals.insertElementAt(new Float (args[i]), i);
  // Transmogrify is incremental and more efficient inside the loop.
  vals.transmogrify();
}
{% endhighlight %}

**Counter Example**

{% highlight java %}
for (int i=0; i < args.length; i = i + 1)
{
  vals.insertElementAt(new Float (args[i]), i);
// Transmogrify is incremental and more efficient inside the loop.
  vals.transmogrify();
  }
{% endhighlight %}

## Class, Package, and Method Naming and Capitalization

**Guidelines**

* Classes begin with a capital letter.
* Packages are all lower case.
* Methods begin with a lower case letter.
* Multi-word identifiers are internally capitalized in methods (CamelCase).

**Example**

{% highlight java %}
package foo.bar.baz;
public class MeanStandardDeviation
private Vector getNewVector(Vector oldVector) {
{% endhighlight %}

**Counter Example**

{% highlight java %}
package Foo.Bar.Baz;
public class Meanstandarddeviation
private Vector GetNewVector(Vector oldVector) {
{% endhighlight %}

## Program Modules

**Guidelines**

* Lines of code should be kept short, generally less than 80 or 100
characters wide.
* Each public class is contained in a separate file.
* Each file has the name of the public class contained within it.
* Avoid the use of the default package.

## Other References

**Website**

[How to Write Doc Comments for the Javadoc Tool](http://www.oracle.com/technetwork/java/javase/documentation/index-137868.html)
