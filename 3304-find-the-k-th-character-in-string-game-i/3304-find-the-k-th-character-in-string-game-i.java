class Solution {
    public char kthCharacter(int k) {


        String str="a";

        while(str.length()<k){

            StringBuilder next =new StringBuilder();
            
            for(char ch:str.toCharArray()){
                next.append((char)(ch+1));
            }

            str=str + next.toString();
        }


        return str.charAt(k-1);
        
    }
}