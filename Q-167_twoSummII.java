public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int complement = target - numbers[i];
            int index = binarySearch(numbers, complement, i + 1, numbers.length - 1);
            if (index != -1) {
                return new int[] { i + 1, index + 1 };
            }
        }
       return new int []{-1,-1} ;
    }

    private int binarySearch(int[] numbers, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }
}
