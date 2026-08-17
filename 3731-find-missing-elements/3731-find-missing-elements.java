class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Set<Integer> arr = new HashSet<>();

        List<Integer> res = new ArrayList<>();
    
        Arrays.sort(nums);

        for(int i : nums){
            arr.add(i);
        }

        for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
            if(!arr.contains(i)){
                res.add(i);
            }
        }
        

        return res;

        
    }
}