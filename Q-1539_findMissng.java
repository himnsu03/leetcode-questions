class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Count the number of missing numbers before mid
            int missingCount = arr[mid] - mid - 1;
            
            if (missingCount < k) {
                left = mid + 1; // kth missing number is after mid
            } else {
                right = mid; // kth missing number is at or before mid
            }
        }
        
        // The kth missing number is arr[left-1] + k - (arr[left-1] - (left-1)) = k + left
        return left + k;
    }
}
