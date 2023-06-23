class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            int index = binarySearch(arr, target, i + 1, arr.length - 1);
            
            if (index != -1) {
                return true;
            }
        }
        
        return false;
    }
    
    public int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
