import java.util.Arrays;
import java.util.Stack;

class Solution {
    // Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n) {
        long[] big = new long[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                big[index] = arr[i];
            }

            stack.push(i);
        }

        // Remaining elements in the stack have no next greater element
        while (!stack.isEmpty()) {
            int index = stack.pop();
            big[index] = -1;
        }

        return big;
    }
}
