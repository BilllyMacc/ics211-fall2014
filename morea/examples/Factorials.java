/** 
 *  Calculates and displays the factorial 
 *  for an number entered on the command line.
 *  Both Iterative and Recursive methods are used.  
 *  @author William McDaniel Albritton 
 */
    public class Factorials{
    
   /**
   * Program starts here
   * @param args The 1st commandline argument should be a non-negative number
   */
       public static void main(String[ ] args) {
      // check for correct number of args (at least 1)
         if (args.length == 0) {
            System.out.print("Error: You must enter at least 1 commandline argument ");
         } 
         else {
         // initialize variables
            Integer number = new Integer(0);
         
         // error checking to see if it is an integer
            try {
               number = Integer.parseInt(args[0]);
            } 
                catch (NumberFormatException exception) {
                  System.out.print(exception);
                  System.out.println(" is not an integer");
                  System.exit(1); // end program
               }
         // call iterative method
            Integer result = Factorials.iterative(number); //A (return address)
         // error checking to see if it is non-negative
            if (result.equals(-1)) {
               System.out.println("ERROR: Negative integers are undefined for factorials!");
            }
            else{ 
               System.out.println(number + "! = " + result);
            }
         // call recursive method   
            Integer result2 = Factorials.recursive(number); //B (return address)
         // error checking to see if it is non-negative
            if (result2.equals(-1)) {
               System.out.println("ERROR: Negative integers are undefined for factorials!");
            }
            else{ 
               System.out.println(number + "! = " + result2);
            }
         }
      }// end of main
   
   /**
    * Computes the factorial of a nonnegative number with iteration (loops)
    * @param number is a nonnegative integer
    * @return the factorial of number, or -1 for negative integers (error)
    */
       public static Integer iterative(Integer number) {
       //check for negative integers
         if(number < 0){
            return -1; //error condition
         }
       //by mathematical definition, 0! = 1
         if(number.equals(0)){
            return 1;
         }
       //need to use integer variable to store product
         Integer product = new Integer(1);
       //loop from "n" to 1, count down by 1
         for (int i = number; i >= 1; i--) {
         //multiply "n" times to get factorial result
            product = product * i;
         }
         //return result of factorial
         return product;
      }//end of iterative
   
   /**
    * Computes the factorial of a nonnegative number with recursion
    * @param number is a nonnegative integer
    * @return the factorial of number, or -1 for negative integers (error)
    */
       public static Integer recursive(Integer number) {
       //base case #1: check for negative integers
         if(number < 0){
            return -1; //error condition
         }
         //base case #2: by mathematical definition, 0! = 1
         else if(number.equals(0) || number.equals(1)){
            return 1;
         }
         else{
         //recursive case: return n * (method call for n-1)
         //we must make the problem smaller by subtracting one! 
            return number * Factorials.recursive(number-1); //C (return address)
         }
      }//end of recursive 
   
   }//end of class

