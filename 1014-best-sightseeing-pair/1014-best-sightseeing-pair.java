class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans=0;
       int max=values[0];
       for(int i=1;i<values.length;i++){
             
            ans= Math.max(ans,max+values[i]-i);
            max=Math.max(max,values[i]+i);


        }return ans;
       }
       
        
    
}