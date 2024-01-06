public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<A.size(); i++) {
            if(!set.add(A.get(i))) {
                list.add(A.get(i));
            } else {
                set.add(A.get(i));
            }
        }
        Collections.sort(A);
        for(int num : set) {
            sum += num;
        }
        int mnum = 0;
        if(A.get(A.size()-1) == 1) {
             mnum = 2;
        } else {
             mnum = A.get(A.size()-1)*(A.get(A.size()-1) + 1)/2 - sum;
        }
        list.add(mnum);
        
        return list; 
    }
}
