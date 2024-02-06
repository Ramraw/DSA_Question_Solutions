class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        inorder(root, list);
        Collections.reverse(list);
        
        return list.get(K-1);
    }
    public static void inorder(Node root, ArrayList<Integer> list) {
        
        if(root == null)return;
        
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    
    }
}