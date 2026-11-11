class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # {'r':2,'a':2,'c':2,'e':1,}
        freq = {}
        for c in s:
            freq[c]=freq.get(c,0)+1
        for c in t:    
            freq[c]=freq.get(c,0)-1
        for c in freq:
            if freq[c] != 0:
                return False
        
        return True
        