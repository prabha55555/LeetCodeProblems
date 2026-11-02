class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);

        int sum=0;

        int mid = nums[nums.length /2];


        for(int i : nums){
            sum+=Math.abs(mid - i);
        }

        return sum;
        
    }
}