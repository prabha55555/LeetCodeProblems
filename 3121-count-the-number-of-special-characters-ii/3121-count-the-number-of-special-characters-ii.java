class Solution {
    public int numberOfSpecialChars(String word) {

    //     int indexofc=Integer.MAX_VALUE;
    //     int indexofC=Integer.MAX_VALUE;

    //     for(int i=0;i<word.length();i++){
    //         if(word.charAt(i)=='c')
    //           indexofc=i;
    //           if(word.charAt(i)=='C'){
    //             indexofC=i;
    //           }
    //     }

    //     int count=0;

    //     if(indexofc<indexofC){
    //         Set<Character> arr = new HashSet<>();

    //         for(char c : word.toCharArray()){
    //             arr.add(c);
    //         }
    //         int[] check = new int[26];

    //         for(char c : arr){
             
    //          if(c>='a' && c<='z'){
    //             check[c-'a']++;
    //          }
    //          else{
    //             check[c-'A']++;
    //             if(check[c-'A']==2){
    //                 count++;
    //             }
    //          }
                
    //         }
    //     }

        
    //  return count;

    int[] lower = new int[26];
    int[] upper = new int[26];

    Arrays.fill(lower,-1);
    Arrays.fill(upper,-1);

   for(int i=0;i<word.length();i++){

      char ch = word.charAt(i);
        if(ch>='a' && ch<='z'){
            lower[ch-'a']=i;

        }else{
            if(upper[ch-'A']==-1){
                upper[ch-'A']=i;
            }
        }
    }
    int count=0;

    for(int i=0;i<26;i++){
        if(lower[i]!=-1 && upper[i]!=-1 && lower[i]<upper[i]){
            count++;
        }
    }

    return count;

        
    }
}