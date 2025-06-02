class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueCount = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueCount - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        
        return uniqueCount;
    }
}
