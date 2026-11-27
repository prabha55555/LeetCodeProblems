class Solution {
    public int rob(int[] nums) {

        if(nums.length ==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);

        int[] dp = new int [nums.length];

        int n= nums.length;

        dp[0]=nums[0];

        dp[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++){

            int take= nums[i] + dp[i-2];

            int skip = dp[i-1];

            dp[i]=Math.max(take,skip);
        }

        return dp[n-1];
        
    }
}