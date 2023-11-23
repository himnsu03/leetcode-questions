class Solution {
    public int findTargetSumWays(int[] nums, int target) {
         return ways(nums, 0, target);
    }

    static int ways(int[] nums, int index, int target) {
        if (index == nums.length) {
            return (target == 0) ? 1 : 0;
        }

        
        int nextIndex = index + 1;

        return ways(nums, nextIndex, target - nums[index]) +
               ways(nums, nextIndex, target + nums[index]);
    }
}
