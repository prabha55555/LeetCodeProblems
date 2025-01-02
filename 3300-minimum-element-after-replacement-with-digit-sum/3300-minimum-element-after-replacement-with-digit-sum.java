class Solution {
    public int minElement(int[] nums) {
    int min=Integer.MAX_VALUE;
    for(int num:nums){
        min=Math.min(min,single(num));

    }
    return min;
        
    }
    public static int single(int num){
        int digit=0;
        while(num>0){
            digit+=num%10;
            num=num/10;
            
        }
        return digit;
    }
}