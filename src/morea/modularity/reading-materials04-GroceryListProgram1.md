---
title: "GroceryListProgram1.java"
published: true
morea_id: reading-materials04-GroceryListProgram1
morea_summary: "Implements a Grocery List Version 1: Has code for main() and displayMenu() methods"
morea_type: reading
morea_sort_order: 4
morea_labels:
---
# GroceryListProgram1.java

File:

  * [GroceryListProgram1.java](../examples/GroceryListProgram1.java)

Source code:

{% highlight java %}
import java.util.Scanner;

/**
 * Implements a Grocery List Version 1: Has code for main() and displayMenu() methods
 * 
 * @author William McDaniel Albritton
 */
public class GroceryListProgram1 {
  /**
   * The main() Method Starts The Program.
   * 
   * @param commandlineArguments 1st argument is INPUT File, 2nd argument is OUTPUT File
   */
  public static void main(String[] commandlineArguments) {
    // Error Checking For 2 Command Line Arguments..
    if (commandlineArguments.length < 2) {
      System.out.println("Please enter the INPUT file name as "
          + " the 1st commandline argument.");
      System.out.println("Please enter the OUTPUT file name as "
          + " the 2nd commandline argument.");
    }// end of if
     // if no commandline argument errors, continue program
    else {
      // read grocery items from file & store in array for grocery list
      String groceryList[] = GroceryListProgram1
          .readFromFile(commandlineArguments[0]);
      // size of grocery list
      Integer size = groceryList.length;
      // user's choice
      Integer choice = new Integer(0);
      // choice for ending program
      final Integer QUIT = new Integer(4);
      // if the user does not want to QUIT, keep looping
      while (!choice.equals(QUIT)) {
        // get the user's choice
        choice = GroceryListProgram1.displayMenu();
        // add grocery item
        if (choice.equals(1)) {
          size = GroceryListProgram1.add(groceryList, size);
        }
        // delete grocery item
        else if (choice.equals(2)) {
          size = GroceryListProgram1.delete(groceryList, size);
        }
        // display grocery item
        else if (choice.equals(3)) {
          GroceryListProgram1.display(groceryList, size);
        }
      }// end of "while"
       // write to from grocery list array to OUTPUT file
      GroceryListProgram1.writeToFile(commandlineArguments[1], groceryList,
          size);
    }// end of "else"
  }// end of main() method

  /**
   * Displays the menu for the program and returns user's choice
   * 
   * @return the choice of the user
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
    Integer choiceOfUser = keyboardInput.nextInt();
    return choiceOfUser;
  }

  /**
   * Reads grocery items from a file and stores items in an array
   * 
   * @param inputFile is the INPUT File
   * @return an array of grocery items
   */
  public static String[] readFromFile(String inputFile) {
    // method stub
    System.out.println("readFromFile method");
    // return empty array
    return new String[0];
  }

  /**
   * Adds a grocery item to an array
   * 
   * @param list is the grocery list
   * @param listSize is the size of the grocery list
   * @return new size of the grocery list
   */
  public static Integer add(String[] list, Integer listSize) {
    // method stub
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
    // method stub
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
    // method stub
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
    // method stub
    System.out.println("writeToFile method");
  }

}// end of class
{% endhighlight %}

