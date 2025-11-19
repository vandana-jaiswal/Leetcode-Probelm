class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        int i = 1;

        while(i!=0){

            i = map.getOrDefault(original, 0);

            if(i!=0)
                original *= 2;
        }

        return original;
    }
}