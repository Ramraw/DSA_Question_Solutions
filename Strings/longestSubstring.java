class Solution {
    public int countSubstrings(String s) {
        int result = 0;
        int n = s.length();
        for(int i=0; i<n; i++) {
            result = result + findPallindrome(s, i, i, n);
            result = result + findPallindrome(s, i, i+1, n);   
        }
        return result;
    
    }
    int findPallindrome(String s, int l, int r, int n) {
        int temp = 0;
        while(l>= 0 && r<s.length()) {
            if(s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
            temp++;
            }
            else {
                break;
            }
        }
        return temp;


    }
}