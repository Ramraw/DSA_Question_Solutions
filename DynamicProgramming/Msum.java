class Solution {
    
    int findMaxSum(int arr[], int n) {
        int dp[] = new int[10000];
        Arrays.fill(dp, -1);
        
        return func(arr, n-1, dp);
    }
    int func(int arr[], int n, int [] dp) {
        
        if(n==-1) return 0;
        
        if(n==0) return arr[0];
        
        if(n==1) return arr[0] + arr[1];
        
        return Math.max(Math.max(dp[n-1], arr[n] + dp[n-1]), arr[n] + arr[n-1] + dp[n-2]);
    }
}