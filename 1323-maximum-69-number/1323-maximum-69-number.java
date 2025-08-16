class Solution {
    public int maximum69Number (int num) {
        
        String val= String.valueOf(num);
        
        int max=num;

        for(int i=0;i<val.length();i++){
            char[] arr= val.toCharArray();
            if(arr[i]=='6'){
                arr[i]='9';
                String res=new String(arr);
                max=Math.max(max,Integer.parseInt(res));

            }
        

            
            }
        
        return max;
    }
}