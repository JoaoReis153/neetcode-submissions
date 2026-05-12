class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> (int) ((Math.pow(a[0], 2) + Math.pow(a[1], 2)) - (Math.pow(b[0], 2) + Math.pow(b[1], 2))));

        for (int i = 0; i < points.length; i++) {
            pq.add(points[i]);
        }

        int[][] result = new int[k][2];
        while (k > 0) {
            result[--k] = pq.remove();
        }

        return result;
    }
}
