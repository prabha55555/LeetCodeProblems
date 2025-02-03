class Solution {
    public int majorityElement(int[] nums) {

        int count[]=new int[nums.length+1];

        for(int i : nums){
            count[i]++;

        }  
        int max=0,number=0;
        for(int i=1;i<count.length;i++){
            if(count[i]>max){
            max=count[i];
            number=i;
            }
        }      
        return number;
    }
}