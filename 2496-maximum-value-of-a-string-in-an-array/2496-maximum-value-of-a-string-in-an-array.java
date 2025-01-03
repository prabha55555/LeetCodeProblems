class Solution {
    public int maximumValue(String[] strs) {

      int max=0;
      for(String str :strs){
        max=Math.max(max,length(str));

      }
      return max;

      
    }
    public static int length(String str){
        for(char ch : str.toCharArray()){
            if(!Character.isDigit(ch))
            return  str.length();
        }
        return Integer.parseInt(str);
    }
}