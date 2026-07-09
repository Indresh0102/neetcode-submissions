class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        for i in range(len(numbers)):
            l, r = i+1, len(numbers)-1
            temp = target-numbers[i]
            while l<=r:
                mid_ind = (l+r)//2
                mid_val = numbers[mid_ind]
                if mid_val == temp:
                    return [i+1, mid_ind+1]
                elif mid_val > temp:
                    r = mid_ind-1
                elif mid_val < temp:
                    l = mid_ind+1
        return []

