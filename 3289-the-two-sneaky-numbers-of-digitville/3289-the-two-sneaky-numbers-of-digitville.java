import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // Find the maximum value in nums to determine the size of arr
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
        }
        
        // Initialize the array with size max + 1
        int arr[] = new int[max + 1];

        // Count the occurrences of each number in nums
        for (int i : nums) {
            arr[i]++;
        }

        // Create a list to store the numbers that appear exactly twice
        List<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                arr1.add(i);  // Add the number (not the count)
            }
        }

        // Convert the List to int[] and return it
        return arr1.stream().mapToInt(Integer::intValue).toArray();
    }
}
