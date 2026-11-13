class Solution:
    def search(self, nums: List[int], target: int) -> int:
        #          0 1 2 3 4 5
        # nums = [-1,0,2,4,6,8], target = 4
        for i in range(len(nums)):
            if nums[i] == target:
                return i
        return -1
