class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Check if the middle index is even
            boolean isEven = (mid % 2 == 0);
            
            // If the middle element is equal to its right neighbor, the single element is on the right side
            if (nums[mid] == nums[mid + 1]) {
                if (isEven) {
                    left = mid + 2;
                } else {
                    right = mid - 1;
                }
            }
            // If the middle element is equal to its left neighbor, the single element is on the left side
            else if (nums[mid] == nums[mid - 1]) {
                if (isEven) {
                    right = mid - 2;
                } else {
                    left = mid + 1;
                }
            }
            // If neither of the neighbors are equal, the single element is at the middle index
            else {
                return nums[mid];
            }
        }

        // If the loop exits, the single element is at the last remaining index
        return nums[left];
    }
}
