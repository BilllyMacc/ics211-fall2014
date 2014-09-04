---
title: "Assignment on Recursion - Part II (asmt #7)"
published: true
morea_id: experience07
morea_type: experience
morea_summary: "Write a Java application that executes more recursive methods"
morea_sort_order: 7
---

## Instructions 

Write a Java application that executes the following 5 recursive methods, each of which returns a value (do NOT use System.out.print() inside the method definitions), and prints that value in the main() method, where X is a positive integer on the commandline (1st argument), and S is a String on the commandline (2nd argument).


1. Method 1: Return and print in main() X number of S (SSSS...), in other words print the String S, X times.
1. Method 2: Return and print in main() the first character in S, X number of times (ssss...), where "s" is the first letter in String "S".
1. Method 3: Return and print in main() each letter in S two times (s0s0s1s1s2s2s3s3...) where s0 is the first letter, s1 is the second letter, s2 is the third letter, etc.
1. Method 4: Return and print in main() each letter in S three times backwards (sn-1sn-1sn-1sn-2sn-2sn-2sn-3sn-3sn-3sn-4sn-4sn-4...) where sn-1 is the last letter, sn-2 is the second to last letter, sn-3 is the third to last letter, etc.
1. Method 5: Return and print in main() a String which counts down by 1 for X, and deletes one letter for each recursion for S, until X becomes 1, or until S has only 1 letter (X S, X-1 S1 letter deleted, X-2 S2 letters deleted, X-3 S3 letters deleted...)
1. Use the commandline arguments to enter one positive integer argument.
1. X is the input for your methods.
1. You may find it useful to use more than one parameter for some of your methods.
1. At the beginning of the main method, check to make sure that the user entered the correct input.
1. If exactly one (1) positive integer argument is not entered on the commandline, then display an error message and end the program.
1. You also need to have a try-catch statement just in case a non-integer is inputted as a commandline argument.
1. Make sure your code follows the ICS 211 Java Coding Standard, in particular the Java documentation (Javadoc) comments that go above each method.
1. Write your original comments every 3-5 lines of code.
1. WARNING: Do NOT copy my code or my comments. Use my code as a guide to write your own code.   

## Output


Example output for commandline arguments: 5 natto
{% highlight java %}
nattonattonattonattonatto
nnnnn
nnaattttoo
ooottttttaaannn
5 natto, 4 atto, 3 tto, 2 to, 1 o,
{% endhighlight %}
    
Example output for commandline arguments" 10 ten
{% highlight java %}
tentententententententententen
tttttttttt
tteenn
nnneeettt
10 ten, 9 en, 8 n, 
{% endhighlight %}
    
Example output for commandline arguments: 10 abracadabra
{% highlight java %}
abracadabraabracadabraabracadabraabracadabraabracadabraabracadabraabracadabraabracadabraabracadabraabracadabra
aaaaaaaaaa
aabbrraaccaaddaabbrraa
aaarrrbbbaaadddaaacccaaarrrbbbaaa
10 abracadabra, 9 bracadabra, 8 racadabra, 7 acadabra, 6 cadabra, 5 adabra, 4 dabra, 3 abra, 2 bra, 1 ra,  
{% endhighlight %}
 