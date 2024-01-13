import java.util.PriorityQueue;

class Solution {
    static int[] kLargest(int[] arr, int n, int k) {
        int[] result = new int[k];

        // Min heap to store K largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add the first K elements to the min heap
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }

        // Iterate through the remaining elements
        for (int i = k; i < n; i++) {
            // If the current element is greater than the smallest element in the heap
            if (arr[i] > minHeap.peek()) {
                minHeap.poll(); // Remove the smallest element
                minHeap.add(arr[i]); // Add the current element
            }
        }

        // Pop elements from the heap and store in the result array
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
