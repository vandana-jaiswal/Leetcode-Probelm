class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())
            return false;


        HashMap<Character,Character> mapS = new HashMap<>();
        HashMap<Character,Character> mapT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char keyS = s.charAt(i);
            char keyT = t.charAt(i);


            char checkS = mapS.getOrDefault(keyS, '-');
            char checkT = mapT.getOrDefault(keyT, '-');


            if(checkS == '-' && checkT == '-'){
                mapS.put(keyS,keyT);
                mapT.put(keyT,keyS);
            }else if(checkS  !=keyT  || checkT != keyS  ){
                return false;
            }
            
        }

        return true;
    }
}