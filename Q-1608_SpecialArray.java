import java.util.Arrays;

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = nums.length - mid;

            if (nums[mid] >= count && (mid == 0 || nums[mid - 1] < count)) {
                return count;
            } else if (nums[mid] < count) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return -1;
    }
}
