class Solution {
    public int minimumCost(int[] cost) {

        // int count=0,sum=0;

        // Arrays.sort(cost);

        // for(int i=cost.length-1;i>=0;i--){
        //     count++;

        //     if(count==3){
        //         count=0;
        //     }else{
        //         sum+=cost[i];
        //     }
        // }
        // return sum;

        Arrays.sort(cost);

        int total=0;

        for(int i=cost.length-1;i>=0;i-=3){
            total+=cost[i];
            if(i-1>=0)total+=cost[i-1];
        }

        return total;
    }
}