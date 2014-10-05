---
title: "LinkedList.java"
published: true
morea_id: reading-materials-LinkedList
morea_summary: "A generic list of linked nodes"
morea_type: reading
morea_sort_order: 2
morea_labels:
---

File: 

  * [LinkedList.java](../examples/LinkedList.java)

Source code:

{% highlight java %}
/**
 * A generic list of linked nodes
 * 
 * @author William McDaniel Albritton
 */
public class LinkedList<T> implements ListInterface<T> {

  // reference to first node in the linked list (linked nodes)
  protected Node<T> head = null;
  // Total number of items, which is used
  // for error checking and node removal.
  protected Integer size = new Integer(0);

  public LinkedList() {
    // no code, because data fields already initialized
  }

  /**
   * Adds an item (of any class) to the list
   * 
   * @param item is the object that is added to the list
   */
  public void add(T item) {
    // case 1: if empty list
    if (head == null) {
      // list is empty, so add to beginning of list
      // make new node and assign to head of list
      head = new Node<T>(item, null);
    }
    // if not empty list
    else {
      // case2: add to end of list
      // current starts at 2nd node in list
      Node<T> previous = head;
      Node<T> current = head.getNext();
      // while not at end of list
      while (current != null) {
        // advance to next node
        previous = current;
        current = current.getNext();
      }
      // Add new node to end of list:
      // Make new node that has "null" for next.
      // A node with "null" is always the last node
      Node<T> node = new Node<T>(item, null);
      // Point previous node (last node) to new node
      previous.setNext(node);
    }
    // increase size of list
    size++;
  }

  /**
   * Gets an item (address to an item) from the list.
   * 
   * @param position The position of an item in the list.
   * @returns the address to the requested item
   * @exception ItemException if an item does not exist at that position
   */
  public T get(Integer position) throws ListException {
    // check if empty list
    if (head == null) {
      throw new ListException("Cannot get an item from an empty list!");
    }
    // if position is outside range, throw exception
    if (position < 1 || position > size) {
      throw new ListException(position + " is outside list range!");
    }
    // Find node:
    // counter to keep track of loops
    Integer counter = new Integer(1);
    // point to current node
    Node<T> current = head;
    while (!counter.equals(position)) {
      // BAD CODE: while(counter != position){
      // goto next node for current pointer
      current = current.getNext();
      // add 1 to counter
      counter++;
    }
    // return the data (item) stored by the node
    return current.getData();
  }

  /**
   * Removes an item from a list.
   * 
   * @param position The position of an item in the list.
   * @exception ItemException if an item does not exist at that position
   */
  public void remove(Integer position) throws ListException {
    // check if empty list
    if (head == null) {
      throw new ListException("cannot remove from empty list");
    }
    // if position is outside range, throw exception
    if (position < 1 || position > size) {
      throw new ListException(position + " is outside list range.");
    }
    // if at beginning of list
    if (position.equals(1)) {
      // remove 1st node
      head = head.getNext();
    }
    // if not at beginning of list
    else {
      // Find node:
      // point previous to 1st node
      Node<T> previous = head;
      // point current to 2nd node
      Node<T> current = head.getNext();
      // loop position-2 number of times
      for (int i = 2; i < position; i++) {
        // goto next node for previous and current
        previous = current;
        current = current.getNext();
      }
      // Point the previous node to node after current node.
      // This "skips" over one node, thus removing it!
      previous.setNext(current.getNext());
    }
    // decrease size of list
    size--;
  }

  /**
   * Automatically called by println() or print()
   * 
   * @return a String of the List in CSV (comma separated values) format
   */
  public String toString() {
    // instantiate empty string
    String csvFormat = new String("");
    // display position of each item to user
    Integer position = new Integer(1);
    // loop through all the nodes in linked list
    for (Node<T> current = head; current != null; current = current.getNext()) {
      // keep adding to end of string
      csvFormat = csvFormat + position + ", " + current.toString() + "\n";
      // add one to position for each loop
      position++;
    }
    return csvFormat;
  }

