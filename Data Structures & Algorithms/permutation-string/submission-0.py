class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        n1 = len(s1)
        n2 = len(s2)

        have = {}
        for i in s1:
            have[i] = 1 + have.get(i, 0)

        l = 0
        r = n1

        while r <= n2:
            subs = s2[l:r]
            need={}
            for i in range(n1):
                need[subs[i]] = 1 + need.get(subs[i],0)
            if need == have:
                return True
            l+=1
            r+=1
        return False