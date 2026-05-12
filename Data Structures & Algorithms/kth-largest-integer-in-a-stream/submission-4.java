class KthLargest {

    private PriorityQueue<Integer> minHeap;
    private int k;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<Integer>();
        for (int val : nums) {
            minHeap.add(val);
        }

        while (minHeap.size() > k) {
            minHeap.poll();
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size() > this.k) minHeap.poll();
        return minHeap.peek();
    }
}
