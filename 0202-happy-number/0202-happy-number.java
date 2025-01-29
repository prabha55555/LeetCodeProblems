class Solution {
    public boolean isHappy(int n) {
    
      int result=digit(n);
      if(result==1){
        return true;
      }
      else{
        while(result!=1 && result!=4){
            result= digit(result);
        }
      return result==1;
        
    }
    }
    public static int digit(int n){
      
        int val=0;
             while(n!=0){
            int digit=n%10;
            val+=Math.pow(digit,2);
            n=n/10;
        }
        return val;

    }
}
