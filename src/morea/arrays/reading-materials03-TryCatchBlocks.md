---
title: "TryCatchBlocks.java"
published: true
morea_id: reading-materials03-TryCatchBlocks
morea_summary: "Example of Try-Catch Blocks"
morea_type: reading
morea_sort_order: 3
morea_labels:
---

# TryCatchBlocks.java

File:

[TryCatchBlocks.java](../examples/TryCatchBlocks.java)

Source: 

{% highlight java %}
/**
 * Example of Try-Catch Blocks 
 *
 * @author William Albritton 
 */
public class TryCatchBlocks { 

   /**
    * The "main" Method Starts The Program.
    *
    * @param args Are Not Used.
    */	
   public static void main(String[ ] args) {  
      //Initializing all Integer & String Variables
      Integer result = new Integer(0);
      Integer [ ] numbers = {10, 20, 30 ,40, 50};
      Integer lastNumber = new Integer(0);
         
      //Try Block for possible exceptions
      try{
         //IF Divide By Zero,
         //then next 3 lines of code are skipped
         result = 7 / 0;
         System.out.println("result = " + result);
         //IF the array index [ ] Throws An Exception,
         //then the following line of code is skipped
         lastNumber = numbers[5];
         System.out.println("lastNumber = " + lastNumber);
      }
      //Catch Blocks for The Two Possible Exceptions.
      catch(ArithmeticException exception1){
         System.out.println("ERROR: Cannot divide by zero!");
      }
      catch(ArrayIndexOutOfBoundsException exception2){
         System.out.println("ERROR: Incorrect array index!");
      }     	    					
   }
}
{% endhighlight %}

File:

[ReadFromFile.java](../examples/ReadFromFile.java)

Source: 

{% highlight java %}
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/** 
 *  Shows How To Read from a File.
 *
 *  @author William Albritton 
 */
public class ReadFromFile {
/**
 * The "main" Method Starts The Program.
 *
 * @param commandlineArguments The 1st Arugment Is The File Name. 
 */  
   public static void main(String[] commandlineArguments) {
      //Error Checking For Command Line Arguments..
      if(commandlineArguments.length == 0){
         System.out.println("Please enter the file name as the 1st commandline argument.");
      }
      else{
         //connect to file (does NOT create new file)
         File file = new File(commandlineArguments[0]);
         Scanner inputFromFile = null;
         try {
            inputFromFile = new Scanner(file);
         } 
         catch (FileNotFoundException exception) {
            //Print error message.
            //In order to print double quotes("), 
            //the escape sequence for double quotes (\") must be used.
            System.out.print("ERROR: File not found for \"");
            System.out.println(commandlineArguments[0]+"\"");
         }        
         //if made connection to file, read from file
         if(inputFromFile != null){
            //In order to print double quotes("), 
            //the escape sequence for double quotes (\") must be used.				
            System.out.print("Reading from file \"" + commandlineArguments[0] + "\":\n");
            //keeps looping if file has more lines..
            while (inputFromFile.hasNextLine()) {
               //get a line of text..
               String line = inputFromFile.nextLine();
               //display a line of text to screen..
               System.out.println(line);
            }
         }
      }
   }
}	
{% endhighlight %}






