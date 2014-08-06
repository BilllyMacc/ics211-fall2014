---
title: "Session #2 materials"
published: true
morea_id: reading-materials02
morea_summary: "Links to lecture #2, slides #2, and examples"
morea_type: reading
morea_sort_order: 2
morea_labels:
---

# Lecture material

  * [Link to view the podcast for Lecture #2](https://laulima.hawaii.edu/access/content/group/LEE.52916.201430/Podcasts/Session02_Arrays.mov)

  * [Link to download the slides for Lecture #2](../slides/lecture02.pptx)

<script async class="speakerdeck-embed" data-id="f819b0a0ffe10131a0065a62ea9b4ee9" data-ratio="1.77777777777778" src="//speakerdeck.com/assets/embed.js"></script>

# Java documentation

  * [Java Platform Standard Edition 8 API Specification](http://docs.oracle.com/javase/8/docs/api/)

  * [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

  * [jGRASP](http://spider.eng.auburn.edu/user-cgi/grasp/grasp.pl?;dl=download_jgrasp.html)

# Example programs

File:

  * [InitializingArrays.java](../examples/InitializingArrays.java)

Source code:

{% highlight java %}
/** 
 *  Array Initialization Examples.
 *
 *  @author William Albritton 
 */
public class InitializingArrays {  

   /** The "main" Method Starts The Program.   
    *
    * @param commandlineArguments Are Not Used.
    */                
    public static void main(String [ ] commandlineArguments){
      //Declare An Array.
      Integer[ ] examScores;
      
      //Instatiate An Array.
      //Convenient To Use A Constant For Later Use In Loops.
      final Integer SIZE = 6; 
      examScores = new Integer[SIZE];
      
      //Display An Array.
      System.out.println("exam scores: ");
      System.out.println("index(subscript)  value(element)");
      for (int i=0; i < SIZE; i++){
        System.out.println("     " + i + "              " + examScores[i]);
      }
      System.out.println();
      
      //Initialize An Array.
      examScores[0] = new Integer(80);
      examScores[1] = new Integer(77);
      examScores[2] = new Integer(92);
      examScores[3] = new Integer(80);
      examScores[4] = new Integer(63);
      examScores[5] = new Integer(95);
      
      //Display An Array.
      System.out.println("exam scores: ");
      System.out.println("index(subscript)  value(element)");
      for (int i=0; i < examScores.length; i++){
         System.out.println("     " + i + "              " + examScores[i]);
      }
      System.out.println();
      
      //Initializer List (Declare, Instantiate, & Initialize An Array)
      Double[] finalGrades = {new Double(83.33), new Double(73.56), new Double(91.29),
        new Double(55.55), new Double(67.02), new Double(83.33)};
      
      //Print Both Arrays.
       System.out.println("exam scores       final grades");
       for (int i=0; i < SIZE; i++){
          System.out.println("     " + examScores[i] + "              " + finalGrades[i]);
       }
       System.out.println();
      
      //Out Of Bounds Error
       try {
         for (int i=0; i <= examScores.length; i++) {
             System.out.print(examScores[i] + ", ");
           }
         }
        catch(ArrayIndexOutOfBoundsException exception){
          String message = exception.toString();
          System.out.println(message);
          message = "ERROR: The array went out of bounds!";
          System.out.println(message);
        }
      }
   }
{% endhighlight %}

File: 

  * [ArraysLoopsModulus.java](../examples/ArraysLoopsModulus.java)

Source code:

{% highlight java %}
/** 
 *  Array Initialization with Loops & Modulus Examples.
 *
 *  @author William Albritton 
 */
public class ArraysLoopsModulus{
/**
 * The "main" Method Starts The Program.
 *
 * @param commandlineArguments Are Not Used.
 */      
   public static void main(String [ ] commandlineArguments){ 
      //Declare  & Instatiate an Array of 10 integers
      Integer[ ] arrayOf10Integers = new Integer[10];
      
      //initialize the array to the powers of 2
      Integer powersOf2 = new Integer(1); 
      for(int i=0;i<arrayOf10Integers.length;i++){
         arrayOf10Integers[i] = powersOf2;
         //multiply again by 2
         powersOf2 = powersOf2 * 2;
      }
      //display the powers of 2  
      System.out.println("The first 10 powers of 2 are: ");
      for(int i=0;i<arrayOf10Integers.length;i++){
         System.out.print(arrayOf10Integers[i] + ", ");
      }  
      System.out.println();
      System.out.println();
      
      //examples of integer division and modulus  
      Integer numerator = new Integer(0);
      Integer denominator = new Integer(2);
      System.out.println("Examples of integer division and modulus.");
      System.out.println("Modulus is the remainder of a division.");
      System.out.println("Note that EVEN numbers always have 0 for the modulus when divided by 2.");
      System.out.println("Note that ODD numbers always have 1 for the modulus when divided by 2.");
      
      for(int i=0; i<10; i++){
         numerator = i;
         System.out.println(numerator + "/" + denominator + "=" + (numerator / denominator));
         System.out.println(numerator + "%" + denominator + "=" + (numerator % denominator));
         System.out.println();
      }      
   }
} 
{% endhighlight %}
  
  