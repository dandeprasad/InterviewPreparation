package prep.Tree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class TreeTraversal {
    private TreeNode root;

    public TreeTraversal() {
        this.root = null;
    }

    // Method to perform Inorder traversal
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Method to perform Preorder traversal
    public void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Method to perform Postorder traversal
    public void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Main method to test the traversals
    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();

        // Constructing a sample binary tree
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.println("Preorder Traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.println("Postorder Traversal:");
        tree.postorderTraversal(tree.root);
        System.out.println();
    }

}
/*    Maintian
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }*/

//Logic
//node not null
//inorder left>(print)>right
//postorder left>right>(print)
//preOrder print>left>rigt
