class Solution {
    public boolean isOneBitCharacter(int[] bits) {

        // if(bits.length==1 && bits[0]==0)return true; 
        
        // return bits[bits.length-1]==0 &&  bits[bits.length-2]==0 ;

        int i=0;

        while(i<bits.length-1){
            if(bits[i]==1)i+=2;
            else i++;
        }

        return i==bits.length-1;
    }
}