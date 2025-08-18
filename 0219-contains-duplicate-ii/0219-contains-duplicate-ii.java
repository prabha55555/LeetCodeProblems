class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        // if(nums.length==1 )return false;
        //   int val=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j] && i!=j){
        //             val=Math.abs(i-j);
        //             if(val<=k)return true;
        //         }
        //     }
        // }

        // return false;

        HashSet<Integer> arr= new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(arr.contains(nums[i]))return true;

            arr.add(nums[i]);

            if(arr.size()>k){
                arr.remove(nums[i-k]);
            }
        }   
        return false; 
    }
}