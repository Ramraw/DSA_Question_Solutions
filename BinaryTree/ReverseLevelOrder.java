class Tree{
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        // code here
       ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
              s.push(curr.data);
              if (curr.right != null) {
                q.add(curr.right);
              }
              if (curr.left != null) {
                q.add(curr.left);
              }
            }
        }
        while (!s.isEmpty()) {
            result.add(s.pop());
        }
        return result;

    }
}