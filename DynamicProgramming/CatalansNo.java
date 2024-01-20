


class Solution {
    public static int findCatalan(int n) {
        int mod = (int) 1e9 + 7;

        // Create an array to store the Catalan numbers
        int[] catalan = new int[n + 1];
        
        // Base case
        catalan[0] = 1;

        // Calculate Catalan numbers using dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                catalan[i] = (catalan[i] + (int)((long)catalan[j] * catalan[i - j - 1] % mod)) % mod;
            }
        }

        return catalan[n];
    }
}
        