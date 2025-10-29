class Solution {
    public int smallestNumber(int n) {
      
      int value=0,i=0;

      while(value<n){
        value+=Math.pow(2,i);
        i++;
      }

      return value;


        
    }
}