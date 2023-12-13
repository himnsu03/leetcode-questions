class Solution {
    public int minSwaps(String s) {
        int openCount = 0, swapCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                openCount++;
            } else {
                if (openCount > 0) {
                    openCount--;
                } else {
                    swapCount++;
                    openCount++;  // Increment openCount to consider the current ']' as balanced
                }
            }
        }

        return swapCount;
    }
}
