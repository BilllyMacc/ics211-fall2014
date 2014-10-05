import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;

/**
 * A console menu for a grocery list (add, edit, remove, & display items) Note that each string in
 * file database.csv has to separated by a comma and a space (", ") or the program cannot read from
 * file database.csv
 * 
 * @author William McDaniel Albritton
 */
public class GroceryMenu {

  // data fields:
  // linked list of items
  private ListInterface<Item> groceryList = new LinkedList<Item>();
  // name of the database (file that stores all data in grocery list)
  private String database = new String("database.csv");

  /**
   * No-parameter constructor
   */
  public GroceryMenu() {
    // data fields already initialized
  }

  /**
   * Starts the menu.
   * 
   * @param args Not used
   */
  public static void main(String[] args) {
    // Cannot use driver program to test GroceryMenu class,
    // instead use database and user input.

    // Instantiate menu and display menu
    GroceryMenu menu = new GroceryMenu();
    menu.displayLoop();
  }

  /**
   * Displays a menu, asks for choice, executes choice.
   */
  public void displayLoop() {
    try {
      this.readFromDatabase();
    }
    catch (Exception exception) {
      JOptionPane.showMessageDialog(null, exception);
    }
    // list of choices
    String[] choices = { "Add Item", "Edit Item", "Remove Item", "Display List", "Exit Program" };
    // display loop
    int theChoice = 0;
    while (theChoice != choices.length) {
      // add 1, because start at 0
      theChoice = 1 + JOptionPane.showOptionDialog(null, // put in center
          // of screen
          "Select a Command", // message to user
          "Shopping List Main Menu", // title of window
          JOptionPane.YES_NO_CANCEL_OPTION, // type of option
          JOptionPane.QUESTION_MESSAGE, // type of message
          null, // icon
          choices, // array of strings
          choices[choices.length - 1]); // default choice (last one)
      // add to list
      if (1 == theChoice) {
        try {
          this.addToList();
        }
        catch (Exception exception) {
          // "null" puts message in center of screen
          JOptionPane.showMessageDialog(null, "Unable to add item to grocery list.");
        }
      }
      // edit the list
      else if (2 == theChoice) {
        try {
          this.editList();
        }
        catch (Exception exception) {
          JOptionPane.showMessageDialog(null, "Unable to edit item in grocery list.");
        }
      }
      // remove from list
      else if (3 == theChoice) {
        try {
          this.removeFromList();
        }
        catch (Exception exception) {
          JOptionPane.showMessageDialog(null, "Unable to remove item from grocery list.");
        }
      }
      // display the list
      else if (4 == theChoice) {
        this.displayList();
      }// last if statement
    }// end of while loop
     // before exit program, write grocery data to database
    try {
      this.writeToDatabase();
    }
    catch (Exception exception) {
      JOptionPane.showMessageDialog(null, exception);
    }
  }// end of displayLoop()

  /**
   * Prompt user for item & add item to the list.
   */
  private void addToList() {
    // get user input
    String name = JOptionPane.showInputDialog("Enter item's name");
    String numberString = JOptionPane.showInputDialog("Enter item's number");
    // convert string to integer
    int numberInteger = Integer.parseInt(numberString);
    // instantiate item and add to list
    Item groceryItem = new Item(name, numberInteger);
    groceryList.add(groceryItem);
  }

  /**
   * Prompt user for item's position and item's number; and edit item in the list.
   */
  private void editList() {
    // get user input
    String positionString = JOptionPane.showInputDialog("Enter item's position in the list");
    // convert from String to an Integer
    Integer positionInteger = Integer.parseInt(positionString);
    // get grocery item
    Item groceryItem = groceryList.get(positionInteger);
    // get item's number
    String numberString = JOptionPane.showInputDialog("Enter item's number");
    // convert from String to an Integer
    Integer numberInteger = Integer.parseInt(numberString);
    // edit item
    groceryItem.setNumber(numberInteger);
  }

  /**
   * Prompt user for item's position in list & remove from list.
   */
  private void removeFromList() {
    // get user input
    String number = JOptionPane.showInputDialog("Enter item's position");
    // convert from string to integer
    int position = Integer.parseInt(number);
    // remove item
    groceryList.remove(position);
  }

  /**
   * Display list.
   */
  private void displayList() {
    String message = "position, name, number \n" + groceryList.toString();
    JOptionPane.showMessageDialog(null, message);
  }

  /**
   * read grocery list from database and store in list.
   * 
   * @exception FileNotFoundException if cannot find the specified file
   */
  private void readFromDatabase() throws FileNotFoundException {
    // Connect to the file in the current directory
    File fileConnection = new File(database);
    // may throw FileNotFoundException
    Scanner fileReader = new Scanner(fileConnection);
    // declare variables
    String position;
    String name;
    String number;
    // get rid of 1st line

    String line = fileReader.nextLine();
    // while the file still has more lines in it
    while (fileReader.hasNextLine()) {
      // read one full line from the file
      line = fileReader.nextLine();
      // Breaks the line into tokens (words, numbers, etc.)
      // Each token separated by comma and a space (", ")
      Scanner tokenInput = new Scanner(line).useDelimiter(", ");
      // returns 1st token (all characters up to the first comma)
      position = tokenInput.next();
      // returns 2nd token (2nd column in csv file)
      name = tokenInput.next();
      // returns 3rd token
      number = tokenInput.next();
      // instantiate new item
      Item newItem = new Item(name, Integer.parseInt(number));
      // add new item to grocery list
      groceryList.add(newItem);
    }// end of while loop
    fileReader.close();
  }// end of readFromDatabase()

  /**
   * write grocery list from list and store in database.
   * 
   * @exception FileNotFoundException if cannot find the specified file
   */
  private void writeToDatabase() throws FileNotFoundException {
    // make connection to database
    PrintWriter fileWriter = new PrintWriter(database);
    // write to file: title of each column (top row)
    fileWriter.println("position, name, number");
    // write to file: all the data in the list
    String allData = groceryList.toString();
    // loop from 0 to lenght of string
    for (int i = 0; i < allData.length(); i++) {
      // isolate a single character
      String character = allData.substring(i, i + 1);
      // Since class PrintWriter will not create a newline in a file for "\n",
      // we have to use println() instead of "\n"
      if (character.equals("\n")) {
        fileWriter.println();
      }
      // otherwise, we write all other characters to the file
      else {
        fileWriter.print(character);
      }
    }
    // don't forget to close the file connection!
    // may not write to file if not closed!
    fileWriter.close();
  }// end of writeToDatabase()

}// end of class

