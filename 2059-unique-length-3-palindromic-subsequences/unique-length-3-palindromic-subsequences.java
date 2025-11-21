class Solution {
    public int countPalindromicSubsequence(String s) {
        int result = 0;
        for(char c = 'a' ; c<= 'z' ;c++){

            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);

            if(first!= -1 && first<last){

                boolean[] seen = new boolean[26];
                for(int i=first+1; i<last ; i++ ){
                   char ch =      s.charAt(i);
                   seen[ch - 'a'] = true;
                }

                for(Boolean next: seen){
                    if(next)
                        result++;
                }
            }
        }

        return result;
    }
}