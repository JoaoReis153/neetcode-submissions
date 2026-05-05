class Solution {
    public int characterReplacement(String s, int k) {
        int[] characterFrequency = new int['Z' - 'A' + 1];
        int left = 0;
        int maxCount = 0;
        int best = 0;
    
        for (int right = 0; right < s.length(); right++) {
            int idxR = s.charAt(right) - 'A';
            
            characterFrequency[idxR] += 1;
            maxCount = Math.max(maxCount, characterFrequency[idxR]);

            while((right - left + 1) -  maxCount > k) {
                int idxL = s.charAt(left) - 'A';
                characterFrequency[idxL] -= 1;
                left += 1;
            }
            
            best = Math.max(right - left + 1, best);
        }

        return best;

    }
}
