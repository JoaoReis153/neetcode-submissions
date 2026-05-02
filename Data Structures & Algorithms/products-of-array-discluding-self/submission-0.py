class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        a = 1
        temp = [0] * len(nums)
        for index in range(len(nums)):
            temp[index] = a
            a *= nums[index]
        print(temp)
        b = 1

        for index in range(len(nums) - 1, -1, -1):
            temp[index] *= b
            b *= nums[index]

        return temp