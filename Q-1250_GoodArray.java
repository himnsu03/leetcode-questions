class Solution {
    public boolean isGoodArray(int[] nums) {
             int gcd = nums[0]; // Initialize gcd with the first element

        // Find the gcd of all elements in the array
        for (int i = 1; i < nums.length; i++) {
            gcd = calculateGCD(gcd, nums[i]);
        }

        // Check if the gcd is 1
        return gcd == 1;
    }

    // Function to calculate the greatest common divisor (GCD) using Euclidean algorithm
    private static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }
    }
