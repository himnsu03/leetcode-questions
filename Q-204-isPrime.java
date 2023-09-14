class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n+1];  
        for(int i = 2 ; i*i<=n;i++){
            if(!isPrime[i]){
                for(int j = i*2;j<=n;j+=i){
                    isPrime[j]=true;

                }
            }
        }
        int c=0;
    for(int i = 2 ; i<n;i++){
        if(!isPrime[i]){
            c++;
        }

    }
    return c;
    }
    
}
