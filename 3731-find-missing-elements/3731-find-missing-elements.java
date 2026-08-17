class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        // Set<Integer> arr = new HashSet<>();

        // List<Integer> res = new ArrayList<>();
    
        // Arrays.sort(nums);

        // for(int i : nums){
        //     arr.add(i);
        // }

        // for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
        //     if(!arr.contains(i)){
        //         res.add(i);
        //     }
        // }
        

        // return res;

        List<Integer> res =new ArrayList<>();

        int min =nums[0],max=nums[0];

        for(int i : nums ){
            min=Math.min(min,i);
            max=Math.max(max,i);
            
        }

        for(int i =min;i<=max;i++){
            boolean found = false;

            for(int j : nums){
                if(j==i){
                    found = true;
                    break;
                }
                
            }
            if(!found){
                    res.add(i);
                }
        }

        return res;

        
    }
}