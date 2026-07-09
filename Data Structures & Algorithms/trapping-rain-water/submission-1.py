class Solution:
    def trap(self, height: List[int]) -> int:
        res = 0
        for curr in range(len(height)):
            l = 0
            r = 0
            curr_bar = height[curr]
            for j in range(len(height)):
                if j < curr:
                    if height[j] > l:
                        l=height[j]
                else:
                    if height[j] > r:
                        r=height[j]
            if min(l,r) - height[curr] > 0:
                res += min(l,r) - height[curr]
        return res