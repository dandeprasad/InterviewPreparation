package prep.dandepreparation.dandepreparation;


//Java program to print boundary traversal of binary tree 

/* A binary tree node has data, pointer to left child 
and a pointer to right child */
 class NodeB { 
	int data; 
	NodeB left, right; 

	NodeB(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

class BinaryTreeBoundry { 
	NodeB root; 

	// A simple function to print leaf nodes of a binary tree 
	void printLeaves(NodeB node) 
	{ 
		if (node == null) 
			return; 

		printLeaves(node.left); 
		// Print it if it is a leaf node 
		if (node.left == null && node.right == null) 
			System.out.print(node.data + " "); 
		printLeaves(node.right); 
	} 

	// A function to print all left boundary nodes, except a leaf node. 
	// Print the nodes in TOP DOWN manner 
	void printBoundaryLeft(NodeB node) 
	{ 
		if (node == null) 
			return; 
		
		if (node.left != null) { 
			// to ensure top down order, print the node 
			// before calling itself for left subtree 
			System.out.print(node.data + " "); 
			printBoundaryLeft(node.left); 
		} 
		else if (node.right != null) { 
			System.out.print(node.data + " "); 
			printBoundaryLeft(node.right); 
		} 

		// do nothing if it is a leaf node, this way we avoid 
		// duplicates in output 
	} 

	// A function to print all right boundary nodes, except a leaf node 
	// Print the nodes in BOTTOM UP manner 
	void printBoundaryRight(NodeB node) 
	{ 
		if (node == null) 
			return; 

		if (node.right != null) { 
			// to ensure bottom up order, first call for right 
			// subtree, then print this node 
			printBoundaryRight(node.right); 
			System.out.print(node.data + " "); 
		} 
		else if (node.left != null) { 
			printBoundaryRight(node.left); 
			System.out.print(node.data + " "); 
		} 
		// do nothing if it is a leaf node, this way we avoid 
		// duplicates in output 
	} 

	// A function to do boundary traversal of a given binary tree 
	void printBoundary(NodeB node) 
	{ 
		if (node == null) 
			return; 

		System.out.print(node.data + " "); 

		// Print the left boundary in top-down manner. 
		printBoundaryLeft(node.left); 

		// Print all leaf nodes 
		printLeaves(node); 
		//printLeaves(node.right); 

		// Print the right boundary in bottom-up manner 
		printBoundaryRight(node.right); 
	} 

	// Driver program to test above functions 
	public static void main(String args[]) 
	{ 
		BinaryTreeBoundry tree = new BinaryTreeBoundry(); 
		tree.root = new NodeB(20); 
		tree.root.left = new NodeB(8); 
		tree.root.left.left = new NodeB(4); 
		tree.root.left.right = new NodeB(12); 
		tree.root.left.right.left = new NodeB(10); 
		tree.root.left.right.right = new NodeB(14); 
		tree.root.right = new NodeB(22); 
		tree.root.right.right = new NodeB(25); 
		tree.printBoundary(tree.root); 
	} 
} 
