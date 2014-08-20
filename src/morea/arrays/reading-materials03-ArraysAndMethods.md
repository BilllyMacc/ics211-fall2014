---
title: "ArraysAndMethods.java"
published: true
morea_id: reading-materials03-ArraysAndMethods
morea_summary: "Creates & displays an array of Strings using methods"
morea_type: reading
morea_sort_order: 3
morea_labels:
---

# ArraysAndMethods.java

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
