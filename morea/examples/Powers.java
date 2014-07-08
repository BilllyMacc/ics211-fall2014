/** 
 *  Calculates and displays the result of x to y power 
 *  for two integers entered on the command line.
 *  Both Iterative and Recursive methods are used.  
 *  @author William McDaniel Albritton 
 */
    public class Powers{
    
   /**
   * Program starts here
   * @param commandlineArguments The 1st and 2nd commandline argument should be a non-negative number
   */
       public static void main(String[ ] commandlineArguments) {
      // check for correct number of commandlineArguments (at least 2)
         if (commandlineArguments.length <= 1) {
            System.out.print("Error: You must enter at least 2 commandline arguments!");
         } 
         else {
         // initialize variables
            Integer x = new Integer(0);
            Integer y = new Integer(0);
         // error checking to see if it is an integer
            try {
               x = Integer.parseInt(commandlineArguments[0]);
            } 
                catch (NumberFormatException exception) {
                  System.out.print(exception);
                  System.out.println(" is not an integer!");
                  System.exit(1); // end program
               }
                  // error checking to see if it is an integer
            try {
               y = Integer.parseInt(commandlineArguments[1]);
            } 
                catch (NumberFormatException exception) {
                  System.out.print(exception);
                  System.out.println(" is not an integer!");
                  System.exit(1); // end program
               }      
         // call iterative method
            Integer result = Powers.iterative(x, y); //A (return address)
         // error checking to see if it is non-negative
            if (result.equals(-1)) {
               System.out.println("ERROR: Negative integers are undefined for this power function!");
            }
            else{ 
               System.out.println(x + "^" + y + " = " + result);
            }
         // call recursive method   
            result = Powers.recursive(x, y); //B (return address)
         // error checking to see if it is non-negative
            if (result.equals(-1)) {
               System.out.println("ERROR: Negative integers are undefined for this power function!");
            }
            else{ 
               System.out.println(x + "^" + y + " = " + result);
            }
         }
      }// end of main
   
   /**
    * Computes the power of a nonnegative numbers with iteration (loops)
    * @param x is a nonnegative integer (base)
    * @param y is a nonnegative integer (exponent)
    * @return the result of x to the power of y (x^y), or -1 for negative integers (error)
    */
       public static Integer iterative(Integer x, Integer y) {
       //check for negative integers
         if(x < 0 || y < 0){
            return -1; //error condition
         }
       //by mathematical definition, x^0 = 1
         if(y.equals(0)){
            return 1;
         }
       //need to use integer variable to store product
         Integer product = new Integer(1);
       //loop from 1 to y, count up by 1
         for (int i = 1; i <= y; i++) {
         //multiply x, y times to get power result
            product = product * x;
         }
         //return result of power
         return product;
      }//end of iterative
   
   /**
    * Computes the power of a nonnegative numbers with recursion
    * @param x is a nonnegative integer (base)
    * @param y is a nonnegative integer (exponent)
    * @return the result of x to the power of y (x^y), or -1 for negative integers (error)
    */
       public static Integer recursive(Integer x, Integer y) {
       //base case #1: check for negative integers
         if(x < 0 || y < 0){
            return -1; //error condition
         }
         //base case #2: by mathematical definition, x^0 = 1
         if(y.equals(0)){
            return 1;
         }
         //recursive case: return x * (method call for y-1)
         //we must make the problem smaller by subtracting one! 
         return x * Powers.recursive(x, y-1); //C (return address)
      }//end of recursive 
   
   }//end of class

