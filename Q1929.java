class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concat = new int[2*nums.length];
        int n = nums.length ;
        for(int i = 0 ; i< nums.length ;i++){
            concat[i] = nums[i];
            concat[i + n] = nums[i];
        }
        return concat;
    }
   
}
