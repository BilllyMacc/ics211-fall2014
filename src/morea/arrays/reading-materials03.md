---
title: "Session #3 materials"
published: true
morea_id: reading-materials03
morea_summary: "Links to lecture #3, slides #3, and examples"
morea_type: reading
morea_sort_order: 3
morea_labels:
---

# Lecture material

  * [Link to view the podcast for Lecture #3](https://laulima.hawaii.edu/access/content/group/LEE.52916.201430/Podcasts/ICS211_Session03_Arrays%20II.mov)

  * [Link to the slides for Lecture #3](../slides/lecture03.pptx)
  
  <script async class="speakerdeck-embed" data-id="1437ee3005590132c57e062c6c3577e6" data-ratio="1.77777777777778" src="//speakerdeck.com/assets/embed.js"></script>

# Commandline interface 

  * [UNIX Commands](unix.htm)

  * [Emacs Commands](emacs.htm)

# Character encoding

  * [ASCII](http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters)

  * [Unicode](http://www.unicode.org/charts/)

# Example programs

File:

[ArraysAndMethods.java](../examples/ArraysAndMethods.java)

Source: 

{% highlight java %}
/** 
 *  Creates & displays an array of Strings
 *
 *  @author William McDaniel Albritton 
 */
public class ArraysAndMethods {

   /**
    * The main method starts the program
    *
    * @param args are not used 
    */
   public static void main(String[ ] args) {
      //These methods are static, so use syntax: ClassName.methodName()
      String [ ] stoogesNames = ArraysAndMethods.createStooges();
      ArraysAndMethods.displayArray(stoogesNames);
   }
   
   /**
    * creates & returns an array of strings
    *
    * @return an array of the 3 Stooges names
    */    
   public static String [ ] createStooges(){
      // declare array and instatiate (create) array
      String [ ] stooges = new String[3];         
      //BUG: next line will throw a NullPointerException
      //Integer length = stooges[0].length();
      //initialize array (assign values to each array element)
      stooges[0] = new String("Larry");
      stooges[1] = new String("Curley");
      stooges[2] = new String("Moe");
       //return array to calling method 
      return stooges;
   }
   
   /**
    * displays an array of Strings
    *
    * @param anArray is the array to be displayed 
    */
   public static void displayArray(String [ ] anArray){
      //display array
      Integer lengthOfArray = anArray.length; //not length()
      System.out.println("array length = " + lengthOfArray);
      for(int i = 0; i < lengthOfArray;i++){
         Integer lengthOfName = anArray[i].length(); //not length
         System.out.println(anArray[i] + " has " 
            + lengthOfName + " characters");
      }
   }
}
{% endhighlight %}

File:
[Repeat.java](../examples/Repeat.java)

Source: 

{% highlight java %}
/** 
 *  Outputs the command line arguments, if any.
 *
 *  @author William Albritton 
 */
public class Repeat {
   /**
    * The "main" Method Starts The Program.
    *
    * @param args (commandline arguments) are printed to the screen
    */
   public static void main(String[ ] args) {
      //check for commandline arguments.
      //If "args" Array Of Strings Has Length Zero, 
      //Then There Are NO Commandline Arguments.
      if(args.length == 0){
         System.out.println("NO commandline arguments entered.");
      }
      else {
         //Otherwise, Loop Through All The CommandLine Arguments 
         //Stored in Array of Strings "args".
         for(int i=0; i<args.length; i++){
            System.out.print("args[" + i + "]");
            System.out.println(" = \"" + args[i] + "\"");
         }
      }
   }
}
{% endhighlight %}

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






