class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int val : nums) {
            maxHeap.add(val);
        }

        while (k > 1) {
            maxHeap.poll();
            k--;
        }

        return maxHeap.poll();
    }
}
