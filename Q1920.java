class Solution {
    public int[] buildArray(int[] nums) {
        int[] news = new int[nums.length];
        for(int i = 0 ; i<news.length;i++){
            news[i]= nums[nums[i]];
        }
        return news;
    }
}
