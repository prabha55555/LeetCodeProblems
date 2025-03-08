class Solution {
    public int longestOnes(int[] nums, int k) {

            int max=0,left=0,zc=0;

            for(int r=0;r<nums.length;r++){
                if(nums[r]==0)zc++;

                while(zc>k){

                   if(nums[left]==0){
                    zc--;
                   }

                    left++;
                }
                max=Math.max(max,r-left+1);
            }



        return max;
    }
}