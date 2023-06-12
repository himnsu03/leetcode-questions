import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int sum = digits[digits.length - 1] + 1;
        int carry = sum / 10;
        list.add(sum % 10);
        for (int i = digits.length - 2; i >= 0; i--) {
            sum = digits[i] + carry;
            list.add(0, sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            list.add(0, carry);
        }
        int[] plusOne = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            plusOne[i] = list.get(i);
        }
        return plusOne;
    }
}
