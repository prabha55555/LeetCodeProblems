class Solution {
    public int maxSubArray(int[] nums) {

        int  currsum=0,max=Integer.MIN_VALUE;

        for(int i : nums){
            currsum+=i;
            if(currsum>max)max=currsum;

            if(currsum<0){
                currsum=0;
            }
        }
        return max;

        
    }
}