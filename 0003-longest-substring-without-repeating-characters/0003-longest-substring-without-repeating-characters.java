class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> arr = new HashSet<>();

        int l=0,max=0;

        for(int i=0;i<s.length();i++){
            while(arr.contains(s.charAt(i))){
                arr.remove(s.charAt(l));
                l++;
            }

            arr.add(s.charAt(i));
            max=Math.max(max,i-l+1);
        }

        return max;




        
    }
}