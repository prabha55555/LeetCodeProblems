class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int count=0;
        int n=nums.length;
        if(nums[0]==1 && nums[n-1]==n)
        return 0;
        int a=-1,b=-1;
       for(int i=0;i<n;i++ ){
        if(nums[i]==1)
        a=i;
        if(nums[i]==n)
        b=i;

       }
       return a < b ? a + (n - b - 1) : a + (n - b - 1) - 1;        
    }
}