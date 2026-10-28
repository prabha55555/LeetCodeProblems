class Solution {
    public long maxTotalValue(int[] nums, int k) {

       int max=0;
       int min=Integer.MAX_VALUE;

       for(int i: nums){
        max=Math.max(i,max);
        min=Math.min(i,min);
       }

       return (long) k*(max-min);
        
    }
}