import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {

        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && i != k) {
                        int a = digits[i];
                        int b = digits[j];
                        int c = digits[k];

                        if (a != 0 && c % 2 == 0) {
                            int num = a * 100 + b * 10 + c;
                            result.add(num);
                        }
                    }
                }
            }
        }

        int[] output = new int[result.size()];
        int index = 0;

        for (int num : result) {
            output[index++] = num;
        }

        Arrays.sort(output); 
        return output;
    }
}
