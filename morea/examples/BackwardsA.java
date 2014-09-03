 /** 
 *  Writes a word backwards using iteration & recursion
 *  @author William McDaniel Albritton 
 */ 
    public class Backwards{     
    
   /**
   * Program starts with this method
   * @param args The 1st commandline argument should be String to be printed backwards
   */       
       public static void main(String [] arguments) {  
         if(arguments.length == 0){
            System.out.println("ERROR: Please enter at least one commandline argument.");
         }
         else{   
            String word = arguments[0];
            System.out.print("Iterative solution: ");
            Backwards.iterativeBack(word); //A (return address)
            System.out.print("\n\nRecursive solution: ");
            Backwards.recursiveBack(word); //B (return address)
            System.out.print("\n\nRecursive solution2: ");
            Backwards.recursiveBack2(word); //C (return address)
            System.out.println();
         }
      }
      
   /**
   * Writes a character string backward using iteration.
   * @param string a character string
   */
       public static void iterativeBack(String string) {     
         int length = string.length();
         for(int i = length-1; i >= 0; i--){
            System.out.print(string.substring(i, i+1));
         }  
      }
          
   /**
   * Writes a character string backward using recursion.
   * @param string a character string
   */
       public static void recursiveBack(String string) {     
         int length = string.length();
      //base case: output string if only has one character
         if(length == 1){
            System.out.print(string);
         }
         //recursive case: display last character,
         //then call method again with shorter string
         //that has the last character cut off
         else {
            System.out.print(string.substring(length-1, length)); 
            Backwards.recursiveBack(string.substring(0, length-1)); //D (return address)
         }//end of else  
      }//end of recursiveBack()  
      
   /**
   * Writes a character string backward using recursion.
   * @param string a character string
   */
       public static void recursiveBack2(String string) {     
         int length = string.length();
      //base case: output string if only has one character
         if(length == 1){
            System.out.print(string);
         }
         //recursive case: call method again with shorter string
         //that has the first character cut off,
         //then display first character
         else {
            Backwards.recursiveBack2(string.substring(1, length)); //E (return address)
            System.out.print(string.substring(0, 1)); 
         }//end of else  
      }//end of recursiveBack2()  
		
   }//end of class     




