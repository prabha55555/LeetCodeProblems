class Solution {
    public int characterReplacement(String s, int k) {
        
        
        HashMap<Character,Integer> arr= new HashMap<>();
          int l=0,ml=0,mf=0;
          for(int r=0;r<s.length();r++){
            arr.put(s.charAt(r),arr.getOrDefault(s.charAt(r),0)+1);
            mf=Math.max(mf,arr.get(s.charAt(r)));

            while((r-l+1) - mf > k){
                arr.put(s.charAt(l),arr.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            ml=Math.max(ml,r-l+1);
          }
          return ml;
    }
}