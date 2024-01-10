class Complete{
    
   
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        //Complete the function
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<n; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            } else {
                return map.get(arr[i]);
            }
        }
        return -1;
    }
}
