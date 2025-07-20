class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int result[]=new int [2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         int sum=nums[i]+nums[j];
        //         if(i!=j && sum==target){
        //             result[0]=i;
        //             result[1]=j;
        //             return result;
        //         }
        //     }
        // }
        // return result;

        HashMap<Integer,Integer>  hm = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int complement = target-nums[i];

            if(hm.containsKey(complement))return new int[]{hm.get(complement),i};

            hm.put(nums[i],i);
        }   

        return null;     
    }
}
