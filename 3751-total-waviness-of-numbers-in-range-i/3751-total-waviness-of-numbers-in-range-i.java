class Solution {
    public int totalWaviness(int num1, int num2) {


        int count=0;
       

        for(int i=num1;i<=num2;i++){
            String str = String.valueOf(i);

            for(int j=1;j<str.length()-1;j++){
                boolean ispeak=false;
                boolean isvalley=false;
                char previous = str.charAt(j-1);
                char current = str.charAt(j);
                char next = str.charAt(j+1);

                if(current>previous && current > next){
                    ispeak=true;
                }
                if(current<previous && current< next){
                    isvalley=true;
                }

                if(ispeak || isvalley){
                    count++;
                }

                
            }
            
        }

        return count;
        
    }
}