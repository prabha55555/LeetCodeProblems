class Solution {
    public boolean doesAliceWin(String s) {

        String str = "aeiou";
        int count=0;

        for(char c : s.toCharArray()){
            if(str.indexOf(c)!=-1)count++;
        }



      return count==0?false:true;
        
    }
}