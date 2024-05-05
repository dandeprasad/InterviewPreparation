package prep.dandepreparation.dandepreparation;

//Java program for insertion in AVL Tree
class NodeAVL {
 int key, height;
 NodeAVL left, right;

 NodeAVL(int d) {
     key = d;
     height = 1;
 }
}

class AVLTree {

 NodeAVL root;

 // A utility function to get height of the tree
 int height(NodeAVL N) {
     if (N == null)
         return 0;

     return N.height;
 }

 // A utility function to get maximum of two integers
 int max(int a, int b) {
     return (a > b) ? a : b;
 }

 // A utility function to right rotate subtree rooted with y
 // See the diagram given above.
 NodeAVL rightRotate(NodeAVL y) {
     NodeAVL x = y.left;
     NodeAVL T2 = x.right;

     // Perform rotation
     x.right = y;
     y.left = T2;

     // Update heights
     y.height = max(height(y.left), height(y.right)) + 1;
     x.height = max(height(x.left), height(x.right)) + 1;

     // Return new root
     return x;
 }

 // A utility function to left rotate subtree rooted with x
 // See the diagram given above.
 NodeAVL leftRotate(NodeAVL x) {
     NodeAVL y = x.right;
     NodeAVL T2 = y.left;

     // Perform rotation
     y.left = x;
     x.right = T2;

     //  Update heights
     x.height = max(height(x.left), height(x.right)) + 1;
     y.height = max(height(y.left), height(y.right)) + 1;

     // Return new root
     return y;
 }

 // Get Balance factor of NodeAVL N
 int getBalance(NodeAVL N) {
     if (N == null)
         return 0;

     return height(N.left) - height(N.right);
 }

 NodeAVL insert(NodeAVL nodeAVL, int key) {

     /* 1.  Perform the normal BST insertion */
     if (nodeAVL == null)
         return (new NodeAVL(key));

     if (key < nodeAVL.key)
    	 nodeAVL.left = insert(nodeAVL.left, key);
     else if (key > nodeAVL.key)
    	 nodeAVL.right = insert(nodeAVL.right, key);
     else // Duplicate keys not allowed
         return nodeAVL;

     /* 2. Update height of this ancestor NodeAVL */
     nodeAVL.height = 1 + max(height(nodeAVL.left),
                           height(nodeAVL.right));

     /* 3. Get the balance factor of this ancestor
           NodeAVL to check whether this NodeAVL became
           unbalanced */
     int balance = getBalance(nodeAVL);

     // If this NodeAVL becomes unbalanced, then there
     // are 4 cases Left Left Case
     if (balance > 1 && key < nodeAVL.left.key)
         return rightRotate(nodeAVL);

     // Right Right Case
     if (balance < -1 && key > nodeAVL.right.key)
         return leftRotate(nodeAVL);

     // Left Right Case
     if (balance > 1 && key > nodeAVL.left.key) {
    	 nodeAVL.left = leftRotate(nodeAVL.left);
         return rightRotate(nodeAVL);
     }

     // Right Left Case
     if (balance < -1 && key < nodeAVL.right.key) {
    	 nodeAVL.right = rightRotate(nodeAVL.right);
         return leftRotate(nodeAVL);
     }

     /* return the (unchanged) NodeAVL pointer */
     return nodeAVL;
 }

 // A utility function to print preorder traversal
 // of the tree.
 // The function also prints height of every NodeAVL
 void preOrder(NodeAVL NodeAVL) {
     if (NodeAVL != null) {
         System.out.print(NodeAVL.key + " ");
         preOrder(NodeAVL.left);
         preOrder(NodeAVL.right);
     }
 }

 public static void main(String[] args) {
     AVLTree tree = new AVLTree();

     /* Constructing tree given in the above figure */
     tree.root = tree.insert(tree.root, 10);
     tree.root = tree.insert(tree.root, 20);
     tree.root = tree.insert(tree.root, 30);
     tree.root = tree.insert(tree.root, 40);
     tree.root = tree.insert(tree.root, 50);
     tree.root = tree.insert(tree.root, 25);

     /* The constructed AVL Tree would be
          30
         /  \
       20   40
      /  \     \
     10  25    50
     */
     System.out.println("Preorder traversal" +
                     " of constructed tree is : ");
     tree.preOrder(tree.root);
 }
}
//This code has been contributed by Mayank Jaiswal
