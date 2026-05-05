class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charsInSubstring = new HashSet<Character>();
        int longestSubstringSize = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (charsInSubstring.contains(s.charAt(right))) {
                charsInSubstring.remove(s.charAt(left));
                left++;
            }
            charsInSubstring.add(s.charAt(right));
            longestSubstringSize = Math.max(right - left + 1, longestSubstringSize);
        }
        return longestSubstringSize;

    }
}
