
class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
    long[] left = new long[nums.length];

    long[] right = new long[nums.length];

    left[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      left[i] = left[i - 1] * nums[i - 1];
    }

    right[nums.length - 1] = 1;
    for (int i = nums.length - 2; i > -1; i--) {
      right[i] = right[i + 1] * nums[i + 1];
    }

    long[] ans = new long[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = left[i] * right[i];
    }

    return ans;
	} 
} 