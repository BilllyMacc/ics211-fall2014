import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Implements a Grocery List Version 3: Has code for readFromFile() and
 * writeToFile() methods
 * 
 * @author William McDaniel Albritton
 */
public class GroceryListProgram3 {
  /**
   * The main() Method Starts The Program.
   * 
   * @param commandlineArguments 1st argument is INPUT File, 2nd argument is OUTPUT File
   */
  public static void main(String[] commandlineArguments) {
    // Error Checking For 2 Command Line Arguments..
    if (commandlineArguments.length != 2) {
      System.out.println("Please enter the INPUT file name as "
          + "the 1st commandline argument.");
      System.out.println("Please enter the OUTPUT file name as "
          + "the 2nd commandline argument.");
      System.out.println("Please enter exactly "
          + "two (2) commandline arguments.");
    }// end of if
     // if no commandline argument errors, continue program
    else {
      // Declare and instantiate array of 100 Strings
      final Integer MAX_SIZE = new Integer(100);
      String groceryList[] = new String[MAX_SIZE];
      // Set size of grocery list to zero (0) items
      Integer size = new Integer(0);
      // read grocery items from file & store in array for grocery list
      try {
        size = GroceryListProgram3.readFromFile(commandlineArguments[0],
            groceryList, size);
      } catch (ArrayIndexOutOfBoundsException exception) {
        System.out.print("ERROR: Too many items in input file. ");
        System.out.println("Please limit to " + MAX_SIZE + " items.");
        // Immediately terminates program
        System.exit(1);
      }
      // user's choice for Menu
      Integer choice = new Integer(0);
      // choice for ending program
      final Integer QUIT = new Integer(4);
      // if the user does not want to QUIT, keep looping
      while (!choice.equals(QUIT)) {
        // get the user's choice
        choice = GroceryListProgram3.displayMenu();
        // add grocery item
        if (choice.equals(1)) {
          size = GroceryListProgram3.add(groceryList, size);
        }
        // delete grocery item
        else if (choice.equals(2)) {
          size = GroceryListProgram3.delete(groceryList, size);
        }
        // display grocery item
        else if (choice.equals(3)) {
          GroceryListProgram3.display(groceryList, size);
        }
        // error message
        else if (!choice.equals(QUIT)) {
          System.out
              .println("ERROR: Please enter an integer in the range from 1 to 4");
        }
      }// end of "while"
       // write to from grocery list array to OUTPUT file
      GroceryListProgram3.writeToFile(commandlineArguments[1], groceryList,
          size);
    }// end of "else"
  }// end of main() method

  /**
   * Displays the menu for the program and returns user's choice
   * 
   * @return the choice of the user (if error, returns 0)
   */
  public static Integer displayMenu() {
    // display menu
    System.out.println("\tGROCERY LIST MENU");
    System.out.println("\t Enter 1 to Add");
    System.out.println("\t Enter 2 to Delete");
    System.out.println("\t Enter 3 to Display");
    System.out.println("\t Enter 4 to Quit");
    System.out.print("\tEnter your choice: ");
    // get input from user
    Scanner keyboardInput = new Scanner(System.in);
    Integer choiceOfUser = new Integer(0);
    try {
      // non-integer input will throw InputMismatchException
      choiceOfUser = keyboardInput.nextInt();
    } catch (InputMismatchException exception) {
      // Already have error message in main() method,
      // as choiceOfUser = 0
    }
    return choiceOfUser;
  }

  /**
   * Reads grocery items from a file and stores items in an array
   * 
   * @param inputFile is the INPUT File
   * @param array is the Grocery List array
   * @param size is the number of items in Grocery List
   * @return the new size of the grocery list
   * @throws ArrayIndexOutOfBoundsException if array size is less than number of
   *         items in input file
   */
  public static Integer readFromFile(String inputFile, String[] array,
      Integer size) throws ArrayIndexOutOfBoundsException {
    // connect to file (does NOT create new file)
    File file = new File(inputFile);
    Scanner scanFile = null;
    try {
      scanFile = new Scanner(file);
    } catch (FileNotFoundException exception) {
      // Print error message.
      // In order to print double quotes("),
      // the escape sequence for double quotes (\") must be used.
      System.out.print("ERROR: File not found for \"");
      System.out.println(inputFile + "\"");
    }
    // if made connection to file, read from file
    if (scanFile != null) {
      // keeps looping if file has more lines..
      while (scanFile.hasNextLine()) {
        // get a line of text..
        String line = scanFile.nextLine();
        // display a line of text to screen..
        // System.out.println(line);
        // array[0] stores the first row (headings) to table
        array[size] = line;
        // increment size
        ++size;
      }
      // In order to print double quotes("),
      // the escape sequence for double quotes (\") must be used.
      System.out.println("Read from file \"" + inputFile + "\"\n");
    }// end of "if" for connecting to file
    return size;
  }

  /**
   * Adds a grocery item to an array
   * 
   * @param list is the grocery list
   * @param listSize is the size of the grocery list
   * @return new size of the grocery list
   */
  public static Integer add(String[] list, Integer listSize) {
    System.out.println("add method");
    // we add one to the size (one item to end of list)
    return listSize + 1;
  }

  /**
   * Deletes a grocery item from an array
   * 
   * @param list is the grocery list
   * @param listSize is the size of the grocery list
   * @return new size of the grocery list
   */
  public static Integer delete(String[] list, Integer listSize) {
    System.out.println("delete method");
    // we subtract one from the size (one item deleted from list)
    return listSize - 1;
  }

  /**
   * Displays a grocery list
   * 
   * @param list is the grocery list
   * @param listSize is the size of the grocery list
   */
  public static void display(String[] list, Integer listSize) {
    System.out.println("display method");
  }

  /**
   * Write grocery list array to file
   * 
   * @param list is the grocery list
   * @param listSize is the size of the grocery list
   */
  public static void writeToFile(String outputFile, String[] list,
      Integer listSize) {
    // "PrintWriter" is a Class Used To Write to A File.
    PrintWriter fileWriter = null;
    try {
      /*
       * Must use try-catch block, because PrintWriter may throw
       * FileNotFoundException, which is a checked exception. This will connect
       * to a file in the current directory. If the file does not exists, a new
       * file will be created. If the file does exists, the file will be
       * overwritten.
       */
      fileWriter = new PrintWriter(outputFile);
    } catch (FileNotFoundException exception) {
      // Print error message.
      // In order to print double quotes("),
      // the escape sequence for double quotes (\") must be used.
      System.out.print("ERROR: File not found for \"");
      System.out.println(outputFile + "\"");
    }
    // if file opened successfully, then below code executes..
    // continue program if writeToFile is not "null"
    if (fileWriter != null) {
      // loop through list (grocery list) and write to file
      for (int i = 0; i < listSize; i++) {
        fileWriter.println(list[i]);
      }
      // REMEMBER: always give feedback to the user!
      System.out.println("\nWrote to file \"" + outputFile + "\"");
      // WARNING: don't forget to close the file!
      // will not write to file if not closed!
      fileWriter.close();
    }// end of "if" statement for writeToFile

  }

}// end of class

