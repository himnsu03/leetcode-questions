public class Solution {
    public boolean isPowerOfThree(int n) {
      
        if (n <= 0) {
            return false;
        }

        
        double logResult = Math.log10(n) / Math.log10(3);

        // Check if the result is an integer
        return Math.abs(logResult - Math.round(logResult)) < 1e-10;
    }
}
