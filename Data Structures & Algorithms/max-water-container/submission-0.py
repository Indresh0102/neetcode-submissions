class Solution:
    def maxArea(self, heights: List[int]) -> int:
        height = heights
        l = 0
        r = len(height)-1
        area = 0
        while l<r:
            if area < min(height[l],height[r]) * (r-l):
                area = min(height[l],height[r]) * (r-l)
            if height[l]<height[r]:
                l+=1
                while l<r and height[l] == height[l-1]:
                    l+=1
            elif height[l]>height[r]:
                r-=1
                while l<r and height[r] == height[r+1]:
                    r-=1
            else:
                if height[l] == height[r]:
                    r-=1
                    while l<r and height[r] == height[r+1]:
                        r-=1

        return area