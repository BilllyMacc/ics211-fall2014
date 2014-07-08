/**
 * A comparable shopping item
 * 
 * @author William McDaniel Albritton
 * @author Edoardo Biagioni
 */
public class ComparableItem extends Item implements
		java.lang.Comparable<ComparableItem> {
	/*
	 * Explanation of above line of code: As well as being derived from Item,
	 * ComparableItem also implements the Comparable interface. The Comparable
	 * interface is parametrized on the type of objects to be compared:
	 * interface Comparable<T> { int compareTo(T object); } In this case, the
	 * objects to be compared to are of type ComparableItem, so the class name
	 * is used to parametrize the interface that this class implements. This is
	 * not confusing if you remember the parameter to the Comparable interface
	 * simply indicates the class of objects to be given to the compareTo method
	 */

	/**
	 * Initializes respective data fields
	 * 
	 * @param name
	 *            is the item's name
	 * @param count
	 *            is the item's count
	 */
	public ComparableItem(String name, int count) {
		super(name, count); // calls Item's constructor
	}

	/**
	 * Compares a ComparableItem to another ComparableItem
	 * 
	 * @param item
	 *            A second ComparableItem
	 */
	public int compareTo(ComparableItem item) {
		// convert names to lowercase
		// "this" is used to reference ComparableItem object's address
		String name1 = this.getName().toLowerCase();
		String name2 = item.getName().toLowerCase();
		// compare the two names (String has its own compareTo() method)
		int result = name1.compareTo(name2);
		return result;
	}

	/**
	 * Method main is used as a driver to test the class
	 * 
	 * @param args
	 *            Not used
	 */
	public static void main(String[] args) {
		// test constructors
		ComparableItem item1 = new ComparableItem("apples", 10);
		System.out.println(item1.toString());
		ComparableItem item2 = new ComparableItem("bananas", 20);
		System.out.println(item2.toString());

		// Set & get methods already tested in Item's main method,
		// so no need to test them here.

		// test compareTo method
		System.out.println("item1=" + item1.toString());
		System.out.println("item2=" + item2.toString());
		System.out.println("item1.compareTo(item2)=" + item1.compareTo(item2));
		System.out.println("item2.compareTo(item1)=" + item2.compareTo(item1));
		ComparableItem item3 = new ComparableItem("BananaS", 20);
		System.out.println("item3=" + item3.toString());
		System.out.println("item2.compareTo(item3)=" + item2.compareTo(item3));
		ComparableItem item4 = new ComparableItem("bananas", 100);
		System.out.println("item4=" + item4.toString());
		System.out.println("item2.compareTo(item4)=" + item2.compareTo(item4));

		// reason why the generic Comparable interface is better
		// CAN check type during compile time
		try {
			String string = "Bubba";
			// System.out.println(item1.compareTo(string));
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}// end of main()

} // end class
