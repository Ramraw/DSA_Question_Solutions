class Tree
{
    static int height(Node root){
        if (root == null){
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        
        return Math.max(l,r)+1;
    }
    
    boolean isBalanced(Node root){
        if (root == null){
            return true;
        }
        int a = height(root.left);
        int b = height(root.right);
        
        if (Math.abs(a-b) > 1){
            return false;
        }
        boolean l = isBalanced(root.left);
        boolean r = isBalanced(root.right);
        
        return l && r;

    }
}