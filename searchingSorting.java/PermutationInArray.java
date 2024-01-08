

// User function Template for Java

class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] + b[i] >= k) {
                return true;
            }
        }
        return false;
    }
}