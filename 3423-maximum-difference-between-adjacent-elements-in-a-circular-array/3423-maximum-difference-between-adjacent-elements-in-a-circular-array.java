class Solution {
    public int maxAdjacentDistance(int[] nums) {
          int n=nums.length;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                int a=Math.abs(nums[i]- nums[(i+1) % n]);
                if(max<a)
                max=a;
            }
            return max;

        
    }
}