class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        ArrayList<Long> list = new ArrayList<Long>();
        
        for(int i=0; i<n; i++) {
            list.add(arr1[i]);
        }
        for(int i=0; i<m; i++) {
            list.add(arr2[i]);
        }
        
        Collections.sort(list);
        
        for(int i=0; i<n; i++) {
            arr1[i] = list.get(i);
        }
        int j=0;
        for(int i=n; i<m+n; i++) {
            arr2[j] = list.get(i);
            j++;
        }
    }
}