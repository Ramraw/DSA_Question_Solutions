

//User function template for JAVA

/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}*/
class Solution{
    int temp=0;
    
    public int solve(Node root){
        if(root==null){
            return 0;
        }
        
        int left=solve(root.left);
        int right=solve(root.right);
        
        temp=root.data;
        root.data=left+right;
        return temp+left+right;
        
    }
    public void toSumTree(Node root){
         solve(root);
    }
}