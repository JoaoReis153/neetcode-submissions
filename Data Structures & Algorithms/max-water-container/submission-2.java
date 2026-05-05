class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int max_window = 0;

        while (left < right) {

            int area = Math.min(heights[left], heights[right]) * (right - left);
            max_window = Math.max(area, max_window);

            if (heights[left] > heights[right]) right--;
            else left++;
        }

        return max_window;
    }
}
