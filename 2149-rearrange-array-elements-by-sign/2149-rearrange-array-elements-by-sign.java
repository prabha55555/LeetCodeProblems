class Solution {
    public int[] rearrangeArray(int[] nums) {

        int indexp=0,indexn=1;

        int res[]=new int[nums.length];

        for(int i : nums){
                
                if(i>0){
                    
                    res[indexp]=i;
                    indexp+=2;
                }
                else{
                    
                    res[indexn]=i;
                    indexn+=2;
                }
        }
        return res;
        
    }
}