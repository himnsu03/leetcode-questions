class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
         List<Integer> result = new ArrayList<>();
        int i = A.length - 1;
        int carry = 0;

        while (i >= 0 || K > 0 || carry > 0) {
            int digit = (i >= 0) ? A[i] : 0;
            int sum = digit + K % 10 + carry;
            result.add(0, sum % 10);
            carry = sum / 10;
            i--;
            K /= 10;
        }

        return result;
    }
}
