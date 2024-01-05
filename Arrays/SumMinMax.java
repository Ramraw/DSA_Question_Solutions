class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        int min = A[0];
        int max = A[0];
        
        for(int i=0; i<A.length; i++) {
            min = A[i] < min ? A[i] : min;
            max = A[i] > max ? A[i] : max;
        }
        return min + max;
    }
   
}