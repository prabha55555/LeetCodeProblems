class Solution {
    public String largestGoodInteger(String num) {

        
        int count=1,max=0;
        String val="";

        for(int i =0;i<num.length()-1;i++){
            if(num.charAt(i)==num.charAt(i+1)){
                count++;
                if(count==3){
                   
                     max=Math.max(max,num.charAt(i)-'0');
                     val = String.valueOf(max);

                     
                }


            }
            else{
                count=1;
            }
        }

        return val.repeat(3);
        
    }
}