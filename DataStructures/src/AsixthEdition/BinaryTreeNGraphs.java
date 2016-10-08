package AsixthEdition;

import AsixthEdition.LinkedList.Node;



public class BinaryTreeNGraphs {

	// 4.2 Create a Binary Search tree given an array.
	
	public static Node createBST(int[] arr){
		return createBST(arr, arr.length -1 , 0);
	}
	
	// Overloading
	public static Node createBST(int[] arr, int start, int end){
		if (end > start) return null;
		
		int mid = (start + end) / 2;
		Node root = new Node(arr[mid]);
		root.left =  createBST(arr, 0 , mid - 1);
		root.right = createBST(arr, mid + 1 , end);
		
		return root;
	}
}
