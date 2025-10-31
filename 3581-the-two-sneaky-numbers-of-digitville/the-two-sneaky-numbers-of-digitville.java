class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        //  find array ke elemnt ka count 
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1   );
        }

        //  jo 1 se jyad ahia unhe arrayList me dala

        ArrayList<Integer> list = new ArrayList<>();

        for(int key : map.keySet()){
            if(map.get(key)>1){
                list.add(key);
            }
        }

//      arrayLiast se array me dal kar retur kiya
        int[] arr1 = new int[list.size()];
        for(int i=0; i<arr1.length;i++){
            arr1[i] = list.get(i);
        }

        return arr1;
    }
}