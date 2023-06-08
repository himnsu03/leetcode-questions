class Solution {
    public int diagonalSum(int[][] mat) {
        int  n = mat.length ;
        int sum = 0;
        
        for(int i = 0 ; i< n ; i++){
            sum += mat[i][i];
        }
        for(int i = n-1 ; i>= 0;i--){
            sum+= mat[i][i];
        }
        if((n%2)!= 0){
            int mid = n/ 2 ;
            sum = sum - mat[mid][mid];
        }
        return sum ;
    }
}
