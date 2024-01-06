// Given an integer array nums, find a 
// subarray
//  that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

 
// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:

// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 
class Solution {
    public int maxProduct(int[] nums) {
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];
        int n = nums.length;

        for(int i=0; i<n; i++) {
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            leftProduct *= nums[i];
            rightProduct *= nums[n-1-i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        return ans;
    }
}