class Solution {
    public boolean divideArray(int[] nums) {

        HashMap<Integer,Integer> arr = new HashMap<>();

        for(int i=0;i<nums.length;i++){
                arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
        }

        for(int i : arr.values()){
            if(i%2!=0){
                return false;
            }
        }
        return true;
        
    }
}