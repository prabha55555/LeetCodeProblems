

class Solution {
    public int maximumCandies(int[] candies, long k) {



        Arrays.sort(candies);
        int sum=0;

        for(int i : candies){

                    sum+=i;
               }

               
 return (int)(sum-k)/(int)k;  
    
        }



}