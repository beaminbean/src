package gcd;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Implement a queue class (for characters). You can use an array or a linked list.
//

/*(a) Build a test program that stores the alphabet using your queue.
(b) You can use enqueue() or dequeue() methods. In dequeue() method, you need
to be able throw an exception where there is nothing to dequeue (e.g., throw
new RuntimeException("Queue underflow");).
(c) Limit the size of the queue so that you can only store up to 10 characters. If
you enter more than 10 characters, your test program should show an error
message.*/
public class QueueClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // get system input from keyboard
		Queue<Character> queue = new LinkedList<>();  // create a queue of characters
		char ch = '\0';  // set ch to null
		String exit = "#";  // set exit program character to octothorpe

		// while the character entered is not equal to #, add to the queue
		while (ch != exit.charAt(0)) {

			System.out.println("\nEnter a character");
			ch = scanner.next().charAt(0);

			if (ch == '#')
				break; // if character equal #, then exit while loop

			// add character to the queue
			queue.add(ch);

			System.out.println("\nElements of queue: " + queue);

			int size = queue.size();
			System.out.println("\nSize of queue: " + size);

			if (size > 10) {
				System.err.println("\nQueue Size is over the limit, currently at: " + size);
				break;
			}
		}

		// if queue is empty throw Exception
		if (queue.isEmpty()) {
			scanner.close();
			throw new RuntimeException("Queue underflow");
		} else {
			scanner.close();
		}
		
		System.out.println("End Program");
	}
}