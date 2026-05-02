class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False

        abc = [0 for _ in range(26)]

        for i in range(len(s)):
            abc[ord(s[i]) - ord('a')] += 1
            abc[ord(t[i]) - ord('a')] -= 1

        return all(value == 0 for value in abc)