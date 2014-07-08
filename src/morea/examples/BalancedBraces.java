//for GUI dialogue windows
   import javax.swing.JOptionPane; 
   import java.util.EmptyStackException;
   import java.util.Scanner;
   import java.io.File;
   import java.io.FileNotFoundException;   

/**
* Checks for balanced curly braces using a stack
* @author William McDaniel Albritton 
*/		   
    public class BalancedBraces{
   
   /**
    * Tests if the curly braces are balanced
    * @param fileContents a string with the file contents
    * @return true/false if balanced/NOT balanced 
    */
       public static boolean isBalanced(String fileContents){
       //instantiate a stack of strings
         StackInterface<String> stack = new LinkedStack<String>();
      //keep looping, while balanced and not at end of string   
         for(int i=0; i < fileContents.length(); i++){
         //isolate each character
            String character = fileContents.substring(i, i+1);
         //if left brace, push on stack   
            if(character.equals("{")){
               stack.push("{"); 
            }
            //if right brace, pop stack 
            else if(character.equals("}")){
            //might have too many right braces
            //so have to check for empty stack
               try{
                  String brace = stack.pop(); 
               }
                   catch(EmptyStackException exception){
                     System.out.println("Too many RIGHT braces (or too few left braces)."); 
                     return false;
                  }
            }
         }
         //if stack is empty, then balanced
         if(stack.empty()){
            return true;
         }
         //otherwise, too many left braces
         else{
            System.out.println("Too many LEFT braces (or too few right braces).");
            return false;
         }
      }
   
   /**
    * The "main" Method Starts The Program.
    * @param commandlineArguments The 1st Arugment Is The File Name. 
    */  
       public static void main(String[] commandlineArguments) {
      //Error Checking For Command Line Arguments..
         if(commandlineArguments.length == 0){
            System.out.println("Please enter the file name " +
               "as the 1st commandline argument.");
         }
         else{
         //call method to read from file
         //and store file contents in a string
            String fileContents = BalancedBraces.readFromFile(commandlineArguments[0]);
            String output = "Program " + commandlineArguments[0];
            if(BalancedBraces.isBalanced(fileContents)){
               output = output + " has balanced braces";
            }
            else{
               output = output + " does NOT have balanced braces"; 
            } 
            JOptionPane.showMessageDialog(null, output);
         }//end of "else" for commandlineArguments
      }//end of main() method	
      
   /**
   * Reads a file and stores contents in a string
   * @param inputFile is the INPUT File     
   * @return a string with the file contents
   */
       public static String readFromFile(String inputFile) {
         //connect to file (does NOT create new file)
         File file = new File(inputFile);
         Scanner scanFile = null;
         try {
            scanFile = new Scanner(file);
         } 
             catch (FileNotFoundException exception) {
               //Print error message.
               //In order to print double quotes("), 
               //the escape sequence for double quotes (\") must be used.
               System.out.print("ERROR: File not found for \"");
               System.out.println(inputFile+"\"");
            	//if no file, quit program
               System.exit(1);
            }        
         //if made connection to file, read from file
         String fileContents = new String();
      //keeps looping if file has more lines..
         while (scanFile.hasNextLine()) {
         //get a line of text..
            String line = scanFile.nextLine();
         //keep adding each line to end of string
            fileContents = fileContents + line;
         }
         return fileContents;
      }
      
   }//end of classs
   
	
   
