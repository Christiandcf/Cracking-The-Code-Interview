package AsixthEdition;

import AsixthEdition.LinkedList;
import AsixthEdition.LinkedList.Node;

public class LinkedListMain {
	public static void main(String[] args){
		Node n = new Node(3);
		
	//	n.append(3);
		n.append(5);
		n.append(8);
		n.append(5);
		n.append(10);
		n.append(2);
		n.append(1);

		Node n1 = new Node(5);
		n1.append(9);
		n1.append(2);
		
		Node n2 = new Node(7);
		n2.append(1);
		n2.append(6);
		
		Node n3 = new Node(1);
		n3.append(2);
		n3.append(3);
		n3.append(3);
		n3.append(2);
		n3.append(1);


		//Node.display(n);
		
		System.out.println();
		System.out.print("n1: ");
		Node.display(n1);
		System.out.println();
		System.out.print("n2: ");
		Node.display(n2);
		System.out.println();
		System.out.print("n3: ");
		Node.display(n3);
		System.out.println();

		//System.out.println("result: " + Node.AltSum(n2, n3));
		int[] arr = {1,2,3,4,5};

		//System.out.println(Node.isPalindrome(n3));



//		System.out.println();
//		
//		Node.removeDups(n);
//		Node.display(n);
//
//		System.out.println();
//		
//		System.out.println(Node.kthLast(n, 2));
//
//		System.out.println();
//
//		Node.middleDelete(n.next.next.next);
//		
//		Node k = Node.partition(n, 5);
	//	Node.display(k);
		

	}
}
