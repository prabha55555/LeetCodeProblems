class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
          

        int n = tops.length;
        int num1 = tops[0];
        int num2 = bottoms[0];

        int rotateA = 0, rotateB = 0;
        boolean canA = true;
        for (int i = 0; i < n; i++) {
            if (tops[i] != num1 && bottoms[i] != num1) {
                canA = false;
                break;
            }
            if (tops[i] != num1) rotateA++;
            if (bottoms[i] != num1) rotateB++;
        }
        if (canA) return Math.min(rotateA, rotateB);

        
        rotateA = 0;
        rotateB = 0;
        boolean canB = true;
        for (int i = 0; i < n; i++) {
            if (tops[i] != num2 && bottoms[i] != num2) {
                canB = false;
                break;
            }
            if (tops[i] != num2) rotateA++;
            if (bottoms[i] != num2) rotateB++;
        }
        if (canB) return Math.min(rotateA, rotateB);

        return -1;
    
        
    }
}