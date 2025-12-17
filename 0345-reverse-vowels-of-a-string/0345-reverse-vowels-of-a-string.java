class Solution {
    public String reverseVowels(String s) {

        char ch[]=s.toCharArray();

        int st=0;
        int end=s.length()-1;

        String str = "aeiouAEIOUU";

        while(st<end){

            while(st<end && str.indexOf(ch[st])==-1)st++;
            while(st<end && str.indexOf(ch[end])==-1)end--;

            if(st<end){
                char letter = ch[st];
                ch[st]=ch[end];
                ch[end]=letter;
            }
            st++;
            end--;

        }

        return new String(ch);

        
    }
}