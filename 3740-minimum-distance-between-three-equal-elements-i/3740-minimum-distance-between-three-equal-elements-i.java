class Solution {
    public int minimumDistance(int[] nums) {

        int min=Integer.MAX_VALUE,count=0;

        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        count++;
                       min = Math.min(min,Math.abs(i - j) + (Math.abs(j - k) + Math.abs(k - i)));
                       
                    }
                }
            }
        }
        return count>0? min : -1;
        
    }
}