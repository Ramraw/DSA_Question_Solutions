

// A Binary Search Tree node
class Solution
{
    // Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root, int l, int h)
    {
        if (root == null) {
            return 0;
        }
        
        int count = 0;
        
        if (root.data >= l && root.data <= h) {
            count++;
        }
        
        if (root.data > l) {
            count += getCount(root.left, l, h);
        }
        
        if (root.data < h) {
            count += getCount(root.right, l, h);
        }
        
        return count;
    }
}