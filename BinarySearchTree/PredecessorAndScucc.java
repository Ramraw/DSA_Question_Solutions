public static void findPreSuc(Node root, int key)
{
    if(root==null)
        return;
    if(root.data<key) {
        pre=root;
        findPreSuc(root.right,key);
    } 
    else if(root.data>key) {
        suc=root;
        findPreSuc(root.left,key);
    } 
    else {
        findPreSuc(root.left,key);
        findPreSuc(root.right,key);
    }
}