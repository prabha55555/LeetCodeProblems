// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count=0,sum=0,l=0;

//         for(int r=0;r<nums.length;r++){
//             sum+=nums[r];

//             while(sum>k  && l<=r){
//                 sum-=nums[l++];
                
//             }
//             if(sum==k)count++;

            
//         }
//         return count;
//     }
// }



import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);

        int count = 0;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;

            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }

            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}