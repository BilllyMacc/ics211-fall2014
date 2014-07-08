/** 
 *  Outputs the command line arguments, if any.
 *  @author William Albritton 
 */
public class Repeat {
    /**
     * The "main" Method Starts The Program.
     * @param args (commandline arguments) are printed to the screen
     */
    public static void main(String[ ] args) {
        //check for commandline arguments.
        //If "args" Array Of Strings Has Length Zero, 
        //Then There Are NO Commandline Arguments.
        if(args.length == 0){
            System.out.println("NO commandline arguments entered.");
        }
        else {
            //Otherwise, Loop Through All The CommandLine Arguments 
            //Stored in Array of Strings "args".
            for(int i=0; i<args.length; i++){
                System.out.print("args[" + i + "]");
                System.out.println(" = \"" + args[i] + "\"");
            }//end of for
        }//end of else
    }//end of main
}//end of class

