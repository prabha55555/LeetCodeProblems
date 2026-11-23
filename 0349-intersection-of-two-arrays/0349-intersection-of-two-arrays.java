class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        
        HashSet<Integer> arr1 = new HashSet<>();
        HashSet<Integer> arr2 = new HashSet<>();

        for(int i : nums1){
            arr1.add(i);
        }
        for(int i : nums2){
        if(arr1.contains(i)){
            arr2.add(i);
        }
        }

        int[] arr = new int[arr2.size()];
       int i=0;
       for(int num:arr2){
        arr[i++]=num;
       }
        return arr;
       
        
    }
}