class Solution {
    public boolean isAnagram(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        String aa = new String(a);
        String bb = new String(b);

        return aa.equals(bb);


        
    }
}