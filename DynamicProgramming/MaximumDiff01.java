class Solution {

    int maxSubstring(String S) {
      int maxDiff = -1;
        int currentDiff = 0;

        for (int i = 0; i < S.length(); i++) {
            int num = (S.charAt(i) == '0') ? 1 : -1;
            currentDiff = Math.max(num, currentDiff + num);
            maxDiff = Math.max(maxDiff, currentDiff);
        }

        // If there are only 1s, return -1 as per the problem statement
        if (maxDiff == 0 && S.indexOf('1') != -1) {
            return -1;
        }

        return maxDiff;
    }
}