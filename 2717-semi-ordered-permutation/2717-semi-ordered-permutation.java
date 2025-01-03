class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int count=0;
        int n=nums.length;
        if(nums[0]==1 && nums[n-1]==n)
        return 0;
        for(int i=0;i<n-1;i++){

            if(nums[i]>nums[i+1]){
               
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
                count++;
                i=-1;
            }

        }
        return count>0 ? count : 0;
        
    }
}