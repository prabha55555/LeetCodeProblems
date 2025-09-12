class Solution {
    public int findClosest(int x, int y, int z) {

        // int person1Diff=(z<x)?x-z: z-x;
        // int person2Diff=(z<y)?y-z : z-y;

        // int min=Math.min(person1Diff,person2Diff);
        // if(min==person1Diff && min==person2Diff)return  0;
        // else if(min==person1Diff)return 1;
        // else return 2;

         int p=Math.abs(x-z);
        int r=Math.abs(y-z);
        if(p<r)
        return 1;
        else if(p>r)
        return 2;
        return 0;
        



        
    }
}