class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max=0;
        int arr[]=new int [candies.length];
        for(int num : candies){
            max=Math.max(num , max);
        }
        List<Boolean> arrs = new ArrayList<>();
          for(int num : candies){
            if(num + extraCandies >=max){
                arrs.add(true);
            }
            else
               arrs.add(false);
          }
          return arrs;

            
        }
        
    }
