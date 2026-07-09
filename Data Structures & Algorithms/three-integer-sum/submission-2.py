class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        nums.sort()
        res = set()
        for i in range(len(nums) - 2):
            L = i + 1
            R = len(nums) - 1
            Target = nums[i]
            if i > 0 and Target == nums[i-1]:
                continue

            while L < R:
                curr_sum = nums[L] + nums[R]

                if curr_sum + Target == 0:
                    res.add((Target, nums[L], nums[R]))

                    # Move both pointers and skip duplicates
                    L += 1
                    R -= 1

                    while L < R and nums[L] == nums[L - 1]:
                        L += 1
                    while L < R and nums[R] == nums[R + 1]:
                        R -= 1

                elif curr_sum + Target < 0:
                    L += 1
                else:
                    R -= 1

        return [list(triplet) for triplet in res]

