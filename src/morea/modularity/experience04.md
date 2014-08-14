---
title: "Assignment #4"
published: true
morea_id: experience04
morea_type: experience
morea_summary: "Write a program using arrays, exception handling, and methods to edit a grocery list"
morea_sort_order: 4
---

## Instructions

1. Write a Java application that does the following.
1.     Write an edit method for the program GroceryListProgram4.java.
1.     Save the GroceryListProgram4.java as LastnameFirstname4.java.
1.     Add the edit method to the code. You do not have to change the code or comments for GroceryListProgram4.java program; however, the code and comments in the edit method should NOT be copied from any of my example code.
1.     The edit method should prompt the user for the row number of the item to be replaced, name of the new item, and number of new items.
1.     You need to include error checking. For example, if the user enters a row number that does not exist in the list, you need to display an error message.
1.     Write your original comments every 3-5 lines of code.
1.     Make sure your code follows the ICS 211 Java Coding Standard, in particular the Java documentation (Javadoc) comments that go above each method.
1.     WARNING: In the edit method, do NOT copy my code or my comments. Use my code as a guide to write your own code.

## Output

Here is example output for input file: [groceries.csv](/morea/examples/groceries.csv) 

You can use [groceries.csv](/morea/examples/groceries.csv) as the output file as well.

{% highlight java %}
Read from file "groceries.csv"

	GROCERY LIST MENU
	 Enter 1 to Add
	 Enter 2 to Edit
	 Enter 3 to Delete
	 Enter 4 to Display
	 Enter 5 to Quit
	Enter your choice: 4

Row  Name, Number
1.   natto, 3
2.   eggs, 12
3.   shiitake, 1
4.   negi, 1
5.   garlic, 5
6.   umeboshi, 1

	GROCERY LIST MENU
	 Enter 1 to Add
	 Enter 2 to Edit
	 Enter 3 to Delete
	 Enter 4 to Display
	 Enter 5 to Quit
	Enter your choice: 2

Enter the row number of the item you wish to edit: 1024
ERROR: The integer is too big for the list.

	GROCERY LIST MENU
	 Enter 1 to Add
	 Enter 2 to Edit
	 Enter 3 to Delete
	 Enter 4 to Display
	 Enter 5 to Quit
	Enter your choice: 2

Enter the row number of the item you wish to edit: 7
ERROR: The integer is too big for the list.

	GROCERY LIST MENU
	 Enter 1 to Add
	 Enter 2 to Edit
	 Enter 3 to Delete
	 Enter 4 to Display
	 Enter 5 to Quit
	Enter your choice: 2

Enter the row number of the item you wish to edit: 0
ERROR: The integer cannot be negative or zero.

	GROCERY LIST MENU
	 Enter 1 to Add
	 Enter 2 to Edit
	 Enter 3 to Delete
	 Enter 4 to Display
	 Enter 5 to Quit
	Enter your choice: 2

Enter the row number of the item you wish to edit: -1024
ERROR: The integer cannot be negative or zero.

	GROCERY LIST MENU
	 Enter 1 to Add
	 Enter 2 to Edit
	 Enter 3 to Delete
	 Enter 4 to Display
	 Enter 5 to Quit
	Enter your choice: 2

Enter the row number of the item you wish to edit: 1
Enter name of item: rice
Enter number of items: 1

	GROCERY LIST MENU
	 Enter 1 to Add
	 Enter 2 to Edit
	 Enter 3 to Delete
	 Enter 4 to Display
	 Enter 5 to Quit
	Enter your choice: 4

Row  Name, Number
1.   rice, 1
2.   eggs, 12
3.   shiitake, 1
4.   negi, 1
5.   garlic, 5
6.   umeboshi, 1

	GROCERY LIST MENU
	 Enter 1 to Add
	 Enter 2 to Edit
	 Enter 3 to Delete
	 Enter 4 to Display
	 Enter 5 to Quit
	Enter your choice: 2

Enter the row number of the item you wish to edit: 3
Enter name of item: shoyu
Enter number of items: 3

	GROCERY LIST MENU
	 Enter 1 to Add
	 Enter 2 to Edit
	 Enter 3 to Delete
	 Enter 4 to Display
	 Enter 5 to Quit
	Enter your choice: 4

Row  Name, Number
1.   rice, 1
2.   eggs, 12
3.   shoyu, 3
4.   negi, 1
5.   garlic, 5
6.   umeboshi, 1

	GROCERY LIST MENU
	 Enter 1 to Add
	 Enter 2 to Edit
	 Enter 3 to Delete
	 Enter 4 to Display
	 Enter 5 to Quit
	Enter your choice: 2

Enter the row number of the item you wish to edit: 6
Enter name of item: BANANAS
Enter number of items: 50

	GROCERY LIST MENU
	 Enter 1 to Add
	 Enter 2 to Edit
	 Enter 3 to Delete
	 Enter 4 to Display
	 Enter 5 to Quit
	Enter your choice: 4

Row  Name, Number
1.   rice, 1
2.   eggs, 12
3.   shoyu, 3
4.   negi, 1
5.   garlic, 5
6.   BANANAS, 50

	GROCERY LIST MENU
	 Enter 1 to Add
	 Enter 2 to Edit
	 Enter 3 to Delete
	 Enter 4 to Display
	 Enter 5 to Quit
	Enter your choice: 5

Wrote to file "groceries.csv"
{% endhighlight %}    