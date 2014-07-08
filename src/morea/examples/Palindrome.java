//for GUI dialogue windows
import javax.swing.JOptionPane;

/**
 * Test to see if a word is a palindrome. Example palindrome words are: radar,
 * racecar, kook, ono, Ogopogo (a lake monster in British Columbia),
 * tattarrattat (English for "knocking on a door"), saippuakauppias (Finnish for
 * "soap vendor"), and aibohphobia.
 * 
 * @author William McDaniel Albritton
 */
public class Palindrome {

	/**
	 * palindrome tester
	 * 
	 * @param word
	 *            is a possible palindrome
	 * @return true if palindrome, false if not
	 */
	public static boolean isPalindrome(String word) {
		// make sure word is all lowercase
		word = word.toLowerCase();
		// remove all empty spaces from word
		// by replacing blank spaces with an empty space
		word = word.replace(" ", "");
		// instantiate stack of Strings
		StackInterface<String> stack = new ArrayStack<String>();
		// get length of string
		Integer length = word.length();
		// instantiate queue of strings with same length as input string
		QueueInterface<String> queue = new ArrayQueue<String>(length);
		// add all of word's characters to both stack and queue
		for (int i = 0; i < length; i++) {
			String character = word.substring(i, i + 1);
			queue.offer(character);
			stack.push(character);
		}
		// compare both stack & queue to see if same characters
		while (!queue.empty()) {
			// remove character from queue
			String queueFront = queue.poll();
			// remove character from stack
			String stackTop = stack.pop();
			// if not equal, return NOT a palindrome
			if (queueFront.equals(stackTop) == false) {
				return false;
			}
		}
		// should be a palindrome at this point
		return true;
	}

	/**
	 * Starts the program
	 * 
	 * @param args
	 *            are not used
	 */
	public static void main(String args[]) {
		// keep looping until user enters empty string
		// or clicks "X" on dialogue windows
		// or clicks "cancel" dialogue windows
		// or hits the "return" key
		while (true) {
			// keep prompting user
			String word = JOptionPane.showInputDialog("Enter a palindrome");
			// exit loop if word is null or empty string
			if (word == null || word.equals("")) {
				break;
			}
			// if palindrome, display message
			if (isPalindrome(word)) {
				JOptionPane.showMessageDialog(null, "\"" + word
						+ "\" is a palindrome");
			}
			// if NOT palindrome, display NOT message
			else {
				JOptionPane.showMessageDialog(null, "\"" + word
						+ "\" is NOT a palindrome");
			}
		}
	}// end of main()

}// end class

