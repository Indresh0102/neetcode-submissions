class Solution:
    def longestPalindrome(self, s: str) -> str:
        res = ""
        reslen = 0
        n = len(s)
        for i in range(n):
            for j in range(i, n):
                l, r = i, j
                while l<r and s[l] == s[r]:
                    l+=1
                    r-=1
                if l>=r and reslen<(j-i+1):
                    res = s[i:j+1]
                    reslen = (j-i+1)
        return res
