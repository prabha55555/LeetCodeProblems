class Solution {
    public int[] closestPrimes(int left, int right) {
        
          int count=1;
        List<Integer> arr=new ArrayList<>();

          for(int i=left;i<=right;i++){
            if(prime(i)){
            arr.add(i);
            }


          }

          if(arr.size()<2) return new int[]{-1,-1};
         int min=Integer.MAX_VALUE, pair1=0,pair2=0;
          for(int i=1;i<arr.size();i++){
            int a =arr.get(i)-arr.get(i-1);
            if(min>a){
                min=a;
                 pair1=arr.get(i-1);
                pair2=arr.get(i);
            }

          
          }
        return new int[] { pair1,pair2};


        

    }


    public static boolean prime(int left){

        if(left<2) return false;

        for(int i =2;i*i<=left;i++){
            if(left%i==0)return false;
        }
        return true;
    }
}