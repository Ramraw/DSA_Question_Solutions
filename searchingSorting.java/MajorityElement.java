class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<size; i++) {
            int num = a[i];
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        Set<Integer> keySet = map.keySet();
        
        for(Integer key : keySet) {
            if(map.get(key) > size/2) {
                return key;
            }
        }
        return -1;
    }
}