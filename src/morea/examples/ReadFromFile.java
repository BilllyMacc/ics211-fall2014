   import java.util.Scanner;
   import java.io.File;
   import java.io.FileNotFoundException;
/** 
 *  Shows How To Read from a File.
 *  @author William Albritton 
 */
    public class ReadFromFile {
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
         //connect to file (does NOT create new file)
            File file = new File(commandlineArguments[0]);
            Scanner inputFromFile = null;
            try {
               inputFromFile = new Scanner(file);
            } 
                catch (FileNotFoundException exception) {
               //Print error message.
               //In order to print double quotes("), 
               //the escape sequence for double quotes (\") must be used.
                  System.out.print("ERROR: File not found for \"");
                  System.out.println(commandlineArguments[0]+"\"");
               }        
         //if made connection to file, read from file
            if(inputFromFile != null){
            //In order to print double quotes("), 
            //the escape sequence for double quotes (\") must be used.				
               System.out.print("Reading from file \"" 
                  + commandlineArguments[0] + "\":\n");
            //keeps looping if file has more lines..
               while (inputFromFile.hasNextLine()) {
               //get a line of text..
                  String line = inputFromFile.nextLine();
               //display a line of text to screen..
                  System.out.println(line);
               }
            }//end of "if" for connecting to file
         }//end of "else" for commandlineArguments
      }//end of main() method				
   }//end of class	

