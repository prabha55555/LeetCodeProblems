class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int max1=1,max2=1,count1=1,count2=1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                count1++;
                max1=Math.max(count1,max1);
            }else{
                count1=1;
            }
        }

        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                count2++;
                max2=Math.max(count2,max2);
            }else{
                count2=1;
            }
        }

     return Math.max(max1,max2);
        
    }
}