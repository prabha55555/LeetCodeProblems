class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {

        // int count=0;
        // boolean alter=false;

        // for(int i=0;i<colors.length;i++){
        //     alter=true;
        //     for(int j=i;j<k+i-1;j++){
        //         if(colors[j % colors.length]==colors[(j+1) %colors.length]){
        //             alter=false;
        //             break;
                    
        //         }
        //     }
        //     if(alter){
        //         count++;
        //     }
        // }
        // return count;
        
      int count=0,n=colors.length;
      int valid=1;
       for(int i=1;i<n+k-1;i++){
        if(colors[i % n]!=colors[(i-1 )% n]){
            valid++;
        
        if(valid>=k){
            count++;
        }
       
        }
         else{
            valid=1;
        }
       }
       return count;

    }
}