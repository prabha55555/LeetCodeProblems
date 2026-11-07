class Solution {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length-1];


        int result = gcd(min,max);

        return result;

    }

    public int gcd(int a,int b){
        if(b==0){
            return a;
          
        }
         else return gcd(b,a%b); 
    }

}