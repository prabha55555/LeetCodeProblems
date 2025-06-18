class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;

                int k=j+1,r=n-1;

                while(k<r){
                    long sum =(long) nums[i]+nums[j]+nums[k]+nums[r];
                    if(sum>target)r--;
                    else if(sum<target)k++;
                    else{
                        arr.add(Arrays.asList(nums[i],nums[j],nums[k],nums[r]));

                        k++;r--;
                        while(k<r&& nums[k]==nums[k-1])k++;
                        while(k<r&& nums[r]==nums[r+1])r--;

                    }
                }
               
            }
        }
         return arr;
        
    }
}