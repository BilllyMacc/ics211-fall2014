 /**
 *  Writes a word backwards using iteration & recursion
 *  The results are returned to the main() method and printed there
 *  @author William McDaniel Albritton
 */
    public class Backwards2{
   
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
            String backwards = Backwards2.iterativeBack(word); //A (return address)
            System.out.print("Iterative solution: " + backwards);
            backwards = Backwards2.recursiveBack(word); //B (return address)
            System.out.print("\n\nRecursive solution: " + backwards);
            backwards = Backwards2.recursiveBack2(word); //C (return address)
            System.out.print("\n\nRecursive solution2: " + backwards);
            System.out.println();
         }
      }
   
   /**
   * Writes a character string backward using iteration.
   * @param string a character string
   * @returns a backwards string
   */
       public static String iterativeBack(String string) {
         int length = string.length();
         String backWord = new String();
         for(int i = length-1; i >= 0; i--){
            backWord = backWord + string.substring(i, i+1);
         }
         return backWord;
      }
   
   /**
   * Writes a character string backward using recursion.
   * @param string a character string
   * @returns a backwards string
   */
       public static String recursiveBack(String string) {
         int length = string.length();
      //base case: output string if only has one character
         if(length == 1){
            return string;
         }
         //recursive case: display last character,
         //then call method again with shorter string
         //that has the last character cut off
         else {
            return string.substring(length-1, length) +
                    Backwards2.recursiveBack(string.substring(0, length-1)); 
               	  //D (return address)
         }//end of else
      }//end of recursiveBack()
   
   /**
   * Writes a character string backward using recursion.
   * @param string a character string
    * @returns a backwards string
   */
       public static String recursiveBack2(String string) {
         int length = string.length();
            //base case: output string if only has one character
         if(length == 1){
            return string;
         }
            //recursive case: call method again with shorter string
            //that has the first character cut off,
            //then display first character
         else {
            return Backwards2.recursiveBack2(string.substring(1, length))
                       + string.substring(0, 1); //E (return address)
         }//end of else
      }//end of recursiveBack2()
   
   }//end of class

