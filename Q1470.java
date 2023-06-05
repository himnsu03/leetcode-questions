class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffle = new int[nums.length];
        for(int i = 0 ; i<(shuffle.length)/2;i++){
            shuffle[2*i] = nums[i];
            shuffle [2*i+1]=nums[i+n];
        }
        return shuffle ;
    }
}
