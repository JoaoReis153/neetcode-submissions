class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        int sum = 0;
        
        for (int i = 0; i < stones.length; i++) {
            minHeap.add(stones[i]);
        }   

        while (minHeap.size() >= 2) {
            minHeap.add(minHeap.poll() - minHeap.poll());
        }

        return minHeap.poll();
    }
}
