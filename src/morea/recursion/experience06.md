---
title: "Assignment on Recursion - Part I (asmt #6)"
published: true
morea_id: experience06
morea_type: experience
morea_summary: "Write a Java application that executes recursive methods"
morea_sort_order: 6
---

## Instructions

Write a Java application that executes the following 5 recursive methods (do NOT use for or while loops), each of which returns a value (do NOT use System.out.print() inside the method definitions), and prints that value in the main() method, where X is a positive integer on the commandline.



1. Method 1: Return and print in main() a row of X asterisks (****...)
2. Method 2: Return and print in main() the numbers from X to 0 (X, ..., 4, 3, 2, 1, 0) by returning the numbers as a String.
3. Method 3: Return and print in main() the numbers from 0 to X incrementing by 1 (0 + 1 + 2 + 3 + 4 + ... + X) by returning the numbers as a String.
1. Method 4: Return and print in main() the sum of the numbers from 0 to X incrementing by 1 (0 + 1 + 2 + 3 + 4 + ... + X) and return the numbers as an Integer.
1. Method 5: Return and print in main() the sum of the powers of 2 up to the Xth power of 2 by multiplying by 2 and adding the numbers together (1 + 2 + 4 + 8 + 16 + ... + 2X) and return the numbers as an Integer. Do NOT use the method Math.pow().
1. Use the commandline arguments to enter one positive integer argument.
1. X is the input for your methods.
1. You need to convert the commandline argument to an integer: Integer x = Integer.parseInt(args[0]);
1. You may find it useful to use more than one parameter for some of your methods.
1. At the beginning of the main method, check to make sure that the user entered the correct input.
1. If exactly one (1) positive integer argument is not entered on the commandline, then display an error message and end the program.
1. You also need to have a try-catch statement just in case a non-integer is inputted as a commandline argument.
1. Write your original comments every 3-5 lines of code.
1. WARNING: Do NOT copy my code or my comments. Use my code as a guide to write your own code.
1. Make sure your code follows the ICS 211 Java Coding Standard, in particular the Java documentation (Javadoc) comments that go above each method.


## Output

Example output for commandline argument: 1
{% highlight java %}
*
1, 0, 
0, 1, 
1
3
{% endhighlight %}    

Example output for commandline argument: 5
{% highlight java %}
*****
5, 4, 3, 2, 1, 0, 
0, 1, 2, 3, 4, 5, 
15
63
{% endhighlight %}    

Example output for commandline argument: 10
{% highlight java %}
**********
10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 
0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
55
2047
{% endhighlight %}