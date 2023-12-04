class Solution {
    public String largestGoodInteger(String num) {
        String ans ="";
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num.length() - 2; i++){
            if(num.charAt(i)==num.charAt(i + 1) && num.charAt(i + 2) == num.charAt(i)){
                Integer val = Integer.valueOf(num.substring(i, i + 3));
                if(val > max){
                    ans = num.substring(i, i + 3);
                    max = val;
                }
            }
        }
        return ans;
    }
}
