class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
         List<List<Integer>> result = new ArrayList<>();

         for(int i=1;i<arr.length;i++){
            int diff=arr[i]-arr[i-1];
            if(diff<min){
                min=diff;
                result = new ArrayList<>();
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }
        else if(diff==min)
                result.add(Arrays.asList(arr[i-1],arr[i]));
         }




            


             
       
    return result;
        
    }
}