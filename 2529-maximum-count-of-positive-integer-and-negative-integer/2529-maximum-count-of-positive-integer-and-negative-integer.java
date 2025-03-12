class Solution {
    public int maximumCount(int[] nums) {
        
    //   int count1=0,count2=0;

    //   for(int i=0;i<nums.length;i++){
    //     if(nums[i]>0){
    //         count1++;
    //     }
    //     else if(nums[i]<0){
    //         count2++;
    //     }
    //   }
    //         return Math.max(count1,count2);
    // }
     int i=0,count=0,n=nums.length,count1=0;
    while(nums[i]<=0 && i<n){
        if(nums[i]<0){
              count++;      
        }
         i++;
        }

        int pos=n-i;

    return Math.max(count,pos);
}
}