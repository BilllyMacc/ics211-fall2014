---
title: "Assignment on Stacks - Part I (asmt #13)"
published: true
morea_id: experience13
morea_type: experience
morea_summary: "Implement a Postfix Calculator using a Stack by using the algorithm in the slides. "
morea_sort_order: 13
---

## Instructions

Write a Java application that does the following.

1. Implement a Postfix Calculator using a Stack by using the algorithm in the slides. See slides 41, 42, 43 titled "Infix to Postfix Algorithm" for the algorithm.
1. Use the interface StackInterface.java and the class ArrayStack.java in your program.
1. Save both files in the same folder (directory) as your LastnameFirstname13.java file.
1. Do not make any changes to these files, except delete the main() method in the ArrayStack class.
1. Your program should use command-line input to read from a file. The file name is only argument on the command-line input, so args[0] is the file name. In you main method, read one line of data from the input file, calculate the result, then output to the screen. Repeat this until you reach the end of the file. Each line in the file will contain a infix expression.
1. Make sure your program is robust. It should not crash when a user enters invalid input. Instead, it should display an appropriate error message. Use exceptions and/or if-statements to do this.
1. Your output should be similar to the output below.
1. Write your original comments every 3-5 lines of code.
1. WARNING: Do NOT copy my code or my comments. Use my code as a guide to write your own code.
1. Don't forget to add "JavaDoc" style comments above each method. See ICS 211 Java Coding Standard (Comments: Methods) for details.
	
## Output

Here is example output for input file: <a href="../examples/input13.txt">input13.txt</a>

{% highlight java %}
Reading from file: input13.txt

Infix expression   = (5)
Postfix expression = 5

Infix expression   = (1+1)
Postfix expression = 11+

Infix expression   = ((9/3)-2)
Postfix expression = 93/2-

Infix expression   = (9-(3/2))
Postfix expression = 932/-

Infix expression   = (1+(4-(9*(6/(5%7)))))
Postfix expression = 149657%/*-+

Infix expression   = ((1+4)-(((9*6)/5)%7))
Postfix expression = 14+96*5/7%-

Infix expression   = (((1+(4-9))*6)/(5%7))
Postfix expression = 149-+6*57%/

Infix expression   =      
ERROR:java.lang.RuntimeException: Bad character input: " "

Infix expression   = ((1+(2-3))
ERROR:java.lang.RuntimeException: Data still on stack: "("

Infix expression   = (1+(2-3)))
ERROR:java.util.EmptyStackException

Infix expression   = (1+(A-3))
ERROR:java.lang.RuntimeException: Bad character input: "A"

Infix expression   = (1@1)
ERROR:java.lang.RuntimeException: Bad character input: "@"
{% endhighlight %}

  