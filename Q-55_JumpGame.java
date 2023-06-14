class Solution {
    public boolean canJump(int[] nums) {
        int lastPosition = nums.length - 1;
    
    // Iterate from right to left
    for (int i = nums.length - 1; i >= 0; i--) {
        // Check if the current position can reach the last position
        if (i + nums[i] >= lastPosition) {
            lastPosition = i;
        }
    }
    
    // If the last position is the first position, it means we can reach the end
    return lastPosition == 0;
    }
}
