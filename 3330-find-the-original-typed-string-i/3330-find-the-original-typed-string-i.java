class Solution {
    public int possibleStringCount(String word) {

            int count=0;
            char prevch=word.charAt(0);

            for(char ch : word.toCharArray()){
                    if(ch==prevch){
                    count++;
                }
                else{
                    prevch=ch;
                }

            }
            return count;


        
    }
}