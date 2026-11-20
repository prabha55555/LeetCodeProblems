class Solution {
    public boolean isAnagram(String s, String t) {

        char[] a1 =  s.toCharArray();
        char[] a2 =  t.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        String s1 = new String(a1);
        String s2 = new String(a2);

        return s1.equals(s2);
        
    }
}