class Solution {
    public int singleNumber(int[] nums) {

        if(nums.length ==1)return nums[0];

        HashMap<Integer, Integer> arr =new HashMap<>();

        for(int i : nums){
            arr.put(i,arr.getOrDefault(i,0)+1);
        }

        for(int i : arr.keySet()){
            if(arr.get(i)==1){
                return i;
            }
        }

   return 0;
        
    }
}