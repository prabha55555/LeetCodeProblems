class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> res = new HashSet<>();

        int l=0,max=0;

        for(int i=0;i<s.length();i++){
            while(res.contains(s.charAt(i))){
                res.remove(s.charAt(l));
                l++;

            }
            res.add(s.charAt(i));
            max=Math.max(max,i-l+1);
        }

        return max;
        
    }
}