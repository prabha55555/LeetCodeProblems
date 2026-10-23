class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

      String result="";

    

        for( String str : words){
            int sum=0;
            for(int i=0;i<str.length();i++){
                sum+=weights[str.charAt(i) -'a'];

            }
            sum = sum %26;
           char ch = (char) ('z' - sum);
           result+=ch;
           

        }
        return result;


        
    }
}