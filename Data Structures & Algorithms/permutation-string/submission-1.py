class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        n1 = len(s1)
        n2 = len(s2)

        if n2<n1:
            return False

        have = {}
        for i in s1:
            have[i] = 1 + have.get(i, 0)
        need={}
        for i in range(n1):
            need[s2[i]] = 1 + need.get(s2[i],0)

        l = 0
        r = n1-1
        while r < n2:

            if need == have:
                return True

            need[s2[l]] -= 1
            if need[s2[l]] == 0:
                del need[s2[l]]
            l+=1
            r+=1
            if r< n2:
                need[s2[r]] = 1 + need.get(s2[r],0)

        return False