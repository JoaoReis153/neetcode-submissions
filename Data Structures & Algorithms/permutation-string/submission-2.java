class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] referenceTracker = new int[26];
        int[] tracker = new int[26];

        int neededMatches = 0;

        for (char c : s1.toCharArray()) {
            int pos = c - 'a';
            if (referenceTracker[pos] == 0) neededMatches += 1;
            referenceTracker[pos] += 1;
        }

        int left = 0;
        int matches = 0;

        for (int i = 0; i < s2.length(); i++) {
            int pos = s2.charAt(i) - 'a';

            tracker[pos]++;

            if (tracker[pos] == referenceTracker[pos]) {
                matches++;
            } else if (tracker[pos] == referenceTracker[pos] + 1) {
                matches--;
            }

            if (i - left + 1 > s1.length()) {
                int leftPos = s2.charAt(left) - 'a';

                tracker[leftPos] -= 1;

                if (tracker[leftPos] == referenceTracker[leftPos]) {
                    matches++;
                } else if (tracker[leftPos] == referenceTracker[leftPos] - 1) {
                    matches--;
                }

                left += 1;
            }

            if (matches == neededMatches) return true;

        }

        return false;

    }
}
