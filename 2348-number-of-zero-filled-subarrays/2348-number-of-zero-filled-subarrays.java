class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long count=0,result=0;
        for(int a : nums){
            if(a==0)count++;
            else{
                result+=count * (count +1) /2;
                count=0;
            }
        }
        result+=count * (count + 1)/2;
        return result;
    }
}