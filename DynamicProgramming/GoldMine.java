class Solution{
    private static int getMax(int i, int j, int k) {
        return Math.max(Math.max(i, j), k);
    }

    private static int getMax(int i, int j){
        return Math.max(i, j);
    }

    static int maxGold(int n, int m, int mat[][]) {
        // code here
        int dp[][] = new int[n+2][m];
        int max = 0;
        
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = mat[i-1][0];
        }
        
        for (int j = 1; j < m; j++) {
            for (int i = 1; i < n + 1; i++) {
                dp[i][j] = getMax(dp[i][j-1], dp[i-1][j-1], dp[i+1][j-1]) + mat[i-1][j];
            }
        }
        
        for (int i = 1; i < n + 1; i++) {
            max = getMax(max, dp[i][m-1]);
        }
        
        return max;
    }
}

