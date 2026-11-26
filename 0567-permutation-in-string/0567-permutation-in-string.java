class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] needed = new int[26];
        int[] window = new int[26];
        int size= s1.length();

        for(int i=0;i<s1.length();i++){
            needed[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            window[s2.charAt(i)-'a']++;

            if(i>=size){
                window[s2.charAt(i-size)-'a']--;
            }
            if(Arrays.equals(needed,window))return true;
        }

        return false;
        
        
    }
}