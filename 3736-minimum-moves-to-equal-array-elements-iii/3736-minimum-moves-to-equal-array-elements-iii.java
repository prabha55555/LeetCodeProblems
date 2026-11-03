class Solution {
    public int minMoves(int[] nums) {

        int max=Integer.MIN_VALUE;

        for(int i : nums){
            if(i>max){
                max=i;
            }
        }

        int sum=0;
        

        for(int i : nums){
            int newMax = max;


            sum+=newMax-i;
            
        }
  return sum;

        
    }
}