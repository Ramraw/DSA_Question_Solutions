class Solution
{
    public int LongestRepeatingSubsequence(String str) {
        int n = str.length();
        int m = str.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++) {
            for(int j=0; j<m+1; j++) {
                dp[i][j] = -1;
            }
        }
        return lcs(str, str, n, m, dp);
    }
    public int lcs(String text1, String text2, int n, int m, int [][] dp) {
        if(n==0 || m==0) {
            return 0;
        }
        if(dp[n][m] != -1) {
            return dp[n][m];
        }
        if(text1.charAt(n-1) == text2.charAt(m-1) && n != m) {
            return dp[n][m] = lcs(text1, text2, n-1, m-1, dp) + 1;
        }else {
            int ans1 = lcs(text1, text2, n-1, m, dp);
            int ans2 = lcs(text1, text2, n, m-1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }
}