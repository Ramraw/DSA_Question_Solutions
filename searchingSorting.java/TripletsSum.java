
class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        int count = 0;
        Arrays.sort(arr);
        for(int k = 0; k < n-2; k++) {
            int i = k + 1;
            int j = n-1;
            while(i < j) {
                long s = arr[k] + arr[i] + arr[j];
                if(s < sum){
                    count += (j-i);
                    i++;
                }
                else {
                    j--;
                }
            }
        }
       return count;
    }
}