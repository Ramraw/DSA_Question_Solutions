class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        if(root == null) {
            return new Node(root, key);
        }
        if(key > root.data) {
            if(root.right == null) {
                root.right = new Node(key);
            } else {
                insert(root.right, key);
            }
        } else if(key < root.data) {
            if(root.left == null) {
                root.left = new Node(key);
            } else {
                insert(root.left, key);
            }
        }
        return root;
    }
}