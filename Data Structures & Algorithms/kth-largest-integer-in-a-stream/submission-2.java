class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.pq = new PriorityQueue<Integer>();
        for (int val : nums) {
            this.add(val);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size() > this.k) {
            pq.poll();
        }
        return pq.peek();
    }
}
