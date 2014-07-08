   import javax.swing.JOptionPane;
/** 
 *  @author William Albritton 
 *  Shows an example of a constructor and the toString() method for a simple class
 */
   public class SimpleClass {
      public static void main(String[ ] args) {
       	//create three President objects
         President president44 = new President("Barack", "Hussein", "Obama");
         President president43 = new President("George", "Walker", "Bush");
         President president42 = new President("William", "Jefferson", "Clinton");
      	
      	//output three President objects
         String programOutput = "The three most recent presidents are:\n" +
            president44.toString() + "\n" + 
            president43.toString() + "\n" +
            president42.toString();
         JOptionPane.showMessageDialog(null, programOutput);
      }
   }//end of class

/*Stores the first, middle, and last names for a president.*/
   class President{
    //data fields that store each object's data
      private String first;
      private String middle;
      private String last;
   	
   /** Constructor - Used To Create EAch Object & Initialize DAta Fields.
   * @param n1 is the President's first name	 
   * @param n2 is the President's middle name 
   * @param n3 is the President's last name
   */   
      public President(String n1, String n2, String n3){
         first = n1;
         middle = n2; 
         last = n3; 
      }
   	
   /**Used to Display The Data Stored In EAch Object's DAta Field.
   * @return a President's name in format: Mr. President First M. Last
   */
      public String toString(){
         String output = "Mr. President " + first + " " + middle.substring(0,1) + " " + last;
         return output;
      }
   }
   
