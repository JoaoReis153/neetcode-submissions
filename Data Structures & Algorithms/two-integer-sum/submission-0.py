class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = {}

        for index in range(len(nums)):
            value = nums[index]
            if value in hm:
                return [hm[value], index]
            else:
                hm[target - value] = index

        return None
