class Solution {
    public boolean isPalindrome(int x) {
        String a=Integer.toString(x);
        String o="";
        for(int i=a.length()-1;i>=0;i--){
            char ch=a.charAt(i);
            o+=ch;
            }
            return a.equals(o);

        
            
    }
}