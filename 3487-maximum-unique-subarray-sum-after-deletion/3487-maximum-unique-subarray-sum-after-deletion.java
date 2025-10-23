import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        int l = 0;
        int currs = 0;  // Current window sum
        int maxs = 0;   // Maximum sum found
        
        for (int r = 0; r < nums.length; r++) {
            while (arr.contains(nums[r])) {
                arr.remove(nums[l]);
                currs -= nums[l];
                l++;
            }
            
            arr.add(nums[r]);
            currs += nums[r];
            maxs = Math.max(maxs, currs);
        }
        
        return maxs;
    }
}
