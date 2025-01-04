class Solution {
    public int largestAltitude(int[] gain) {
          
          List<Integer> arr =new ArrayList<>();

          int sum=0;
          arr.add(0);
          for(int num : gain){

            sum +=num;
            arr.add(sum);
          }

          return Collections.max(arr);

          
    }

}