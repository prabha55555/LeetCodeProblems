class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

       Map<Integer,Integer> map =new TreeMap<>();

       for(int i=0;i<nums1.length;i++){
         map.put(nums1[i][0],nums1[i][1]);
       }

       for(int i=0;i<nums2.length;i++){
        if(map.containsKey(nums2[i][0])){
            map.put(nums2[i][0],map.get(nums2[i][0])+nums2[i][1]);
        }
        else{
            map.put(nums2[i][0],nums2[i][1]);
        }
       }
          
          int arr1[][]=new int [map.size()][2];
          int j=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            arr1[j][0]=entry.getKey();
            arr1[j++][1]=entry.getValue();
        }
       

       return arr1;

         
       
            
        
    }
}