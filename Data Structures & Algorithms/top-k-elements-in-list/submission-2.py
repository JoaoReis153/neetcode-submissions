class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hm = {}

        for num in nums:
            if num in hm:
                hm[num] = hm[num] + 1
            else:
                hm[num] = 1
        
        temp = []
        n = len(nums)
        for _ in range(n+1):
            temp.append([])

        
        for num in hm:
            i = hm[num]
            temp[i].append(num)

        result = []
        for index in range(len(temp) - 1, 0, -1):
            if temp[index]:
                for num in temp[index]:
                    result.append(num)
                    if len(result) == k:
                        return result

        return result

