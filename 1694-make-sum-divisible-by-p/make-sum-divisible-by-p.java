class Solution {
    public int minSubarray(int[] nums, int p) {
        
        long total = 0;
        for(int n: nums){
            total+= n;
        }

      int an = (int) ( total % p);
      if(an ==0)
        return 0;
    
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,-1);

    long prefix =0;
    int ans = nums.length;

    for(int i=0;i<nums.length; i++){
        prefix = (prefix +  nums[i])% p;
        int needed = (int)( (prefix - an + p) % p );

        if(map.containsKey(needed)){
            ans = Math.min(ans, i-map.get(needed));
        }
        map.put((int)prefix,i);
            }

        return ans == nums.length ? -1 : ans;


    }



}