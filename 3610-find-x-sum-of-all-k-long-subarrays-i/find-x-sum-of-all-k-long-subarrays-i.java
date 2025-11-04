class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        
        int [] arr = new int[nums.length-k+1];

        for(int i=0;i<nums.length-k+1; i++){

             HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=i; j<i+k; j++){

                map.put(nums[j], map.getOrDefault(nums[j],0)+1);
            }

            //     int sumElement = 0;
            // for(int key: map.keySet()){
            //     sumElement += key;
            // }

            PriorityQueue<int[] > pq = new PriorityQueue<>((a,b)->{
                if(a[1]==b[1])
                    return b[0]-a[0];
                else
                  return  b[1]-a[1];
            });


            for(int key: map.keySet()){
                pq.offer(new int[]{key, map.get(key)});

            }

                  int sumElement = 0;
            for(int m=0; m<x && !pq.isEmpty();m++){
                int [] temp = pq.poll();
                sumElement += temp[0]*temp[1];
            }

            arr[i] = sumElement;
        }

        return arr;
    }
}