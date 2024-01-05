class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        
        Long minDiff = Long.MAX_VALUE;
        
        for(int i=0; i+m-1<n; i++) {
            minDiff = Math.min((long)a.get(i+m-1) - (long)a.get(i), minDiff);
        }
        return minDiff;
    }
}