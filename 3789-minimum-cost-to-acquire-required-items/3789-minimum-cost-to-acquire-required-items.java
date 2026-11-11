class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long phrase1 = (long) cost1 * need1 + (long) cost2 * need2;

        long common = Math.min(need1,need2);

        long phrase2 = common * costBoth + (long) (need1 - common)*cost1 +(long) (need2 - common) * cost2 ;

        long phrase3 =  (long) Math.max(need1, need2) * costBoth;

        return Math.min(phrase1,Math.min(phrase2,phrase3)); 
        
    }
}