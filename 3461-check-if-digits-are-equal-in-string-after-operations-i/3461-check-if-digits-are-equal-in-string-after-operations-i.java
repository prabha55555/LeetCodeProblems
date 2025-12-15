class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        while (n > 2) {
            for (int i = 0; i < n - 1; i++) {
                // int a = Character.getNumericValue();
                int a = (sb.charAt(i) - '0' + sb.charAt(i + 1) - '0') % 10;
                sb.insert(i, a);
                sb.deleteCharAt(i + 1);
            }
            sb.deleteCharAt(n - 1);
            n--;
        }
        return (sb.charAt(0) == sb.charAt(1)) ? true : false;
    }
}