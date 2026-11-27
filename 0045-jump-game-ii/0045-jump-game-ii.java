class Solution {
    public int jump(int[] nums) {

        int jumps=0;
        int currend=0;
        int farest=0;

        for(int i=0;i<nums.length-1;i++){

            farest=Math.max(farest, i+nums[i]);

            if(currend == i){
                jumps++;
                currend = farest;

            }
        }

        return jumps;


        
    }
}