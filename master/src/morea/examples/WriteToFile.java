   import java.util.Scanner;
   import java.io.PrintWriter;
   import java.io.FileNotFoundException;
/** 
 *  Shows How To Write to a File.
 *  @author William McDaniel Albritton 
 */
    public class WriteToFile {
    /**
     * The main() Method Starts The Program.
     * @param commandlineArguments The 1st Arugment Is The File Name. 
     */  
       public static void main(String[] commandlineArguments) {	
        //Error Checking For Command Line Arguments..
         if(commandlineArguments.length == 0){
            System.out.println("Please enter the file name as " 
                               + " the 1st commandline argument.");
         }
         else{      
            //"PrintWriter" is a Class Used To Write to A File.
            PrintWriter writeToFile = null;
            try {
            /*
            Must use try-catch block,
            because PrintWriter may throw FileNotFoundException,
            which is a checked exception.
            This will connect to a file in the current directory.
            If the file does not exists, a new file will be created.
            If the file does exists, the file will be overwritten.
            */
               writeToFile = new PrintWriter(commandlineArguments[0]);
            } 
                catch (FileNotFoundException exception) {
               //Print error message.
               //In order to print double quotes("), 
               //the escape sequence for double quotes (\") must be used.
                  System.out.print("ERROR: File not found for \"");
                  System.out.println(commandlineArguments[0]+"\"");
               }
         //if file opened successfuly, then below code executes..
         //continue program if writeToFile is not "null"
            if(writeToFile != null){
            //Scanner is used to get input from keyboard   
               Scanner inputFromKeyboard = new Scanner(System.in);
               System.out.println("Please enter 5 lines of text:");
            //loop 5 times
               for(int i = 0; i<5; i++) {
               //read a line from the user..
                  String line = inputFromKeyboard.nextLine();
               //write same line to file..
                  writeToFile.println(line);
               }
            //REMEMBER: always give feedback to the user!
               System.out.println("\nWrote 5 lines of text to file \"" 
                  + commandlineArguments[0] + "\"");
            //WARNING: don't forget to close the file!
            //will not write to file if not closed!
               writeToFile.close();
            }//end of "if" statement for writeToFile
         }//end of "else" for commandlineArguments
      }//end of main() method	
   }//end of class

