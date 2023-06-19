class Solution {
    public int arrangeCoins(int n) {
        long left = 0;
        long right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long total = (mid * (mid + 1)) / 2; // Calculate the total number of coins in the first 'mid' rows

            if (total == n) {
                return (int) mid; // Found a perfect arrangement
            } else if (total < n) {
                left = mid + 1; // More rows can be formed, increase 'mid'
            } else {
                right = mid - 1; // Fewer rows can be formed, decrease 'mid'
            }
        }

        return (int) right; // Return the maximum number of complete rows
    }
}
