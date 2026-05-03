class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left, right = 0, len(heights) - 1
        max_window = 0
        while left < right:
            max_window = max(max_window, (right - left) * min(heights[left], heights[right]))
            if heights[left] > heights[right]:
                right -= 1
            else:
                left += 1

            
        return max_window