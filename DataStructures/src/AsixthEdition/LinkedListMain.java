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

		Node.display(n);
		
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
		System.out.println();
		Node k = Node.partition(n, 5);
		Node.display(k);

	}
}
