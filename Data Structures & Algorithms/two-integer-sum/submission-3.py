class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = {}

        for index in range(len(nums)):
            complement = target - nums[index]
            if complement in hm:
                return [hm[complement], index]
            else:
                hm[nums[index]] = index

        return None
