class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        n = val.length;
        int dp[][] = new int[n+1][W+1];
        
        for(int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        } 
        
        for(int j = 0; j < W + 1; j++) {
            dp[0][j] = 0;
        } 
        
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                
                if(w <= j) {
                    int incProfit = v + dp[i - 1][j - w];
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                    
                } else {
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        return dp[n][W];
    } 
}
