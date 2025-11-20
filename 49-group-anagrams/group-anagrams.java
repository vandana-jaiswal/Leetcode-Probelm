class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String> > map = new HashMap<>();

        for(String next : strs){

            char[] c = next.toCharArray();
            Arrays.sort(c);
            String sig = new String(c);

           List<String>  check = map.get(sig);

           if(check == null){
            ArrayList<String> li = new ArrayList<>();
            map.put(sig , li);
            li.add(next);
           }else{

            check.add(next);
           }
        }

        return new ArrayList<>(map.values());
    }
}