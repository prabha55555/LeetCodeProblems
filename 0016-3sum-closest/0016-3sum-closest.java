class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);


        int min=Integer.MAX_VALUE,answer=0;

        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
            
                if(sum==target)return target;

                int distance = Math.abs(sum-target);

                if(distance<min){
                    min=distance;
                    answer= sum;
                }

                
                if(sum<target)j++;
                else k--;          
                
            }

        }

        return answer;
        
    }
}