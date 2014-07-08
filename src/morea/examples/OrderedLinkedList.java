/**
 * A generic list of ordered linked nodes
 * 
 * @author William McDaniel Albritton
 * @author Edoardo Biagioni
 */
public class OrderedLinkedList<T extends java.lang.Comparable<T>> extends
		LinkedList<T> {
	/*
	 * Explanation of above line of code: The class we are declaring is
	 * parametrized on a type T which is a subclass of java.lang.Comparable<T>.
	 * The class we are declaring is a subclass of GenericLinkedList<T>. The two
	 * types T must match, as, in this application, it would not make any sense
	 * to derive a OrderedLinkedList from a LinkedList parametrized on a
	 * different type: it would mean the superclass would provide a generic
	 * linked list of one class of objects, but our add method would add an
	 * object of a different class.
	 */
	public OrderedLinkedList() {
		// call super class's constructor
		super();
	}

	/**
	 * Adds an item to the list in order
	 * 
	 * @param item
	 *            The object that is added to the list
	 */
	public void add(T item) {
		// case1: if empty list
		if (head == null) {
			// list is empty, so add to beginning of list
			// make new node and assign to head of list
			head = new Node<T>(item, null);
		}
		// if not empty list
		else {
			// case2: add to beginning of list
			if (item.compareTo(head.getData()) <= 0) {
				// add new node to list
				head = new Node<T>(item, head);
			}
			// case3: add to middle or end of list
			else {
				// start at 2nd node in list
				Node<T> previous = head;
				Node<T> current = head.getNext();
				// while not at end of list and item is greater than current
				while (current != null && item.compareTo(current.getData()) > 0) {
					// advance to current node
					previous = current;
					// advance to next node
					current = current.getNext();
				}
				// add new node to list
				// make new node that points to next node
				Node<T> node = new Node<T>(item, current);
				// point previous node to new node
				previous.setNext(node);
			}
		}
		// increase size of list
		size++;
	}

	/**
	 * Method main is used as a driver to test the class. Note that this is
	 * similar to the OrderedArrayList test!
	 * 
	 * @param args
	 *            Not used.
	 */
	public static void main(String[] args) {
		// test list of Strings
		String name = new String("Nami");
		ListInterface<String> stringList = new OrderedLinkedList<String>();
		stringList.add(name);
		name = new String("Kai");
		stringList.add(name);
		name = new String("Satsuki");
		stringList.add(name);
		name = new String("Chihiro");
		stringList.add(name);
		System.out.println(stringList + "\n");

		// test constructor
		ListInterface<ComparableItem> list = new OrderedLinkedList<ComparableItem>();
		System.out.println(list + "\n");

		// test add
		ComparableItem item = new ComparableItem("fork", 10);
		list.add(item);
		System.out.println(list + "\n");
		item = new ComparableItem("eel", 20);
		list.add(item);
		System.out.println(list + "\n");
		item = new ComparableItem("carrot", 30);
		list.add(item);
		System.out.println(list + "\n");
		item = new ComparableItem("doughnut", 40);
		list.add(item);
		System.out.println(list + "\n");
		item = new ComparableItem("banana", 50);
		list.add(item);
		System.out.println(list + "\n");
		item = new ComparableItem("zucchini", 60);
		list.add(item);
		System.out.println(list + "\n");

		// test remove
		list.remove(6);
		System.out.println(list + "\n");
		list.remove(3);
		System.out.println(list + "\n");
		list.remove(1);
		System.out.println(list + "\n");

		// test exceptions
		try {
			list.remove(50);
		} catch (ListException exception) {
			System.out.println(exception);
		}
	}// end of main()
}// end of class

/*PROGRAM OUTPUT:
1, Chihiro
2, Kai
3, Nami
4, Satsuki




1, fork, 10


1, eel, 20
2, fork, 10


1, carrot, 30
2, eel, 20
3, fork, 10


1, carrot, 30
2, doughnut, 40
3, eel, 20
4, fork, 10


1, banana, 50
2, carrot, 30
3, doughnut, 40
4, eel, 20
5, fork, 10


1, banana, 50
2, carrot, 30
3, doughnut, 40
4, eel, 20
5, fork, 10
6, zucchini, 60


1, banana, 50
2, carrot, 30
3, doughnut, 40
4, eel, 20
5, fork, 10


1, banana, 50
2, carrot, 30
3, eel, 20
4, fork, 10


1, carrot, 30
2, eel, 20
3, fork, 10


ListException: 50 is outside list range. 
 */

