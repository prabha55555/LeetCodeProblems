class Solution {
    public boolean isPerfectSquare(int num) {

        int low=0,high=(num/2)+1;

        while(low<=high){
            int mid = low +(high - low)/2;
            long square = (long) mid * mid;

            if(square==num) return true;
            else if(square<num)low=mid+1;
            else high=mid-1;
        }

        return false;


        
    }
}