  /**
   * This Is An "Accessor" Method - Used To Get A Data Field.
   * 
   * @return the size of the list
   */
  public Integer getSize() {
    return size;
  }

  /**
   * Method main is used as a driver to test the class.
   * 
   * @param args Not used.
   */
  public static void main(String[] args) {
    // Test list of Strings:
    // test construtor
    System.out.println("test construtor");
    ListInterface<String> list = new LinkedList<String>();
    // test toString() for empty list
    System.out.println("empty list: " + list.toString());
    String letter = new String("A");
    // test add
    System.out.println("test add() 1 node");
    list.add(letter);
    // test toString() for list of 1
    System.out.println("list of 1:\n" + list.toString());
    // test add() for several nodes
    System.out.println("test add() several nodes");
    letter = new String("B");
    list.add(letter);
    letter = new String("C");
    list.add(letter);
    letter = new String("D");
    list.add(letter);
    // test toString() for empty list of many
    System.out.println("list of many:\n" + list.toString());
    // test get
    Integer currentSize = list.getSize();
    letter = list.get(currentSize);
    System.out.println("test get(), letter: " + letter);
    // test remove
    System.out.println("remove #1, 3: ");
    list.remove(3);
    list.remove(1);
    System.out.println(list.toString());
    // test remove
    System.out.println("remove #2, 1: ");
    list.remove(2);
    list.remove(1);
    System.out.println(list.toString());

    // Test list of Items
    // test constructor
    ListInterface<Item> list2 = new LinkedList<Item>();
    // test add
    Item item = new Item("chopsticks", 10);
    list2.add(item);
    item = new Item("eel", 20);
    list2.add(item);
    item = new Item("carrot", 30);
    list2.add(item);
    item = new Item("doughnut", 40);
    list2.add(item);
    item = new Item("banana", 50);
    list2.add(item);
    item = new Item("zucchini", 60);
    list2.add(item);
    System.out.println(list2.toString());

    // test remove
    System.out.println("remove #6, 1, 3: ");
    list2.remove(6);
    list2.remove(1);
    list2.remove(3);
    System.out.println(list2.toString());

    // test get
    System.out.println("test get() and setNumber() #1, 3: ");
    item = list2.get(1);
    item.setNumber(999);
    currentSize = list2.getSize();
    item = list2.get(currentSize);
    item.setNumber(555);
    System.out.println(list2.toString());

    // test exceptions
    try {
      System.out.println("test remove() for size+1");
      currentSize = list2.getSize();
      list2.remove(currentSize + 1);
    }
    catch (ListException exception) {
      System.out.println(exception.toString());
    }
    try {
      System.out.println("test get() for 0");
      item = list2.get(0);
    }
    catch (ListException exception) {
      System.out.println(exception.toString());
    }

    // code from slides on get() method
    ListInterface<Item> list3 = new LinkedList<Item>();
    list3.add(new Item("negi", 5));
    list3.add(new Item("natto", 7));
    Item food = list3.get(2);
    food.setNumber(9);
    System.out.println(list3.toString());
  }// end of main

}// end of class

/*
 * PROGRAM OUTPUT: 

test construtor
empty list: 
test add() 1 node
list of 1:
1, A

test add() several nodes
list of many:
1, A
2, B
3, C
4, D

test get(), letter: D
remove #1, 3: 
1, B
2, D

remove #2, 1: 

1, chopsticks, 10
2, eel, 20
3, carrot, 30
4, doughnut, 40
5, banana, 50
6, zucchini, 60

remove #6, 1, 3: 
1, eel, 20
2, carrot, 30
3, banana, 50

test get() and setNumber() #1, 3: 
1, eel, 999
2, carrot, 30
3, banana, 555

test remove() for size+1
ListException: 4 is outside list range.
test get() for 0
ListException: 0 is outside list range!
1, negi, 5
2, natto, 9
 
  */
{% endhighlight %}
  
  