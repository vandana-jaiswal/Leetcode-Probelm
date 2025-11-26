class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);

        StringBuilder sb = new StringBuilder();

        if(strs.length == 1){
            return strs[0];
        }

        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        int len = Math.min(s1.length(),s2.length());

        

        for(int i=0; i<len;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                return sb.toString();
            }
        }

        if(sb.length()>0){
            return sb.toString();
        }
        return "";

    }
}