class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int result=0;
        int empty=0;
        int fill=numBottles;
        while(fill>0){
            result+=fill;
            empty+=fill;
            fill=empty/numExchange;
            empty=empty%numExchange;
            
        }
        return result;
        
    }
}