class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int arr1[]= new int [nums1.length];

        for(int i =0;i<nums1.length;i++){
            int num=nums1[i];
            boolean found=false;
            arr1[i]=-1;

            for(int j=0;j<nums2.length;j++){
                if(num==nums2[j]){
                    found=true;
                }
                if( found &&num<nums2[j]){
                    
                    arr1[i]=nums2[j];
                    break;
                }
               

                   
            }
        }
        return arr1;
        
    }
}