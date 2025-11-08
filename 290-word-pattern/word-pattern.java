class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] arr = s.split(" ");

        if(arr.length!= pattern.length())
            return false;

        HashMap<String,Character> mapS = new HashMap<>();
         HashMap<Character,String> mapP = new HashMap<>();


        for(int i=0;i<arr.length;i++){

            String word = arr[i];
            char ch =  pattern.charAt(i);


            if(mapS.containsKey(word)){

                if(mapS.get(word)!= ch)
                    return false;
            }else{
                mapS.put(word,ch);
            }


            if(mapP.containsKey(ch)){
                if(!mapP.get(ch).equals(word))
                    return false;
            }else{
                mapP.put(ch,word);
            }


        }
            return true;


    }
}