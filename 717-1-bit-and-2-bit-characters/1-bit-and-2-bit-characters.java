class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        
        int lastCount = 0;

        for(int i=0; i<bits.length; i++){
            if(bits[i] == 1){
                lastCount = 2;
                i++;

            }else{
                lastCount = 1;
            }

        }

        if(lastCount == 2){
            return false;
        }else
            return true;
    }
}