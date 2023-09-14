class Solution {
    public int fib(int n) {
        int[] arr = new int[n + 1]; 

        Arrays.fill(arr, -1);
        int res;
        if (arr[n] == -1) {
            if (n == 0 || n == 1) {
            res = n;
            } 
            else {
                res = fib(n - 1) + fib(n - 2);
            }
            arr[n] = res;
        }
        return arr[n];
    }
    
}
