class Solution {
    public int maxFreqSum(String s) {

        int[] arr=new int[26];
        String str="aeiou";

        int maxVowelCount=0;
        int maxConstantCount=0;

        for(char c : s.toCharArray()){
            arr[c-'a']++;
            if(str.indexOf(c)!=-1){
                maxVowelCount=Math.max(maxVowelCount,arr[c-'a']);
            }else{
                maxConstantCount=Math.max(maxConstantCount,arr[c-'a']);
            }
        }

        return maxVowelCount+maxConstantCount;
        
    }
}