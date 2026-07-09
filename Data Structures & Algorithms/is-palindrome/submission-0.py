class Solution:
    def isPalindrome(self, s: str) -> bool:
        small = ""
        for i in s:
            if i.isalnum():
                if i.isupper():
                    small += i.lower()
                else:
                    small += i
        return small == small[-1::-1]