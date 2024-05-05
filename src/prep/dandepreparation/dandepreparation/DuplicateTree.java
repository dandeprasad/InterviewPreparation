package dandepreparation;

import java.util.HashMap;

class BinaryTreeKK {
    private HashMap<String, Integer> subtreeCount = new HashMap<>();

    // Function to serialize the subtree rooted at the current node
    private String serialize(TreeNode node) {
        if (node == null) {
            return "#";
        }

        String serialized = node.val + "," + serialize(node.left) + "," + serialize(node.right);
        subtreeCount.put(serialized, subtreeCount.getOrDefault(serialized, 0) + 1);

        return serialized;
    }

    // Function to check if the binary tree contains duplicate subtrees
    public boolean containsDuplicateSubtrees(TreeNode root) {
        serialize(root);
        
        for (String key : subtreeCount.keySet()) {
            if (subtreeCount.get(key) > 1) {
                return true;
            }
        }

        return false;
    }
}

public class DuplicateTree {
    public static void main(String[] args) {
    	BinaryTreeKK tree = new BinaryTreeKK();

        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(4);

        boolean containsDuplicateSubtrees = tree.containsDuplicateSubtrees(root);
        System.out.println("Contains duplicate subtrees: " + containsDuplicateSubtrees);
    }
}
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}