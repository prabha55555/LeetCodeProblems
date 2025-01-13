class Solution {
    public int missingInteger(int[] nums) {
        
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else break;

        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(sum==nums[j])
                sum++;
            }
        }
        return sum;
         

    }
}