class Solution {
    public int mirrorDistance(int n) {

       String str = String.valueOf(n);

       String rev = "";

       for(int i=str.length()-1;i>=0;i--)
        rev+=str.charAt(i);

 return Math.abs(n-Integer.parseInt(rev));

        
    }

 
}