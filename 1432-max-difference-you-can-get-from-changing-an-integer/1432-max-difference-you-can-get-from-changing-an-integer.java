class Solution {
    public int maxDiff(int num) {

        String str = Integer.toString(num);

        // --- MAX ---
        char cmax = ' ';
        char arr[] = str.toCharArray();

        for (char ch : arr) {
            if (ch != '9') {
                cmax = ch;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == cmax) {
                arr[i] = '9';
            }
        }

        int max = Integer.parseInt(new String(arr));

        // --- MIN ---
        char cmin = ' ';
        char arr2[] = str.toCharArray();

        if (arr2[0] != '1') {
            cmin = arr2[0];

            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == cmin) {
                    arr2[i] = '1';
                }
            }
        } else {
            for (int i = 1; i < arr2.length; i++) {
                if (arr2[i] != '0' && arr2[i] != '1') {
                    cmin = arr2[i];
                    break;
                }
            }

            for (int i = 1; i < arr2.length; i++) {
                if (arr2[i] == cmin) {
                    arr2[i] = '0';
                }
            }
        }

        int min = Integer.parseInt(new String(arr2));

        return max - min;
    }
}
