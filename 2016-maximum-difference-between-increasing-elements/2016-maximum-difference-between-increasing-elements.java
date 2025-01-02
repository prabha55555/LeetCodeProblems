class Solution {
    public int maximumDifference(int[] nums) {
        int total=0;
        int max=-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    total=Math.abs(nums[j]-nums[i]);
                     if(total>max)
                        max=total;

                }
               
              

            }
        }
        return max;
        
    }
}