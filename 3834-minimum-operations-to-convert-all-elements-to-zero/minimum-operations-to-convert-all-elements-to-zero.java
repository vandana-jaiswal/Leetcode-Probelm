class Solution {
    public int minOperations(int[] nums) {
     
     Deque<Integer> dq = new ArrayDeque<>();

    int count =0;
     for(int num : nums){

        if(num==0 ){
            dq.clear();
            continue;
        }

        while(!dq.isEmpty()  && dq.peekLast()> num){
            dq.removeLast();
        }

        if(dq.isEmpty() || dq.peekLast() < num){
            dq.addLast(num);
            count++;
        }


     }
      return count;
     }

    
}