---
title: "Assignment on Stacks - Part II (asmt #14)"
published: true
morea_id: experience14
morea_type: experience
morea_summary: "Implement a Postfix Calculator using a Stack by using the algorithm in the slides"
morea_sort_order: 14
---

## Instructions 

Write a Java application that does the following.

1. Implement a Postfix Calculator using a Stack by using the algorithm in the slides. See slides 35 and 36 titled "Postfix Evaluation Algorithm" for the algorithm.
1. Use the interface StackInterface.java, the class LinkedStack.java, and the class Node.java in your program.
1. Save the three files in the same folder (directory) as your LastnameFirstname14.java file.
1. Do not make any changes to these files.
1. Your program should use command-line input to read from a file. The file name is only argument on the command-line input, so args[0] is the file name. In you main method, read one line of data from the input file, calculate the result, then output to the screen. Repeat this until you reach the end of the file. Each line in the file will contain a postfix expression.
1. Make sure your program is robust. It should not crash when a user enters invalid input. Instead, it should display an appropriate error message. Use exceptions and/or if-statements to do this.
1. Your output should be similar to the output below.
1. Write your original comments every 3-5 lines of code.
1. WARNING: Do NOT copy my code or my comments. Use my code as a guide to write your own code.
1. Don't forget to add "JavaDoc" style comments above each method. See ICS 211 Java Coding Standard (Comments: Methods) for details.

   

## Output

Here is example output for input file [input14.txt](../examples/input14.txt)
{% highlight java %}
Reading from file: input14.txt

Postfix expression = 5
Calculate result   = 5

Postfix expression = 11+
Calculate result   = 2

Postfix expression = 93/2-
Calculate result   = 1

Postfix expression = 932/-
Calculate result   = 8

Postfix expression = 149657%/*-+
Calculate result   = -4

Postfix expression = 14+96*5/7%-
Calculate result   = 2

Postfix expression = 149-+6*57%/
Calculate result   = -4

Postfix expression =      
ERROR: java.lang.RuntimeException: Bad character input: " "

Postfix expression = 1+1
ERROR: java.util.EmptyStackException

Postfix expression = 11+*
ERROR: java.util.EmptyStackException

Postfix expression = +11
ERROR: java.util.EmptyStackException

Postfix expression = 11@
ERROR: java.lang.RuntimeException: Bad character input: "@"
    
{% endhighlight %}
   
   