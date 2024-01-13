import java.util.Arrays;

class Solution {
    long minDiff(long arr[], int N, int K) {
        if (N <= 0 || K <= 0) {
            return 0;
        }

        Arrays.sort(arr);

        long minDiff = Long.MAX_VALUE;

        for (int i = 0; i <= N - K; i++) {
            long currentDiff = arr[i + K - 1] - arr[i];
            minDiff = Math.min(minDiff, currentDiff);
        }

        return minDiff;
    }
}
