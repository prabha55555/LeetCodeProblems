class Solution {
    public int[] searchRange(int[] nums, int target) {

        int firstPos = firstName(nums,target);
        int secondPos = secondName(nums,target);
        return new int[]{firstPos,secondPos};

    }
    public int firstName(int[] nums , int target){
        int l=0,h=nums.length-1,result=-1;

        while(l<=h){
            int mid = l+(h-l)/2;

            if(nums[mid]==target){
                result=mid;
                h=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return result;
    }
    public int secondName(int[] nums , int target){
        int l=0,h=nums.length-1,result=-1;

        while(l<=h){
            int mid = l+(h-l)/2;

            if(nums[mid]==target){
                result=mid;
                l=mid+1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return result;
    }
}