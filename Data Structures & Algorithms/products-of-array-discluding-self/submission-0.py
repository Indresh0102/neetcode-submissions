class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        answer = []
        for n in range(len(nums)):
            product = 1
            for N in range(len(nums)):
                if n==N:
                    continue
                product *= nums[N]
            answer.append(product)
        return answer