   import javax.swing.JOptionPane;
/**
* Shows an example of a JOptionPane.showOptionDialog() menu
* @author William McDaniel Albritton
*/	
    public class MenuExample{
   /**Main method displays an example JOptionPane.showOptionDialog() menu 
    * @param arguments Commandline arguments not used */
       public static void main(String[] args) {
       // list of choices (array of Strings)
         String[] array = { "Choice #0", "Choice #1", "Choice #2",
               "Choice #3", "Choice #4", "Choice #5"};
         int choice = 0;
      // display loop   
         while (choice != array.length-1) {
            choice = JOptionPane.showOptionDialog(null, // put in center of screen
               "Press a Button", // message to user
               "Example Menu", // title of window
               JOptionPane.YES_NO_CANCEL_OPTION, // type of option
               JOptionPane.QUESTION_MESSAGE, // type of message
               null, // icon
               array, // array of strings
               array[array.length - 1]); // default choice (last one)
            JOptionPane.showMessageDialog(null, "Your pressed button #" + choice);
         }
      }
   }
   