class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l=0,max=0;
        Set<Character> arr =new HashSet<>();

        for(int r=0;r<s.length();r++){
             while(arr.contains(s.charAt(r))){

                arr.remove(s.charAt(l));
                l++;
             }
             
             arr.add(s.charAt(r));
             max=Math.max(max,r-l+1);
        }
        return max;
        
    }
}