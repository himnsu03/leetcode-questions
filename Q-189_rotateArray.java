class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        // Reduce k to the range [0, n)
        k = k % n;
        
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            int rotatedIndex = (i + k) % n;
            rotated[rotatedIndex] = nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
    }
}
