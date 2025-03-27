class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int maxFreq = 0, reqNum = -1;
        
        // Step 1: Find the most frequent number (dominant element)
        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
            if (mpp.get(num) > maxFreq) {
                maxFreq = mpp.get(num);
                reqNum = num;
            }
        }

        // Step 2: Check for a valid split
        int freq = 0, n = nums.size();
        for (int i = 0; i < n; i++) {
            if (nums.get(i) == reqNum) freq++;
            if (freq * 2 > (i + 1) && (maxFreq - freq) * 2 > (n - i - 1)) return i;
        }
        return -1;
    }
}