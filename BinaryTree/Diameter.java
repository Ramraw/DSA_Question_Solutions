

// User function Template for Java

/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Solution {
    // Function to return the diameter of a Binary Tree.
   static int max = 1;
    int helper(Node root) {
       if(root == null) return 0;
        
        int l = helper(root.left);
        int r = helper(root.right);
        
        if(max < (l+r+1)) max = l+r+1;
        return Math.max(l,r) + 1; 
    }
    
    int diameter(Node root) {
        max = 1;
        helper(root);
        return max;
    }
}