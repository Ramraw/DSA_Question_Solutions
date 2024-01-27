class Solution
{
    int[] dp = new int[10005];
    public int func(int n, int x, int y, int z) {

        if(n == 0) {
            return 0;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        int opt1 = Integer.MIN_VALUE;
        int opt2 = Integer.MIN_VALUE;
        int opt3 = Integer.MIN_VALUE;
        
        if(n>=x) {
            opt1 = func(n-x, x, y, z);
        }
        if(n>=y) {
            opt2 = func(n-y, x, y, z);
        }
        if(n>=z) {
            opt3 = func(n-z, x, y, z);
        }
        
        return dp[n] = 1 + Math.max(Math.max(opt1, opt2), opt3);
    }
    
    public int maximizeCuts(int n, int x, int y, int z)
    {
        Arrays.fill(dp, -1);
       
        int a = func(n, x, y, z);
        if(a<0) return 0;
        
        return a;
    }
}