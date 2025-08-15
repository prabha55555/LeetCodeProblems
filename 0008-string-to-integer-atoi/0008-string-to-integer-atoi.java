class Solution {
    public int myAtoi(String s) {

        // String st=s.trim();
        // StringBuilder str = new StringBuilder(st);

        // for(int i=0 ;i<s.length()-1;i++){
        //     if(s.charAt(i)-'0'=='0')str.deleteCharAt(i);
        //     else if(Character.isDigit(s.charAt(i)-'0') > 0)i=s.length()-1;
        // }

        // return str.toString();

        s=s.trim();
        if (s.isEmpty()) return 0;
        int i=0,sign=1,result=0;

        if(s.charAt(i)=='-'|| s.charAt(i)=='+'){
              
                sign=(s.charAt(i)=='-')?-1 :1;
                  i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(result>(Integer.MAX_VALUE-digit)/10){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;

            }
            result=result*10+digit;
            i++;
        }
        return sign*result;

        
    }
}