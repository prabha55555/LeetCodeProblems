class Solution {
    public int smallestIndex(int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(i==check(nums[i])){
                return i;
            }
        }

        return -1;
        
        
    }

    public int check(int a){
        int sum=0;

        int n=a;

        while(n>0){
            sum+=n%10;
            n=n/10;
        }

        return sum;
    }

}