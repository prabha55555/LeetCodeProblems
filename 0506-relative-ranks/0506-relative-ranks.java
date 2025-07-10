class Solution {
    public String[] findRelativeRanks(int[] score) {
     
    int n =score.length;

     String str[] =new String[n];

     int res[] = Arrays.copyOf(score,n);

     Arrays.sort(res);

     for(int i=0;i<n/2;i++){
        int temp=res[i];
        res[i]=res[n-1-i];
        res[n-1-i]=temp;
     }

     Map<Integer, String> map =new HashMap<>();

     for(int i=0;i<n;i++){
           if(i==0)map.put(res[i],"Gold Medal");
           else if(i==1)map.put(res[i],"Silver Medal");
           else if(i==2)map.put(res[i],"Bronze Medal");
           else map.put(res[i],String.valueOf(i+1));
     }

     for(int i=0;i<n;i++){
        str[i]=map.get(score[i]);
     }

     return str;
    
       

        
        
        
    }
}