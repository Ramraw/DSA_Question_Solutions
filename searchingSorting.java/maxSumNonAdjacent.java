class Solution {
    int findMaxSum(int arr[], int n) {
        int dp[] = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        return solveDp(arr, n - 1, dp);
    }

    int solveDp(int arr[], int n, int[] dp) {
        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return arr[0];
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        // Fix the calculation of excl by considering the previous element (n-1)
        int incl = solveDp(arr, n - 2, dp) + arr[n];
        int excl = solveDp(arr, n - 1, dp); // Exclude the current element

        dp[n] = Math.max(incl, excl);

        return dp[n];
    }
}
