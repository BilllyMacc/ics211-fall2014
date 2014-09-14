---
title: "BackwardLines.java"
published: true
morea_id: reading-materials-BackwardLines
morea_summary: "Displays each line of a file backwards using a stack"
morea_type: reading
morea_sort_order: 3
morea_labels:
---

# BackwardLines.java

File:

[BackwardLines.java](../examples/BackwardLines.java)

Source: 

{% highlight java %}
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Displays each line of a file backwards using a stack
 * 
 * @author William McDaniel Albritton
 */
public class BackwardLines {

  /**
   * The "main" Method Starts The Program.
   * 
   * @param commandlineArguments The 1st Arugment Is The File Name.
   */
  public static void main(String[] commandlineArguments) {
    // Error Checking For Command Line Arguments..
    if (commandlineArguments.length == 0) {
      System.out.println("Please enter the file name " + "as the 1st commandline argument.");
    }
    else {
      // call method to read from file
      // and print out each line backwards
      BackwardLines.readFromFile(commandlineArguments[0]);
    }// end of "else" for commandlineArguments
  }// end of main() method

  /**
   * Reads one line at a time from a file and prints each line backwards to the screen
   * 
   * @param inputFile is the INPUT File
   */
  public static void readFromFile(String inputFile) {
    // connect to file (does NOT create new file)
    File file = new File(inputFile);
    Scanner scanFile = null;
    try {
      scanFile = new Scanner(file);
    }
    catch (FileNotFoundException exception) {
      // Print error message.
      // In order to print double quotes("),
      // the escape sequence for double quotes (\") must be used.
      System.out.print("ERROR: File not found for \"");
      System.out.println(inputFile + "\"");
      // if no file, quit program
      System.exit(1);
    }
    // if made connection to file, read from file
    // keeps looping if file has more lines..
    while (scanFile.hasNextLine()) {
      // get a line of text..
      String line = scanFile.nextLine();
      // display a line of text to screen backwards
      String backwardsLine = BackwardLines.reverse(line);
      System.out.println(backwardsLine);
    }
  }// end of readFromFile()

  /**
   * Reverses each character in a string
   * 
   * @param sentence is the INPUT String
   * @return a backwards string
   */
  public static String reverse(String sentence) {
    // instantiate a stack of Strings
    StackInterface<String> stack = new ArrayStack<String>();
    // loop through each character of the string
    for (int i = 0; i < sentence.length(); i++) {
      // isolate each character
      String character = sentence.substring(i, i + 1);
      // push each character to the stack
      stack.push(character);
    }
    // instantiate an empty string
    String reverseLine = new String();
    // loop through each character of the string
    for (int i = 0; i < sentence.length(); i++) {
      // pop off each charater from the stack and add to end of string
      reverseLine = reverseLine + stack.pop();
    }
    return reverseLine;
  }// end of reverse()

}// end of class

/*

EXAMPLE INPUT FILE: file1.txt
This is a pen.
I am a bozu.
See you again!

EXAMPLE OUTPUT:
.nep a si sihT
.uzob a ma I
!niaga uoy eeS

 */

{% endhighlight %}
