class Solution {
    public int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            // Check for overflow before adding a new digit
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            rev = rev * 10 + rem;
        }
        return rev;
    }
}
