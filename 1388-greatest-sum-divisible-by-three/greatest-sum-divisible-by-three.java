class Solution {
    public int maxSumDivThree(int[] nums) {
        
        ArrayList<Integer> li1 = new ArrayList<>();
        ArrayList<Integer> li2 = new ArrayList<>();

        int sum = 0;

        for(int num : nums){
            sum += num;

            if(num % 3 == 1)
                li1.add(num);

            if(num % 3 ==2)
                li2.add(num);
        }

        Collections.sort(li1);
        Collections.sort(li2);

        if(sum % 3 == 0)
            return sum;

        if(sum % 3 == 1){

            int option1 = li1.size() > 0 ? li1.get(0) : Integer.MAX_VALUE;

            int option2 = li2.size() > 1 ? li2.get(0) + li2.get(1) : Integer.MAX_VALUE;

            int val = Math.min(option1,option2);

            return sum-val;

        }


        
//  if remainder 2 pga automatic yha aayega
            int option1 = li2.size() > 0 ? li2.get(0) : Integer.MAX_VALUE;

            int option2 = li1.size() > 1 ? li1.get(0) + li1.get(1) : Integer.MAX_VALUE;

            int val = Math.min(option1,option2);

            return sum-val;

       
    }
}