class Solution:

    def encode(self, strs: List[str]) -> str:
        result = ""

        for word in strs:
            result += str(len(word)) + "#" + word

        return result


    def decode(self, s: str) -> List[str]:
        left = 0
        result = []
        while left < len(s):
            j = left
            
            while s[j] != "#":
                j += 1


            length = int(s[left:j])
            j += 1

            word = s[j:j+length]
            result.append(word)

            left = j + length

        return result
