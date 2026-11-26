class Solution {
    public int characterReplacement(String s, int k) {

        int max=0;

        for(char target ='A';target <='Z';target++){
             int left=0;
             int changesNeeded=0;

             for(int right =0;right<s.length();right++){
               
               if(s.charAt(right)!=target)changesNeeded++;

               while(changesNeeded>k){
                   if(s.charAt(left)!=target){
                      changesNeeded--;
                   }
                   left++;
               }

               max=Math.max(max, right -left +1);

             }
        }

        return max;
        
    }
}