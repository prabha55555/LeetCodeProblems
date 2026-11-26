class Solution {
    public int compress(char[] chars) {

        int count=1;
        String result="";

        if(chars.length==1)return 1;

        for(int i=1;i<chars.length;i++){

            if(chars[i-1]==chars[i]){
                count++;
            }else{
                result+=chars[i-1];
                if(count>1){
                result+=String.valueOf(count);
                }
                count=1;
            }

        }
          result+=chars[chars.length-1];
             if(count>1){
                result+=String.valueOf(count);
                }

        for(int i=0;i<result.length();i++){
            chars[i]=result.charAt(i);
        }

               

        return result.length();

        
    }
}