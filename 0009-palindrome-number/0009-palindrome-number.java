class Solution {
    public boolean isPalindrome(int x) {

        String str = Integer.toString(x);
        String str1 = "";

        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }

        return str.equals(str1);
        
    }
}