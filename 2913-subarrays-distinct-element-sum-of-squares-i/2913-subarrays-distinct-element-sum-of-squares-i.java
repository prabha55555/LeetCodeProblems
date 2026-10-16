class Solution {
    public int sumCounts(List<Integer> nums) {

        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            Set<Integer> arr = new HashSet<>();

            for (int j = i; j < nums.size(); j++) {
                arr.add(nums.get(j));
                sum += Math.pow(arr.size(), 2);
            }
        }

        return sum;

    }
}