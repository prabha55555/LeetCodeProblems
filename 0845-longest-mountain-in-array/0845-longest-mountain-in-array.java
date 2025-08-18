class Solution {
    public int longestMountain(int[] arr) {

        int r=0,max=0;
        boolean peak=false,valley=false;

        while(r<arr.length-1){
            if (arr[r]<arr[r+1]){
                int l=r;
            
            while(r<arr.length-1 && arr[r]<arr[r+1] ){
                r++;
                peak=true;
            }
             while(r<arr.length-1 && arr[r]>arr[r+1] ){
                r++;
                valley=true;
            }

            if(peak && valley){
                max=Math.max(max,r-l+1);
            }
            peak=false;
            valley=false;
        }else{
            r++;
        }
        }

        return max;

        
    }
}