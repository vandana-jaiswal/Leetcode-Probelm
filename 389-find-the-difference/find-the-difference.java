class Solution {
    public char findTheDifference(String s, String t) {
        
        int [] arr = new int[26];

        for(char e :s.toCharArray()){
           arr [e-'a']++;
        }

        for(char c: t.toCharArray()){
            arr[c-'a']-- ;

            if(arr[c-'a']<0){
                return c;
            }
        }

        return ' ';

        

        
    }
}