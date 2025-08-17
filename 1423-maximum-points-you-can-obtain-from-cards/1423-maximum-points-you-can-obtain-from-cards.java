class Solution {
    public int maxScore(int[] cardpoints, int k) {

        int leftsum=0,rightsum=0,max=0;

        for(int i=0;i<k;i++){
            leftsum+=cardpoints[i];
            max=leftsum;
        }

        int right=cardpoints.length-1;

        for(int i=k-1;i>=0;i--){

            leftsum-=cardpoints[i];
            rightsum+=cardpoints[right];
            right--;
            max=Math.max(max,leftsum+rightsum);

        }

        return max;

        
    }
}