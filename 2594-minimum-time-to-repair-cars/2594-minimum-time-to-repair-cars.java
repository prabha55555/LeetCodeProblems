class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);

        long l=1;
        long r = (long) ranks[ranks.length - 1] * (long) cars * cars;

         while(l<r){
            long mid=l+(r-l)/2;

            if(valid(ranks,cars,mid)){
                r=mid;
            }
            else{
                l=mid+1;
            }

         }
         return l;
        

    }
    private boolean valid(int []ranks,int cars,long mid){
        long count=0;

        for(int i : ranks){
        count += (long) Math.sqrt((double) mid / i);
        }
        return count>=cars ;        
    }
}