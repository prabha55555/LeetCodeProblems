class Solution {
    public int maxFrequency(int[] nums, int k) {

     Arrays.sort(nums);

        long total=0;
        int left=0,max=0;
        for(int r=0;r<nums.length;r++){
            total+=nums[r];

             while((long)nums[r]* (r -left + 1) >k+total){
                total-=nums[left];
                left++;

             }

             max=Math.max(max,r-left+1);



        }
     return max;   
    }
}