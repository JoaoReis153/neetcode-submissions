class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        set_list = set(nums)
        count = 0
        max_value = 0
        for value in set_list:
            if value - 1 not in set_list:
                count = 0
                while value in set_list:
                    value += 1
                    count += 1
                max_value = max(max_value, count)

        return max_value
