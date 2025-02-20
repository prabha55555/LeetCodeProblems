class Solution {
    public boolean judgeCircle(String moves) {

       int vert=0,hori=0;

       for(int i=0;i<moves.length();i++){
        if(moves.charAt(i)=='U') vert++;
        else if(moves.charAt(i)=='D')vert--;
        else if(moves.charAt(i)=='L')hori--;
        else if(moves.charAt(i)=='R')hori++;
       }
       return vert ==0 && hori == 0;


    }
}