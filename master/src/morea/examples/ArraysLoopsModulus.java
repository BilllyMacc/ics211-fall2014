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

