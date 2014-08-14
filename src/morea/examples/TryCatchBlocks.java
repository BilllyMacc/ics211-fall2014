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
