class Solution:
    def search(self, nums: List[int], target: int) -> int:
        
        #         0 1 2  3  4 
        # nums = [3,6,7,18,45], target = 10
        # l = 0 h = 4
        # m = l+h//2 = 3
        l = 0
        h = len(nums)-1
        while l<=h:
            m = (l+h)//2
            if nums[m] == target:
                return m
            elif nums[m]<target:
                l = m+1
            else:
                h = m-1
        return -1
        
