class Solution {
    public boolean reorderedPowerOf2(int n) {
         char arr[]= Integer.toString(n).toCharArray();
          Arrays.sort(arr);
        

        String val =new String(arr);      
        for(int i=1;i<=1000000000;i=i*2){
            char arr1[]=Integer.toString(i).toCharArray();
             Arrays.sort(arr1);
            if(val.equals(new String(arr1)))return true;
        }

        return false;

    }
}