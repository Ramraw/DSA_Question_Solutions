class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        if(head == null) {
            return null;
        }
        
        Node prev = null;
        Node cur = head;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        while(cur != null) {
            if(!map.containsKey(cur.data)) {
                map.put(cur.data, 1);
                prev = cur;
                cur = cur.next;
            }
            else {
                prev.next = cur.next;
                cur = cur.next;
            }
        }
        return head;
    }
}