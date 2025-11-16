class Solution {
    public int numSub(String s) {
        
        long MOD = 1000000007;

        long count =0;

        String[] arr = s.split("0");

        for(String next : arr){
            long n = next.length();

            count = (count + (n * (n+1) /2)) % MOD;

        }

        return (int)count;
    }
}