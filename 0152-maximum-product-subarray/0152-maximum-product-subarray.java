class Solution {
    public int maxProduct(int[] nums) {

        int currmax=nums[0];
        int currmin=nums[0];
        int result=nums[0];

        for(int i=1;i<nums.length;i++){
            int temp=currmax;

            currmax=Math.max(Math.max(nums[i],currmax*nums[i]),currmin*nums[i]);
            currmin=Math.min(Math.min(nums[i],temp*nums[i]),currmin* nums[i]);
             result=Math.max(result,currmax);
        }

       
        return result;
        
    }
}