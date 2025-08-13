class Solution {
    public int minIncrementForUnique(int[] nums) {

        

        // Set<Integer> arr= new HashSet<>();
        // int count=0;

        // for(int i : nums){
        //     int res=recursive(i);
        //     }
        //     arr.add(i);               Time Limited Exceed 
        // }

        // return count;

    
        Arrays.sort(nums); // Step 1: Sort the array
        int moves = 0;
        int prev = nums[0]; // First element stays as is

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= prev) {
                moves += (prev + 1 - nums[i]); // Increment needed
                nums[i] = prev + 1; // Update to unique
            }
            prev = nums[i]; // Update previous value
        }
        
        return moves;
    }
}

        
    
