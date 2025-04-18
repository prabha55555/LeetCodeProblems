class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstname(nums, target);
        int second = secondname(nums, target);
        return new int[]{first, second};
    }

    public static int firstname(int[] nums, int target) {
        int l = 0, h = nums.length - 1, result = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                result = mid;
                h = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return result;
    }

    public static int secondname(int[] nums, int target) {
        int l = 0, h = nums.length - 1, result = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                result = mid;
                l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return result;
    }
}
