class Solution {
    public int search(int[] nums, int target) {
         
    //      int result=-1;
    //    for(int i=0;i<nums.length;i++){
    //          if(nums[i]==target){
    //             result=i;
    //             return result;
    //          }
    //    }  

    //    return result;  

   int l=0,h=nums.length-1,result=-1;

   while(l<=h){
    int mid=l+(h-l)/2;
    if(nums[mid]==target){
        result=mid;
        return result;
    }
    if(nums[l]<=nums[mid]){

        if(nums[l]<=target && target<nums[mid]){
            h=mid-1;
        }
        else{
            l=mid+1;
        }


    }
    else{
        if(nums[mid]<target && target<=nums[h]){
            l=mid+1;
        }
        else{
            h=mid-1;
        }
    }
   }

   return -1;

        
    }
}