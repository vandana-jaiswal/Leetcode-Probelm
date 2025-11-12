class Solution {
    public int minOperations(int[] nums) {
        
     
        int numberOf= 0;

        for(int a : nums){
            if(a == 1){
               
                numberOf++;
            }
        }

        if(numberOf>0){
            int op = nums.length - numberOf;
            return op;
        }

        int minLen = Integer.MAX_VALUE;


        for(int i=0; i<nums.length; i++){
            int g = nums[i];
          for(int j=i+1; j<nums.length; j++){
            g = gcd(g, nums[j]);

            if(g==1){
                minLen = Math.min(minLen, j-i+1);
                break;
            }

          }

        }

        if(minLen == Integer.MAX_VALUE)
            return -1;

        int res = (minLen -1) + (nums.length-1);
        
        return res;
    }


    public int gcd(int a, int b){
        if(b==0)
            return a;

        int rem = a % b;

        int gc = gcd(b,rem);

        return gc;

    }
}