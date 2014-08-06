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
   
   