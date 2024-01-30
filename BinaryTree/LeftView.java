import java.util.ArrayList;

class Tree {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;

        support(root, list, 1); // Start with the first level
        return list;
    }

    // Helper function to perform recursive left view traversal
    void support(Node root, ArrayList<Integer> list, int level) {
        if (root == null) return;

        // If the current level is greater than the size of the result list, add the current node to the list
        if (level > list.size()) {
            list.add(root.data);
        }

        // Traverse the left child first, and then the right child
        support(root.left, list, level + 1);
        support(root.right, list, level + 1);
    }
}
