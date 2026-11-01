class Solution {
    public int minMoves(int[] nums) {

        int sum=0;
        int min=nums[0];

        for(int i : nums){
            sum+=i;

            if(i<min){
                min =i;
            }
        }

        return sum - (nums.length * min);

       
        
    }
}