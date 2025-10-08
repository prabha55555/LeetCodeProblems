class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int[] arr=new int[spells.length];

        

        // for(int i=0;i<spells.length;i++){
        //     int count=0;
        //     for(int j=0;j<potions.length;j++){

        //         if(spells[i] * potions[j]>=success)count++;
        //     }

        //     arr[i]=count;
        // }

        // return arr;


      

       Arrays.sort(potions);

       for(int i=0;i<spells.length;i++){
        
             int left=0,right=potions.length-1,firstmeet=potions.length;

             while(left <=right){
                int mid =(left + right)/2;
                long product =(long) spells[i] * potions[mid];

                if(product>=success){
                    firstmeet=mid;
                    right=mid-1;
                }
                else left=mid+1;
             }

             arr[i]=potions.length - firstmeet;
       }

       return arr;
        
    }
}