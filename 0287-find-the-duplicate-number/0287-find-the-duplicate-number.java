class Solution {
    public int findDuplicate(int[] nums) {

        // Set<Integer> arr =new HashSet<>();

        // for(int i : nums){
        //     if(arr.contains(i))return i;
        //     arr.add(i);
        // }

        // return -1;

        for(int i : nums){
          i=Math.abs(i);
          if(nums[i-1]<0)return i;
          nums[i-1]*=-1;
        }

        return -1;
        
    }
}