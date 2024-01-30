class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        if (node == null) return list;

        support(node, list, 1); // Start with the first level
        return list;
    }

    // Helper function to perform recursive left view traversal
    void support(Node node, ArrayList<Integer> list, int level) {
        if (node == null) return;

        // If the current level is greater than the size of the result list, add the current node to the list
        if (level > list.size()) {
            list.add(node.data);
        }

        support(node.right, list, level + 1);
        support(node.left, list, level + 1);
    }
}