class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0 ||num==1){
            return true ;
        }
        long left  = 0 ;
        long right = num ;
        while(left<=right){
            long mid = left + (right - left)/2 ;
            long sqaure = mid * mid ;
            if(sqaure == num){
                return true ;
            }
            else if(sqaure < num){
                left=mid+1;
            }
            else if(sqaure> num){
                right = mid -1;
            }
        }
        return false ;
        
    }
}
