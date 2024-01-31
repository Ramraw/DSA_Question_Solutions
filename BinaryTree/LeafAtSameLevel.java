class Solution{
    int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    boolean Check(Node root,int mylevel,int k){
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
           if(mylevel != k){
               return false;
           } 
        }
        return Check(root.left,mylevel+1,k) && Check(root.right,mylevel+1,k);
    }
    boolean check(Node root){
        int k = height(root);
        return Check(root,1,k);  
    }
}