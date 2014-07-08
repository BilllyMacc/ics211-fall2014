/**
* Demonstrates a NullPointerException
* @author William McDaniel Albritton
*/
    public class NullPointerProgram{
      
   /**main() method: begins program
    * @param arguments is not used */
       public static void main(String[] arguments) {
      
         Integer x = new Integer(5); //initialize variable
         x = null; //set the address to nothing
         String str = x.toString(); //throws NullPointerException
         System.out.println(str); 
            
      }//End of Main.
     
   }//End of Class.
   
	
