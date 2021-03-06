package LinkedList;

import java.util.Hashtable;
import java.util.Stack;

public class Node {

	public Node next = null;
	public int data;

	public Node(int d) {
		data = d;
	}

	public Node(int carry, Node l1, Node l2) {
		data = carry;
	}

	// adds element to the end of the list
	public void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	public static Node deleteLinkedListNode(Node head, int d) {
		Node n = head;

		if ((int) n.data == d) {
			return head.next; // moved to head.
		}

		while (n.next != null) {
			if ((int) n.next.data == d) {
				n.next = n.next.next;
				return head; // head didnt chanage
			}
		}
		return head;
	}

	// Just displays the data, by traversing through the list.
	public static void display(Node n) {
		Node current = n;

		while (current != null) {
			if (current.next == null) {
				System.out.print(current.data);

			} else {
				System.out.print(current.data + " --> ");
			}
			current = current.next;
		}
	}

	// Solution with HashTable and temp buffer allow
	public static void removeDups(Node n) {
		Hashtable table = new Hashtable();
		Node prev = null;

		while (n != null) {
			if (table.containsKey(n.data)) {
				prev.next = n.next;
			} else {
				table.put(n.data, true);
				prev = n;
			}
			n = n.next;
		}
	}

	public static void removeDupsNoB(Node n) {
		if (n == null) {
			return;
		}
		Node current = n; // starts at the head

		while (current != null) {
			Node runner = current;

			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	// 2.2
	public static int nthToLastSize(Node head, int k) {
		if (head == null) {
			return 0;
		}

		int i = (nthToLastSize(head.next, k)) + 1;

		if (i == k) {
			System.out.println(head.data);
		}
		return i;
	}

	// 2.3 delete a node

	public static boolean deleteNode(Node n) {
		if (n == null || n.next == null)
			return false;

		Node next = n.next;
		n.data = next.data;
		n.next = next.next;

		return true;
	}

	// 2.4 partition list
	public static Node partition(Node n, int x) {
		Node beforeX = null;
		Node afterX = null;

		while (n != null) {
			Node next = n.next;
			if ((int) n.data < 0) {
				n.next = beforeX;
				beforeX = n;
			} else {
				n.next = afterX;
				afterX = n;
			}
			n = n.next;
		}

		if (beforeX == null)
			return afterX;

		// Find end of before list and merge to beginning of after

		Node head = beforeX;
		while (beforeX.next != null) {
			beforeX = beforeX.next;
		}

		beforeX.next = afterX;

		return head;
	}

	// 2.5 Summing linked list

	// 2.6 Circular Linked List, using Fast Slow runner Algo,

	public static Node findBeginning(Node head) {
		Node slow, fast;
		fast = slow = head;

		// they will have to meet at one point in the loop
		while (fast != null || fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break;
			}
		}

		if (fast == null || fast.next == null)
			return null;

		slow = head;

		// make them at the same pace.
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}

		return fast;

	}

	// 2.7 check if linked list is a palindrome (same word backwards)

	public static boolean isPalindrome(Node head) {
		Node slow, fast;

		slow = fast = head;

		Stack<Integer> stack = new Stack<Integer>();

		while (fast != null && fast.next != null) {
			stack.push((int) slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}

		if (fast != null) {
			slow = slow.next;
		}

		// gop through the rest

		while (slow != null) {
			if (stack.pop().intValue() != (int) slow.data) {
				return false;
			}
			slow = slow.next;
		}

		return true;
	}

	public static void deleteLast(Node n) {
		while (n.next.next != null) {
			n = n.next;
		}

		n.next = null;
	}

}
